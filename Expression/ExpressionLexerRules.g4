lexer grammar ExpressionLexerRules;

// Token rules
ID: [a-zA-Z0-9_]+; // Identifiers
INT: [0-9]+; // Integers
NEWLINE: '\r'? '\n'; // Newline
WS: [ \t]+ -> skip; // skip whitespaces