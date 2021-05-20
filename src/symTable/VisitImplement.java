package symTable;

import Components.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Stack;
import Compile.Compile;
import LangSi.LangSiBaseVisitor;
import LangSi.LangSiParser;

public class VisitImplement extends LangSiBaseVisitor<Node> {
    ArrayList<ArrayList> funcList = new ArrayList<>();
    ArrayList<String> oneFuncList = new ArrayList<>();
    Table consts = null;
    Table func = null;
    Table top = null;
    Table saved = null;
    int used = 0;

    void error(String s) {throw new Error(s);}
    @Override
    public Node visitConsts(LangSiParser.ConstsContext ctx) {

        consts = new Table(null);
        Stack <Stmt> stack = new Stack<>();
        for (int i=0;i<ctx.variableDeclaration().size();i++){
            String name = ctx.variableDeclaration(i).varName().getText();
            Id id = consts.get(name);
            if (id == null) {
                Types type = Types.getType(ctx.variableDeclaration(i).types().getText());
                String val = ctx.variableDeclaration(i).expr().toString();
                ObjConst cnst = new ObjConst(name,type,val);
                consts.put(name,new Id(name,type,0));
                consts.print("con");
                stack.push((Stmt) cnst);

            }
            else error(ctx.start.getText()+" already exists");
        }
        if (stack.size()>1){
            Stmt stmt1 = stack.pop();
            Seq seq = new Seq(stack.pop(),stmt1);
            while (!stack.empty()) {
                seq = new Seq(stack.pop(),stmt1);
            }

            return seq;
        }
        else {
            consts.print("consts");
            //System.out.println(top.toString());
            return stack.pop();}
    }

    @Override
    public Node visitFunction (LangSiParser.FunctionContext ctx){
        Types t =Types.getType(ctx.types().getText());
        String funcName = ctx.funcName().getText();
        oneFuncList.add(ctx.types().getText());
        oneFuncList.add(funcName);
        //func.put(funcName,id);
        System.out.println("args "+oneFuncList);

        Table savedTable = top;
        top = new Table(top);
        for (int i = 0;i<ctx.argsList().children.size();i=i+2){
            System.out.println("print f "+ctx.argsList().children.get(i).getChild(1).getText());
            oneFuncList.add(ctx.argsList().children.get(i).getChild(0).getText());
            Types p = Types.getType(ctx.argsList().children.get(i).getChild(0).getText());
            Id id = new Id(ctx.argsList().children.get(i).getChild(1).getText(),p,used++);
            top.put(ctx.argsList().children.get(i).getChild(1).getText(),id);
        }
        funcList.add(oneFuncList);
        Stmt s = (Stmt) visit(ctx.blockFunc());
        return s;
    }

    @Override
    public Node visitBlockFunc (LangSiParser.BlockFuncContext ctx){
        top.print("topBFS");
        Table savedTable = top;
        top = new Table(top);
        Stack<Stmt> stack = new Stack<>();

        for (int i = 0; i < ctx.statement().size(); i++) {
            System.out.println("BlockFunc "+ctx.statement(i).getText());
            stack.push((Stmt) visit(ctx.statement(i)));
        }
        //Seq seq = new Seq(stack.pop(), );
        Seq seq = new Seq((Stmt) visit(ctx.returnFunc()), Stmt.Null);
        while (!stack.empty()) {
            seq = new Seq(stack.pop(), seq);
        }


        Stmt s = seq;
        top.print("topFunc");
        top = savedTable;
        return s;
    }


    @Override
    public Node visitBlock(LangSiParser.BlockContext ctx) {
        Table savedTable = top;
        top = new Table(top);

        // проход по всем Stmt и объединение их в Seq(Stmt1, Seq(Stmt2, Seq(Stmt3, Stmt.Null)))
        Stack<Stmt> stack = new Stack<>();

        for (int i = 0; i < ctx.statement().size(); i++) {
            System.out.println(ctx.statement(i).getText());
            stack.push((Stmt) visit(ctx.statement(i)));
        }
        Seq seq = new Seq(stack.pop(), Stmt.Null);
        while (!stack.empty()) {
            seq = new Seq(stack.pop(), seq);
        }

        Stmt s = seq;
        //consts.print("consts");
        top.print("top");
        top = savedTable;
        //consts.print("consts");

        //System.out.println(top.toString());
        return s;
    }



