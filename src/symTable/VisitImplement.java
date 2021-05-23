package symTable;

import Components.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Stack;
import Compile.Compile;
import LangSi.LangSiBaseVisitor;
import LangSi.LangSiParser;
import org.objectweb.asm.Label;

public class VisitImplement extends LangSiBaseVisitor<Node> {
    ArrayList<ArrayList> funcList = new ArrayList<>();
    ArrayList<String> oneFuncList;
    ArrayList<Stmt> allFunc = new ArrayList<>();
    Table func = new Table(null);
    Table top = null;
    public static Label start = null;
    public static Label end = null;
    While savedW = null;
    While w = null;
    int used = 0;
    int usedF = 0;

    void error(String s) {throw new Error(s);}

    @Override
    public Node visitFunction (LangSiParser.FunctionContext ctx){
        used = 0;
        Types t =Types.getType(ctx.types().getText());
        String funcName = ctx.funcName().getText();
        oneFuncList = new ArrayList<>();
        oneFuncList.add(ctx.types().getText());
        oneFuncList.add(funcName);
        //func.put(funcName,id);
        //System.out.println("args "+oneFuncList);

        Table savedTable = top;
        //System.out.println("used "+used);
        Id funcID = new Id(funcName,t,usedF++);
        func.put(funcName,funcID);
        //func.print("func list");
        top = new Table(top);
        for (int i = 0;i<ctx.argsList().children.size();i=i+2){
            //System.out.println("print f "+ctx.argsList().children.get(i).getChild(1).getText());
            oneFuncList.add(ctx.argsList().children.get(i).getChild(0).getText());
            Types p = Types.getType(ctx.argsList().children.get(i).getChild(0).getText());
            //System.out.println("used "+used);
            Id id = new Id(ctx.argsList().children.get(i).getChild(1).getText(),p,used++);
            //System.out.println("used "+used);
            top.put(ctx.argsList().children.get(i).getChild(1).getText(),id);
        }
        funcList.add(oneFuncList);
        Stmt s = (Stmt) visit(ctx.blockFunc());
        return s;
    }

    @Override
    public Node visitBlockFunc (LangSiParser.BlockFuncContext ctx){
        //top.print("topBFS");
        Table savedTable = top;
        top = new Table(top);
        Stack<Stmt> stack = new Stack<>();

        for (int i = 0; i < ctx.statement().size(); i++) {
            //System.out.println("BlockFunc "+ctx.statement(i).getText());
            stack.push((Stmt) visit(ctx.statement(i)));
        }
        //Seq seq = new Seq(stack.pop(), );
        Seq seq = new Seq((Stmt) visit(ctx.returnFunc()), Stmt.Null);
        while (!stack.empty()) {
            seq = new Seq(stack.pop(), seq);
        }


        Stmt s = seq;
        //top.print("topFunc");
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
            //System.out.println(ctx.statement(i).getText());
            stack.push((Stmt) visit(ctx.statement(i)));
        }
        Seq seq = new Seq(stack.pop(), Stmt.Null);
        while (!stack.empty()) {
            seq = new Seq(stack.pop(), seq);
        }

        Stmt s = seq;
        //consts.print("consts");
        //top.print("top");
        top = savedTable;

        //consts.print("consts");

