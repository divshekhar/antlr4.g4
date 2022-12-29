lexer grammar CalculatorLexerRules;

// Token rules
ID: [a-zA-Z]+; // Identifiers
INT: [0-9]+; // Integers
NEWLINE: '\r'? '\n'; // Newline
WS: [ \t]+ -> skip; // skip whitespaces