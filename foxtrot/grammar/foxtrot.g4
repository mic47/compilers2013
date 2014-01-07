grammar foxtrot;

init: statements;

statements: statement (NEWLINE statement)*;

statement:
        VAR (var_declaration | array_declaration) SEMICOLON                                                                                                 # Declare
        | lvalue op=(ASGN | INCR) expression SEMICOLON                                                                                                      # Assign
        | WHILE LB condition RB NEWLINE* LCB statements RCB                                                                                                 # While
        | IF LB condition RB NEWLINE* LCB tr=statements RCB (NEWLINE* ELSE NEWLINE* LCB fa=statements RCB)?                                                 # If
        | DEF return_type identifier LB (argument(COMMA argument)*)? RB LCB statements (RETURN expression SEMICOLON NEWLINE*)? RCB  # Def
        | function_call SEMICOLON                                                                                                                           # Call
        | NEWLINE*                                                                                                                                          # Newline
        ;

var_declaration: var_type identifier                                            # DeclareVar; 
array_declaration: TYPE_INT LSB expression (COMMA expression)* RSB identifier   # DeclareArray;
var_type: (TYPE_INT | TYPE_STRING);
identifier: STRING;
arity: INT;
argument: var_type (LSB arity RSB)? identifier;
            
lvalue:
        identifier
        | identifier LSB expression (COMMA expression)* RSB;


condition:
        op=NOT condition                                    # Not
        | condition op=AND condition                        # And
        | condition op=OR condition                         # Or
        | expression op=(LEQ|EQ|GEQ|NEQ|LT|GT) expression   # Comp
        ;

return_type:
        VOID
        | var_type
        ;

function_call: identifier LB (expression (COMMA expression)*)? RB;

expression:
        op=(SUB|ADD) expression                              # Una
        | expression op=(DIV | MUL | MOD) expression         # Mul
        | expression op=(ADD | SUB) expression               # Add
        | LB expression RB                                   # Par
        | identifier LSB expression (COMMA expression)* RSB  # Idx
        | function_call                                      # Func
        | identifier                                         # Var
        | INT                                                # Int
        | STRING_LITERAL                                     # Str
        ;

VOID:        'void';
RETURN:      'return';
DEF:         'def';
IF:          'if';
ELSE:        'else';
WHILE:       'while';
VAR:         'var';
TYPE_INT:    'int';
TYPE_STRING: 'string';
NOT:         'not';
MUL:    '*';
MOD:    '%';
DIV:    '/';
ADD:    '+';
SUB:    '-';
EXP:    '^';
EQ:     '==';
NEQ:    '!=';
LEQ:    '<=';
GEQ:    '>=';
LT:     '<';
GT:     '>';
COMMA:  ',';
AND:    '&&';
OR:     '||';
DOUBLE_QUOTE: '"';
LB:     '(';
RB:     ')';
LCB:    '{';
RCB:    '}';
LSB:    '[';
RSB:    ']';
ASGN:   '=';
INCR:   '+=';
SEMICOLON: ';';
INT:    [0-9]+;
STRING: [a-zA-Z_][a-zA-Z0-9_]*;
WHITESPACE:     [ \t] -> skip;
//LINE_COMMENT:   '#' ~( '\r' | '\n' )* -> skip;
NEWLINE: ( '\r'? '\n' | '\r' );
STRING_LITERAL: '"' ~('"')* '"';
