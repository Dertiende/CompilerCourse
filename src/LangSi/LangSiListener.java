// Generated from D:/Users/Alex/IdeaProjects/Compile/src/LangSi\LangSi.g4 by ANTLR 4.9.1
package LangSi;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangSiParser}.
 */
public interface LangSiListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangSiParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(LangSiParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(LangSiParser.CompileUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(LangSiParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(LangSiParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LangSiParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LangSiParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#blockFunc}.
	 * @param ctx the parse tree
	 */
	void enterBlockFunc(LangSiParser.BlockFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#blockFunc}.
	 * @param ctx the parse tree
	 */
	void exitBlockFunc(LangSiParser.BlockFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LangSiParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LangSiParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunc(LangSiParser.ReturnFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#returnFunc}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunc(LangSiParser.ReturnFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(LangSiParser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(LangSiParser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(LangSiParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(LangSiParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(LangSiParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(LangSiParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(LangSiParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(LangSiParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LangSiParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LangSiParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#callFunctionList}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionList(LangSiParser.CallFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#callFunctionList}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionList(LangSiParser.CallFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(LangSiParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(LangSiParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#argsList}.
	 * @param ctx the parse tree
	 */
	void enterArgsList(LangSiParser.ArgsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#argsList}.
	 * @param ctx the parse tree
	 */
	void exitArgsList(LangSiParser.ArgsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(LangSiParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(LangSiParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(LangSiParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(LangSiParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LangSiParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LangSiParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LangSiParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LangSiParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintLiteral}
	 * labeled alternative in {@link LangSiParser#printList}.
	 * @param ctx the parse tree
	 */
	void enterPrintLiteral(LangSiParser.PrintLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintLiteral}
	 * labeled alternative in {@link LangSiParser#printList}.
	 * @param ctx the parse tree
	 */
	void exitPrintLiteral(LangSiParser.PrintLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintVar}
	 * labeled alternative in {@link LangSiParser#printList}.
	 * @param ctx the parse tree
	 */
	void enterPrintVar(LangSiParser.PrintVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintVar}
	 * labeled alternative in {@link LangSiParser#printList}.
	 * @param ctx the parse tree
	 */
	void exitPrintVar(LangSiParser.PrintVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LangSiParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LangSiParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(LangSiParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(LangSiParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#logicExprList}.
	 * @param ctx the parse tree
	 */
	void enterLogicExprList(LangSiParser.LogicExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#logicExprList}.
	 * @param ctx the parse tree
	 */
	void exitLogicExprList(LangSiParser.LogicExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterExpConclusion(LangSiParser.ExpConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitExpConclusion(LangSiParser.ExpConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualsConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualsConclusion(LangSiParser.EqualsConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualsConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualsConclusion(LangSiParser.EqualsConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MoreThenConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterMoreThenConclusion(LangSiParser.MoreThenConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MoreThenConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitMoreThenConclusion(LangSiParser.MoreThenConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThenConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLessThenConclusion(LangSiParser.LessThenConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThenConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLessThenConclusion(LangSiParser.LessThenConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SummExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSummExpression(LangSiParser.SummExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SummExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSummExpression(LangSiParser.SummExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarNameExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarNameExpression(LangSiParser.VarNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarNameExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarNameExpression(LangSiParser.VarNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(LangSiParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(LangSiParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(LangSiParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(LangSiParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFuncExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallFuncExpression(LangSiParser.CallFuncExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFuncExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallFuncExpression(LangSiParser.CallFuncExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipliesExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultipliesExpression(LangSiParser.MultipliesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipliesExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultipliesExpression(LangSiParser.MultipliesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssigmentExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssigmentExpression(LangSiParser.AssigmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssigmentExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssigmentExpression(LangSiParser.AssigmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LangSiParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LangSiParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(LangSiParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#intLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(LangSiParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(LangSiParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(LangSiParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void enterCharLiteral(LangSiParser.CharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#charLiteral}.
	 * @param ctx the parse tree
	 */
	void exitCharLiteral(LangSiParser.CharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangSiParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(LangSiParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangSiParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(LangSiParser.FloatLiteralContext ctx);
}