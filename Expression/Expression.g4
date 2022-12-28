grammar Expression;

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

// Token rules
ID: [a-zA-Z0-9_]+; // Identifiers
INT: [0-9]+; // Integers
NEWLINE: '\r'? '\n'; // Newline
WS: [ \t]+ -> skip; // skip whitespaces