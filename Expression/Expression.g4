grammar Expression;
import ExpressionLexerRules;

// Start rule; program is a list of statements
program: statement+;

// Statement rule; statement is either an expression or an assignment
statement:
	expression NEWLINE
	| ID '=' expression NEWLINE
	| NEWLINE;

/*
 Expression rule; expression is either a binary operation or a number or an ID or aparenthesized
 expression
 */
expression:
	expression ('*' | '/') expression
	| expression ('+' | '-') expression
	| INT
	| ID
	| '(' expression ')';