        //System.out.println(top.toString());
        return s;
    }



    @Override
    public Node visitStatement(LangSiParser.StatementContext ctx) {
        While savedW = w;
        Node k =  visit(ctx.getChild(0));
        //w = savedW;
        return k;
    }


    @Override
    public Node visitCompileUnit(LangSiParser.CompileUnitContext ctx) {


        Stmt func = null;
        //System.out.println("Size "+ ctx.function().size());
        for (int i = 0; i < ctx.function().size(); i++) {
            func = (Stmt) visit(ctx.function(i));
            allFunc.add(func);
            }
            Stmt main = (Stmt) visit(ctx.main());

            // jvm код
            Compile t = new Compile(main, funcList, allFunc);
            t.generateClass(new File("test.class"));

            return main;

    }

    @Override
    public Node visitMain(LangSiParser.MainContext ctx) {
        return visit(ctx.block());
    }


    @Override
    public Node visitVariableDeclaration(LangSiParser.VariableDeclarationContext ctx) {
        String varName = ctx.varName().getText();
        Types p = Types.getType(ctx.types().getText());
        if (p == null) error(ctx.start.getLine() + ": " + varName + " null type exception");
        Id id = new Id(varName, p, used++);
        top.put(varName, id);
        if (ctx.expr() != null) {
            Expr x = (Expr) visit(ctx.expr());
            return new Declare(id, x);
        }
        return new Declare(id);
    }
    @Override
    public Node visitReturnFunc (LangSiParser.ReturnFuncContext ctx){
        if (ctx.varName()!=null)
        {
            //System.out.println("varname"+ctx.varName().getText());
            Id id = top.get(ctx.varName().getText());
            //System.out.println(id.offset);
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
                //System.out.println("callf"+ctx.callFunctionList(i).literal().getText());
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
        Id fId = func.get(ctx.funcName().getText());
        //System.out.println("fName "+fId.op + fId.type.type);
        return new callFunc(callArgs,ctx.funcName().getText(), fId);
    }

    @Override
    public Node visitCallFuncExpression (LangSiParser.CallFuncExpressionContext ctx){


        Id id;
        //func.print("func list upd");
        //System.out.println("func name "+ctx.children.get(0).getChild(0).getText());
        String fName = ctx.children.get(0).getChild(0).getText();
        Types t = func.get(ctx.children.get(0).getChild(0).getText()).type;
        id = new Id (fName,t,used++);
        Expr x = new Expr(fName,t);
        //return Node.Null;
        return visit(ctx.callFunction());
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
    public Node visitWhileCicle (LangSiParser.WhileCicleContext ctx) {

        Expr x = (Expr)visit(ctx.logicExprList());
        Stmt s1 = (Stmt) visit(ctx.whileBlock());
         w = new While(x,s1);
        return w;
    }

    @Override
    public Node visitWhileBlock (LangSiParser.WhileBlockContext ctx){
        Stack<Stmt> stack = new Stack<>();

        for (int i = 0; i < ctx.whileStatement().size(); i++) {
            //System.out.println(ctx.whileStatement(i).getText());
            stack.push((Stmt) visit(ctx.whileStatement(i)));
        }
        Seq seq = new Seq(stack.pop(), Stmt.Null);
        while (!stack.empty()) {
            seq = new Seq(stack.pop(), seq);
        }

        Stmt s = seq;
        //top.print("top");

        //System.out.println(top.toString());
        return s;
    }
    @Override
    public Node visitWhileStatement (LangSiParser.WhileStatementContext ctx){
        return visit(ctx.getChild(0));
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
    public Node visitIfCondtion(LangSiParser.IfCondtionContext ctx) {
        Expr x; Stmt s1, s2;
        x = (Expr) visit(ctx.logicExprList());
        s1 = (Stmt) visit(ctx.ifBlock());

        return new If(x, s1);
    }

    @Override
    public Node visitIfBlock (LangSiParser.IfBlockContext ctx){
        Stack<Stmt> stack = new Stack<>();

        for (int i = 0; i < ctx.ifStatement().size(); i++) {
            //System.out.println(ctx.ifStatement(i).getText());
            stack.push((Stmt) visit(ctx.ifStatement(i)));
        }
        Seq seq = new Seq(stack.pop(), Stmt.Null);
        while (!stack.empty()) {
            seq = new Seq(stack.pop(), seq);
        }

        Stmt s = seq;
        //consts.print("consts");
        //top.print("top");

        //consts.print("consts");

        //System.out.println(top.toString());
        return s;
    }

    @Override
    public Node visitIfStatement (LangSiParser.IfStatementContext ctx){
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitBreakContinue (LangSiParser.BreakContinueContext ctx){
        String s = ctx.children.get(0).getText();
        //System.out.println("Brk "+ctx.children.get(0).getText());
        return new BreakContinue(s);
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
        //System.out.println("Asign " + varName);
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
