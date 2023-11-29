grammar Grammar;
//Lexer
TYPE : 'int' | 'double' | 'String';
ID : [a-z][A-Z_]*;
INT : [0-9]+;
DOUBLE : [0-9]+ '.' [0-9]+ | '.' [0-9]+ | [0-9]+ '.';
STRING : '"' .*? '"';
PLUS : '+';
MINUS: '-';
MULTPLY: '*';
DIVISION: '/';
ASSING : '=';
EQUALS : '==';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
DO : 'do';
SEMICOLON : ';';
NOTEQUAL : '!=';
LT : '<';
LTEQUAL : '<=';
GT : '>';
GTEQUAL : '>=';
PRINT : 'print';
WRITE : 'write';

NEWLINE : [\r\n]+ -> skip;
WS : [ \t\r\n]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;

//Parser
program : (statement)* EOF;

statement : assignment
          | variableAssignment
          | ifStatement
          | printStatement
          | writeStatement
          | expression
          | whileLoop
          | doWhileLoop
          ;

var : INT | DOUBLE | STRING;

operators : PLUS | MINUS | MULTPLY | DIVISION;

compare : EQUALS | NOTEQUAL | LT | LTEQUAL | GT | GTEQUAL;

ifBlock : IF '(' condition ')' '{' statement+ '}';

elseBlock : (ELSE '{' statement+ '}')?;

statementEnd : SEMICOLON;

assignment  : TYPE ID ASSING expression statementEnd;

variableAssignment  : ID ASSING expression statementEnd;

expression  : ID (operators ID)* | var (operators var)* | var | ID ;

condition   : ID ( compare ) ID | var ( compare ) var;

printStatement : PRINT '(' expression ')' statementEnd;

writeStatement : TYPE ID WRITE '(' expression ')' statementEnd;

ifStatement : ifBlock elseBlock;

whileLoop   : WHILE '(' condition ')' '{' statement+ '}';

doWhileLoop : DO '{' statement+ '}' WHILE '(' condition ')' statementEnd;