    @Override
    public Node visitStatement(LangSiParser.StatementContext ctx) {
        return visit(ctx.getChild(0));
    }


    @Override
    public Node visitCompileUnit(LangSiParser.CompileUnitContext ctx) {


        Stack<Stmt> allFunc = new Stack<>();
        Stmt func = (Stmt) visit(ctx.function());
        allFunc.push(func);
        Stmt main = (Stmt)visit(ctx.main());

        // jvm код
        Compile t = new Compile(main,funcList,allFunc);
        t.generateClass(new File("test.class"));

        return main;
    }


    @Override
    public Node visitMain(LangSiParser.MainContext ctx) {
        top = new Table(consts);
        return visit(ctx.block());
    }


    @Override
    public Node visitVariableDeclaration(LangSiParser.VariableDeclarationContext ctx) {
        String varName = ctx.varName().getText();
        Types p = Types.getType(ctx.types().getText());
        if (p == null) error(ctx.start.getLine() + ": " + varName + " null type exception");
        Id id = new Id(varName, p, ++used);
        top.put(varName, id);
        if (ctx.expr() != null) {
            Expr x = (Expr) visit(ctx.expr());
            top.put(varName, id);
            top.print("topVarDec");
            return new Declare(id, x);
        }
        return new Declare(id);
    }
    @Override
    public Node visitReturnFunc (LangSiParser.ReturnFuncContext ctx){
        if (ctx.varName()!=null)
        {
            System.out.println("varname"+ctx.varName().getText());
            Id id = top.get(ctx.varName().getText());
            System.out.println(id.offset);
            return new Return(id);
        }
        else error("return field is empty");
        return Node.Null;
    }

    @Override
    public Node visitCallFunction(LangSiParser.CallFunctionContext ctx) {
        ArrayList<callFuncArgs> callArgs= new ArrayList<>();

        for (int i =0;i<ctx.callFunctionList().size();i++){

            if (ctx.callFunctionList(i).varName()!= null){
                String varName = ctx.callFunctionList(i).varName().getText();
                Id id = top.get(varName);
                callArgs.add(new callFuncArgs(id,null));
                new callFuncArgs(id);

            }
            else{
                Expr e = null;
                System.out.println("callf"+ctx.callFunctionList(i).literal().getText());
                if (ctx.callFunctionList(i).literal().intLiteral()!=null){
                    String name = ctx.callFunctionList(i).literal().getText();
                    e = new Expr(name,Types.Int);
                    callArgs.add(new callFuncArgs(null,e));
                }
                if (ctx.callFunctionList(i).literal().floatLiteral()!=null){
                    String name = ctx.callFunctionList(i).literal().getText();
                    e = new Expr(name,Types.Float);
                    callArgs.add(new callFuncArgs(null,e));
                }
                if (ctx.callFunctionList(i).literal().boolLiteral()!=null){
                    String name = ctx.callFunctionList(i).literal().getText();
                    e = new Expr(name,Types.Bool);
                    callArgs.add(new callFuncArgs(null,e));
                }

                //Expr e = new Expr(ctx.callFunctionList(i).literal().);
            }
        }
        return new callFunc(callArgs);
    }

    @Override
    public Node visitPrintVar (LangSiParser.PrintVarContext ctx){
        String s = ctx.varName().getText();
        Id id = top.get(s);
        if( id == null ) error( ctx.start.getLine() + ": " + s + " undeclared");
        return id;
    }

    @Override
    public Node visitPrintLiteral (LangSiParser.PrintLiteralContext ctx){
        return visitChildren(ctx);
    }

    @Override
    public Node visitPrint(LangSiParser.PrintContext ctx) {

        return new Print((Expr)visit(ctx.printList()));
    }


    @Override
    public Node visitWhileStatement(LangSiParser.WhileStatementContext ctx) {
        Expr x = (Expr)visit(ctx.logicExprList());
        Stmt s1 = (Stmt) visit(ctx.block());
        return new While(x, s1);
    }

