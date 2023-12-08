// Generated from C:/Users/daniel.o.martins/Documents/Faculdade/src/main/antlr4/Grammar.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(GrammarParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(GrammarParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(GrammarParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(GrammarParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(GrammarParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(GrammarParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statementEnd}.
	 * @param ctx the parse tree
	 */
	void enterStatementEnd(GrammarParser.StatementEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statementEnd}.
	 * @param ctx the parse tree
	 */
	void exitStatementEnd(GrammarParser.StatementEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(GrammarParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(GrammarParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(GrammarParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(GrammarParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(GrammarParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(GrammarParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(GrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(GrammarParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#doWhileLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(GrammarParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#caculatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaculatorStatement(GrammarParser.CaculatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#caculatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaculatorStatement(GrammarParser.CaculatorStatementContext ctx);
}