// Generated from java-escape by ANTLR 4.11.1

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ExpressionParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ExpressionParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExpressionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExpressionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExpressionParser.ExpressionContext ctx);
}