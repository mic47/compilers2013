grammar jazzik;

@lexer::members {
    public boolean failed = false;
        public int errcount = 0;

    @Override
    public void recover(RecognitionException e) {
        failed = true;
        ++errcount;
        super.recover(e);
    }

    @Override
    public void recover(LexerNoViableAltException e) {
        failed = true;
        ++errcount;
        super.recover(e);
    }
}

init: funcdecls;

funcdecls: (NEWLINE* funcdecl)* NEWLINE*;
     
funcdecl:
    type=('void'|'int'|'bool') name=ID '(' args=funcargdecls? ')' block     # FuncDef
    | 'extern' type=('void'|'int') name=ID '(' args=funcargdecls? ')'       # FuncExtern
    ;
funcargdecls:
    funcargdecl (',' funcargdecl)*                                  # FuncArgDecls
    ;
funcargdecl:
    type=('int'|'int[]'|'bool') name=ID                             # FuncArgDecl
    ;
    
block:
    NEWLINE* '{' (NEWLINE* statement (NEWLINE+ statement)*)? NEWLINE* '}' NEWLINE*
    ;

statement: 
    assignment                                                      # Assign
    | vardecl                                                       # VarDecl
    | 'write' writearg (',' writearg)*                              # Write
    | 'read' readarg (',' readarg)*                                 # Read
    | forstatement                                                  # ForStm
    | ifstatement                                                   # IfStm
    | 'return' expression?                                          # ReturnInt
    | expression                                                    # Expr
    | 'break' { notifyErrorListeners("break statement is not supported"); }         # ErrorBreak
    | 'continue' { notifyErrorListeners("continue statement is not supported"); }   # ContinueError
    | funcdecl { notifyErrorListeners("nested functions are not allowed"); }        # ErrorNested
    ;

expression:
    op=('!'|'~'|'+'|'-') expression                                 # Una
    | expression op=('/'|'*'|'%') expression                        # Mul
    | expression op=('&'|'|'|'^') expression                        # Bin
    | expression op=('+'|'-') expression                            # Add
    | expression op=('=='|'!='|'>'|'<'|'>='|'<=') expression        # Cmp
    | expression op=('&&'|'||') expression                          # Log
    | '(' expression ')'                                            # Par
    | 'size' '(' ID ')'                                             # Size
    | ID '(' funcargs? ')'                                          # FuncCall
    | (INT|TRUE|FALSE)                                              # IntConstant
    | varaccess                                                     # Vars
    ;

writearg:
    ID                              # WriteID
    | expression                    # WriteInt
    | STRING                        # WriteStr
    ;

readarg:
    ID '[' expression ']'           # ReadArray
    | ID                            # ReadInt
    ;

funccall:
    ID '(' funcargs? ')'
    ;
funcargs:
    funcarg (',' funcarg)*
    ;
funcarg:
    ID                              # FuncArgID
    | expression                    # FuncArgExpr
    ;

vardecl:
    ('int'|'bool') intvardecl (',' intvardecl)*
    ;
intvardecl:
    name=ID ('=' expression)?       # IntDecl
    | name=ID '[' expression ']'    # ArrayDecl
    ;

varaccess:
    ID                              # VarAccess
    | ID '[' expression ']'         # ArrayAccess   
    ;

assignment:
    name=ID '=' expression                                          # AssignInt
    | name=ID '[' index=expression ']' '=' value=expression         # AssignArray
    ;
    
ifstatement:
    'if' expression block ('else' block)?                           # If
    | 'unless' expression block ('else' block)?                     # Unless
    ;
    
forstatement:
    'for' ID 'in' expression rtype=('..'|'...') expression block    # For
    | 'for' ID 'in' ID block                                        # ForEach
    | 'while' expression block                                      # While
    ;

INT: [0-9]+;
STRING: '"' ~('\r'|'\n'|'"')* '"';
TRUE: 'true';
FALSE: 'false';

ASSIGN: '=';
COMMA: ',';
COLON: ':';
QMARK: '?';

INC: '++';
DEC: '--';
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
MOD: '%';

EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';

NEG: '!';
AND: '&&';
IAND: '&';
OR: '||';
IOR: '|';
IXOR: '^';
INEG: '~';

ARRAY_TYPE: 'int[]';
INT_TYPE: 'int';
BOOL_TYPE: 'bool';
VOID_TYPE: 'void';

SIZE: 'size';
IF: 'if';
UNLESS: 'unless';
ELSE: 'else';
FOR: 'for';
IN: 'in';
WHILE: 'while';
EXTERN: 'extern';
READ: 'read';
WRITE: 'write';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';

ID: [a-zA-Z][a-zA-Z0-9_]*;

BLOCK_BEGIN: '{';
BLOCK_END: '}';
PAREN_BEGIN: '(';
PAREN_END: ')';
ARRAY_BEGIN: '[';
ARRAY_END: ']';

INC_RANGE: '..';
EXC_RANGE: '...';

NEWLINE: '\r'? '\n';
WHITESPACE: [ \t] -> skip;
