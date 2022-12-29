grammar Calculator;
import CalculatorLexerRules;

@header {
package antlr;
}

// Start rule; program is a list of statements
program: statement+;

// Statement rule; statement is either an expression or an assignment
statement:
	expression NEWLINE			# printExpression
	| ID '=' expression NEWLINE	# assignExpression
	| NEWLINE					# blankExpression;

/*
 Expression rule; expression is either a binary operation or a number or an ID or aparenthesized
 expression
 */
expression:
	expression op = ('*' | '/') expression		# MulDiv
	| expression op = ('+' | '-') expression	# AddSub
	| INT										# int
	| ID										# id
	| '(' expression ')'						# parens;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';

