grammar Hello; // Grammar Definition for Hello
// Match the string 'Hello' followed by an identifier
r: 'hello' ID;
// Match lower case letters
ID: [a-z]+;
// Ignore whitespace
WS: [\t\r\n]+ -> skip;
