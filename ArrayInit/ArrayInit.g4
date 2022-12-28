grammar ArrayInit; // Grammar name 

// Init rule is the start rule Takes list of values
init: '{' value (',' value)* '}';

// Value rule is an integer or a nested list of values
value: init | INT;

// INT Token definitions
INT: [0-9]+;

// WS Token definitions, Remove whitespace
WS: [ \t\r\n]+ -> skip;
