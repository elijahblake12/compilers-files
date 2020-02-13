lexer grammar Little;

WS : [ \t\r\n]+ -> skip ;
FLOATLITERAL : [0-9]* '.' [0-9]+ ;
INTLITERAL : [0-9]+ ;
COMMENT : '--' ~( '\r' | '\n' )* ;
KEYWORD : 'PROGRAM' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' | 'ENDIF' | 'WHILE' | 'ENDWHILE' | 'CONTINUE' | 'BREAK' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' ;
OPERATOR : ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=' ;
STRINGLITERAL : '"' (~[\r\n"] | '""')* '"' ;
ID : ([a-z] | [A-Z] | '_')+ ([0-9] | [a-z] | [A-Z])* ;