    @Override
    public Node visitExprList(LangSiParser.ExprListContext ctx) {
        Stack<Expr> e = new Stack<>();
        for (int i = 0; i < ctx.expr().size(); i++)
            e.push((Expr) visit(ctx.expr(i)));
        Expr x1, x2;
        if (e.size() > 1) {
            x1 = e.pop();
            x2 = e.pop();
        } else return new Print(e.pop());
        EList p = new EList(x2, x1);
        while (!e.empty())
            p = new EList(e.pop(), p);
        return new Print(p);
    }

    @Override
    public Node visitIfStatement(LangSiParser.IfStatementContext ctx) {
        Expr x; Stmt s1, s2;
        x = (Expr) visit(ctx.logicExprList());
        s1 = (Stmt) visit(ctx.block());

        return new If(x, s1);
    }

    @Override
    public Node visitLogicExprList(LangSiParser.LogicExprListContext ctx) {
        Expr x = (Expr)visit(ctx.logicExpr(0));
        if (ctx.logicExpr().size() > 1) {
            for (int i = 1; i < ctx.logicExpr().size(); i++) {
                switch (ctx.pob.getText()) {
                    case "and":
                        x = new And("and", x, (Expr) visit(ctx.logicExpr(i)));
                    case "or":
                        x = new Or("or", x, (Expr) visit(ctx.logicExpr(i)));
                }
            }
        }
        return x;
    }


    @Override
    public Node visitEqualsConclusion(LangSiParser.EqualsConclusionContext ctx) {
        return new Rel(ctx.op.getText(), (Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)));
    }

    @Override
    public Node visitLessThenConclusion(LangSiParser.LessThenConclusionContext ctx) {
        return new Rel(ctx.op.getText(), (Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)));
    }

    @Override
    public Node visitMoreThenConclusion(LangSiParser.MoreThenConclusionContext ctx) {
        return new Rel(ctx.op.getText(), (Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)));
    }


    @Override
    public Node visitAssignment(LangSiParser.AssignmentContext ctx) {
        String varName = ctx.varName().getText();
        Id id = top.get(varName);
        if( id == null ) error(  ctx.start.getLine() + ": " + varName + " undeclared");
        Expr x = (Expr) visit(ctx.expr());
        if ( x == null ) error( ctx.start.getLine() + ": " + " bad expression");
        return new Set(id, x);
    }


    @Override
    public Node visitLiteralExpression(LangSiParser.LiteralExpressionContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public Node visitVarNameExpression(LangSiParser.VarNameExpressionContext ctx) {
        String s = ctx.varName().getText();
        Id id = top.get(s);
        if( id == null ) error( ctx.start.getLine() + ": " + s + " undeclared");
        return id;
    }


    @Override
    public Node visitCharLiteral(LangSiParser.CharLiteralContext ctx) {
        return new Constant(ctx.LETTERS().getText(), Types.Char);
    }


    @Override
    public Node visitIntLiteral(LangSiParser.IntLiteralContext ctx) {
        return new Constant(ctx.getText(), Types.Int);
    }


    @Override
    public Node visitBoolLiteral(LangSiParser.BoolLiteralContext ctx) {
        switch (ctx.getText()) {
            case "true":
                return Constant.True;
            case "false":
                return Constant.False;
        }
        return null;
    }

    @Override
    public Node visitParenExpression(LangSiParser.ParenExpressionContext ctx) {
        return (Expr) visit(ctx.expr());
    }

    @Override
    public Node visitMultipliesExpression(LangSiParser.MultipliesExpressionContext ctx) {
        return new Arith(ctx.op.getText(), (Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)));
    }

    @Override
    public Node visitSummExpression(LangSiParser.SummExpressionContext ctx) {
        return new Arith(ctx.op.getText(), (Expr) visit(ctx.expr(0)), (Expr) visit(ctx.expr(1)));
    }

    @Override
    public Node visitFloatLiteral(LangSiParser.FloatLiteralContext ctx) {
        return new Constant(ctx.getText(), Types.Float);
    }

}
