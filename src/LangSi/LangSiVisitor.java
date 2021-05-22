// Generated from D:/Users/Alex/IdeaProjects/Compile/src/LangSi\LangSi.g4 by ANTLR 4.9.1
package LangSi;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangSiParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangSiVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangSiParser#compileUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompileUnit(LangSiParser.CompileUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(LangSiParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(LangSiParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#blockFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockFunc(LangSiParser.BlockFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LangSiParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#returnFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunc(LangSiParser.ReturnFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#funcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncName(LangSiParser.FuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#consts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsts(LangSiParser.ConstsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypes(LangSiParser.TypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(LangSiParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(LangSiParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#callFunctionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionList(LangSiParser.CallFunctionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(LangSiParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#argsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsList(LangSiParser.ArgsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(LangSiParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#varName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarName(LangSiParser.VarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LangSiParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangSiParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintLiteral}
	 * labeled alternative in {@link LangSiParser#printList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintLiteral(LangSiParser.PrintLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintVar}
	 * labeled alternative in {@link LangSiParser#printList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVar(LangSiParser.PrintVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#ifCondtion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondtion(LangSiParser.IfCondtionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(LangSiParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LangSiParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#breakContinue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakContinue(LangSiParser.BreakContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#whileCicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCicle(LangSiParser.WhileCicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(LangSiParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(LangSiParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#logicExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExprList(LangSiParser.LogicExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpConclusion(LangSiParser.ExpConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualsConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualsConclusion(LangSiParser.EqualsConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreThenConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreThenConclusion(LangSiParser.MoreThenConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThenConclusion}
	 * labeled alternative in {@link LangSiParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThenConclusion(LangSiParser.LessThenConclusionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SummExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummExpression(LangSiParser.SummExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarNameExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarNameExpression(LangSiParser.VarNameExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(LangSiParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(LangSiParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFuncExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFuncExpression(LangSiParser.CallFuncExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipliesExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipliesExpression(LangSiParser.MultipliesExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssigmentExpression}
	 * labeled alternative in {@link LangSiParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigmentExpression(LangSiParser.AssigmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LangSiParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#intLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(LangSiParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(LangSiParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#charLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(LangSiParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangSiParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(LangSiParser.FloatLiteralContext ctx);
}