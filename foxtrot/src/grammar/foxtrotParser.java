// Generated from grammar/foxtrot.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class foxtrotParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, RETURN=2, DEF=3, IF=4, ELSE=5, WHILE=6, VAR=7, TYPE_INT=8, TYPE_STRING=9, 
		NOT=10, MUL=11, MOD=12, DIV=13, ADD=14, SUB=15, EXP=16, EQ=17, NEQ=18, 
		LEQ=19, GEQ=20, LT=21, GT=22, COMMA=23, AND=24, OR=25, DOUBLE_QUOTE=26, 
		LB=27, RB=28, LCB=29, RCB=30, LSB=31, RSB=32, ASGN=33, INCR=34, SEMICOLON=35, 
		INT=36, STRING=37, WHITESPACE=38, NEWLINE=39, STRING_LITERAL=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'void'", "'return'", "'def'", "'if'", "'else'", "'while'", 
		"'var'", "'int'", "'string'", "'not'", "'*'", "'%'", "'/'", "'+'", "'-'", 
		"'^'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "','", "'&&'", "'||'", 
		"'\"'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "'+='", "';'", 
		"INT", "STRING", "WHITESPACE", "NEWLINE", "STRING_LITERAL"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_var_declaration = 3, 
		RULE_array_declaration = 4, RULE_var_type = 5, RULE_identifier = 6, RULE_arity = 7, 
		RULE_argument = 8, RULE_lvalue = 9, RULE_condition = 10, RULE_return_type = 11, 
		RULE_function_call = 12, RULE_expression = 13;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "var_declaration", "array_declaration", 
		"var_type", "identifier", "arity", "argument", "lvalue", "condition", 
		"return_type", "function_call", "expression"
	};

	@Override
	public String getGrammarFileName() { return "foxtrot.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public foxtrotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(foxtrotParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(foxtrotParser.NEWLINE, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); statement();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(31); match(NEWLINE);
				setState(32); statement();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareContext extends StatementContext {
		public Array_declarationContext array_declaration() {
			return getRuleContext(Array_declarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(foxtrotParser.SEMICOLON, 0); }
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public TerminalNode VAR() { return getToken(foxtrotParser.VAR, 0); }
		public DeclareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewlineContext extends StatementContext {
		public List<TerminalNode> NEWLINE() { return getTokens(foxtrotParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(foxtrotParser.NEWLINE, i);
		}
		public NewlineContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public Token op;
		public TerminalNode INCR() { return getToken(foxtrotParser.INCR, 0); }
		public TerminalNode SEMICOLON() { return getToken(foxtrotParser.SEMICOLON, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASGN() { return getToken(foxtrotParser.ASGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public List<TerminalNode> NEWLINE() { return getTokens(foxtrotParser.NEWLINE); }
		public TerminalNode WHILE() { return getToken(foxtrotParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LB() { return getToken(foxtrotParser.LB, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(foxtrotParser.NEWLINE, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(foxtrotParser.RB, 0); }
		public TerminalNode RCB() { return getToken(foxtrotParser.RCB, 0); }
		public TerminalNode LCB() { return getToken(foxtrotParser.LCB, 0); }
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(foxtrotParser.SEMICOLON, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public StatementsContext tr;
		public StatementsContext fa;
		public List<TerminalNode> NEWLINE() { return getTokens(foxtrotParser.NEWLINE); }
		public TerminalNode IF() { return getToken(foxtrotParser.IF, 0); }
		public TerminalNode RCB(int i) {
			return getToken(foxtrotParser.RCB, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LB() { return getToken(foxtrotParser.LB, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(foxtrotParser.NEWLINE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public TerminalNode ELSE() { return getToken(foxtrotParser.ELSE, 0); }
		public TerminalNode RB() { return getToken(foxtrotParser.RB, 0); }
		public TerminalNode LCB(int i) {
			return getToken(foxtrotParser.LCB, i);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> RCB() { return getTokens(foxtrotParser.RCB); }
		public List<TerminalNode> LCB() { return getTokens(foxtrotParser.LCB); }
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(foxtrotParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(foxtrotParser.NEWLINE, i);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LCB() { return getToken(foxtrotParser.LCB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(foxtrotParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(foxtrotParser.NEWLINE); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public TerminalNode LB() { return getToken(foxtrotParser.LB, 0); }
		public TerminalNode DEF() { return getToken(foxtrotParser.DEF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RB() { return getToken(foxtrotParser.RB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(foxtrotParser.COMMA); }
		public TerminalNode RETURN() { return getToken(foxtrotParser.RETURN, 0); }
		public TerminalNode RCB() { return getToken(foxtrotParser.RCB, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38); match(VAR);
				setState(41);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(39); var_declaration();
					}
					break;

				case 2:
					{
					setState(40); array_declaration();
					}
					break;
				}
				setState(43); match(SEMICOLON);
				}
				break;

			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45); lvalue();
				setState(46);
				((AssignContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASGN || _la==INCR) ) {
					((AssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(47); expression(0);
				setState(48); match(SEMICOLON);
				}
				break;

			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50); match(WHILE);
				setState(51); match(LB);
				setState(52); condition(0);
				setState(53); match(RB);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(54); match(NEWLINE);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60); match(LCB);
				setState(61); statements();
				setState(62); match(RCB);
				}
				break;

			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64); match(IF);
				setState(65); match(LB);
				setState(66); condition(0);
				setState(67); match(RB);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(68); match(NEWLINE);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74); match(LCB);
				setState(75); ((IfContext)_localctx).tr = statements();
				setState(76); match(RCB);
				setState(94);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(77); match(NEWLINE);
						}
						}
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(83); match(ELSE);
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(84); match(NEWLINE);
						}
						}
						setState(89);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(90); match(LCB);
					setState(91); ((IfContext)_localctx).fa = statements();
					setState(92); match(RCB);
					}
					break;
				}
				}
				break;

			case 5:
				_localctx = new DefContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(96); match(DEF);
				setState(97); return_type();
				setState(98); identifier();
				setState(99); match(LB);
				setState(108);
				_la = _input.LA(1);
				if (_la==TYPE_INT || _la==TYPE_STRING) {
					{
					setState(100); argument();
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(101); match(COMMA);
						setState(102); argument();
						}
						}
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(110); match(RB);
				setState(111); match(LCB);
				setState(112); statements();
				setState(122);
				_la = _input.LA(1);
				if (_la==RETURN) {
					{
					setState(113); match(RETURN);
					setState(114); expression(0);
					setState(115); match(SEMICOLON);
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(116); match(NEWLINE);
						}
						}
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(124); match(RCB);
				}
				break;

			case 6:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(126); function_call();
				setState(127); match(SEMICOLON);
				}
				break;

			case 7:
				_localctx = new NewlineContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(129); match(NEWLINE);
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declarationContext extends ParserRuleContext {
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
	 
		public Var_declarationContext() { }
		public void copyFrom(Var_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareVarContext extends Var_declarationContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclareVarContext(Var_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterDeclareVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitDeclareVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitDeclareVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_declaration);
		try {
			_localctx = new DeclareVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137); var_type();
			setState(138); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_declarationContext extends ParserRuleContext {
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
	 
		public Array_declarationContext() { }
		public void copyFrom(Array_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareArrayContext extends Array_declarationContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSB() { return getToken(foxtrotParser.RSB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(foxtrotParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LSB() { return getToken(foxtrotParser.LSB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(foxtrotParser.COMMA, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TYPE_INT() { return getToken(foxtrotParser.TYPE_INT, 0); }
		public DeclareArrayContext(Array_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterDeclareArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitDeclareArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitDeclareArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array_declaration);
		int _la;
		try {
			_localctx = new DeclareArrayContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(TYPE_INT);
			setState(141); match(LSB);
			setState(142); expression(0);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143); match(COMMA);
				setState(144); expression(0);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(RSB);
			setState(151); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode TYPE_STRING() { return getToken(foxtrotParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_INT() { return getToken(foxtrotParser.TYPE_INT, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==TYPE_INT || _la==TYPE_STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(foxtrotParser.STRING, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArityContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(foxtrotParser.INT, 0); }
		public ArityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterArity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitArity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitArity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArityContext arity() throws RecognitionException {
		ArityContext _localctx = new ArityContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode RSB() { return getToken(foxtrotParser.RSB, 0); }
		public ArityContext arity() {
			return getRuleContext(ArityContext.class,0);
		}
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode LSB() { return getToken(foxtrotParser.LSB, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); var_type();
			setState(164);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(160); match(LSB);
				setState(161); arity();
				setState(162); match(RSB);
				}
			}

			setState(166); identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSB() { return getToken(foxtrotParser.RSB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(foxtrotParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LSB() { return getToken(foxtrotParser.LSB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(foxtrotParser.COMMA, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lvalue);
		int _la;
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); identifier();
				setState(170); match(LSB);
				setState(171); expression(0);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(172); match(COMMA);
					setState(173); expression(0);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179); match(RSB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public int _p;
		public ConditionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConditionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class OrContext extends ConditionContext {
		public Token op;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(foxtrotParser.OR, 0); }
		public OrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ConditionContext {
		public Token op;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public TerminalNode AND() { return getToken(foxtrotParser.AND, 0); }
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public AndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ConditionContext {
		public Token op;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(foxtrotParser.NOT, 0); }
		public NotContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompContext extends ConditionContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(foxtrotParser.NEQ, 0); }
		public TerminalNode GEQ() { return getToken(foxtrotParser.GEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(foxtrotParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(foxtrotParser.LEQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(foxtrotParser.GT, 0); }
		public TerminalNode EQ() { return getToken(foxtrotParser.EQ, 0); }
		public CompContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState, _p);
		ConditionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184); ((NotContext)_localctx).op = match(NOT);
				setState(185); condition(4);
				}
				break;
			case ADD:
			case SUB:
			case LB:
			case INT:
			case STRING:
			case STRING_LITERAL:
				{
				_localctx = new CompContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186); expression(0);
				setState(187);
				((CompContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LEQ) | (1L << GEQ) | (1L << LT) | (1L << GT))) != 0)) ) {
					((CompContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(188); expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ConditionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(192);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(193); ((AndContext)_localctx).op = match(AND);
						setState(194); condition(4);
						}
						break;

					case 2:
						{
						_localctx = new OrContext(new ConditionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(195);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(196); ((OrContext)_localctx).op = match(OR);
						setState(197); condition(3);
						}
						break;
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(foxtrotParser.VOID, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_return_type);
		try {
			setState(205);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); match(VOID);
				}
				break;
			case TYPE_INT:
			case TYPE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); var_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LB() { return getToken(foxtrotParser.LB, 0); }
		public TerminalNode RB() { return getToken(foxtrotParser.RB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(foxtrotParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(foxtrotParser.COMMA, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); identifier();
			setState(208); match(LB);
			setState(217);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << LB) | (1L << INT) | (1L << STRING) | (1L << STRING_LITERAL))) != 0)) {
				{
				setState(209); expression(0);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(210); match(COMMA);
					setState(211); expression(0);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(219); match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(foxtrotParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(foxtrotParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode MOD() { return getToken(foxtrotParser.MOD, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADD() { return getToken(foxtrotParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(foxtrotParser.SUB, 0); }
		public UnaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdxContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSB() { return getToken(foxtrotParser.RSB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(foxtrotParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LSB() { return getToken(foxtrotParser.LSB, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(foxtrotParser.COMMA, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdxContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitIdx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitIdx(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrContext extends ExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(foxtrotParser.STRING_LITERAL, 0); }
		public StrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(foxtrotParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(foxtrotParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public TerminalNode LB() { return getToken(foxtrotParser.LB, 0); }
		public TerminalNode RB() { return getToken(foxtrotParser.RB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(foxtrotParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof foxtrotListener ) ((foxtrotListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof foxtrotVisitor ) return ((foxtrotVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(223); expression(9);
				}
				break;

			case 2:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224); match(LB);
				setState(225); expression(0);
				setState(226); match(RB);
				}
				break;

			case 3:
				{
				_localctx = new IdxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(228); identifier();
				setState(229); match(LSB);
				setState(230); expression(0);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(231); match(COMMA);
					setState(232); expression(0);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238); match(RSB);
				}
				break;

			case 4:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240); function_call();
				}
				break;

			case 5:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241); identifier();
				}
				break;

			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242); match(INT);
				}
				break;

			case 7:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243); match(STRING_LITERAL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(247);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << MOD) | (1L << DIV))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(248); expression(9);
						}
						break;

					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(250);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(251); expression(8);
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return condition_sempred((ConditionContext)_localctx, predIndex);

		case 13: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 3 >= _localctx._p;

		case 1: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3*\u0104\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4\16\4T\13\4\3"+
		"\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4j\n\4\f\4\16\4m\13\4\5\4o\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\7\4x\n\4\f\4\16\4{\13\4\5\4}\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0085"+
		"\n\4\f\4\16\4\u0088\13\4\5\4\u008a\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u0094\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00a7\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\13\3\13\5\13\u00b8\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c9"+
		"\n\f\f\f\16\f\u00cc\13\f\3\r\3\r\5\r\u00d0\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00d7\n\16\f\16\16\16\u00da\13\16\5\16\u00dc\n\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ec\n\17"+
		"\f\17\16\17\u00ef\13\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f7\n\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ff\n\17\f\17\16\17\u0102\13\17"+
		"\3\17\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2#$\3\2\n\13\3\2"+
		"\23\30\3\2\20\21\3\2\r\17\u011a\2\36\3\2\2\2\4 \3\2\2\2\6\u0089\3\2\2"+
		"\2\b\u008b\3\2\2\2\n\u008e\3\2\2\2\f\u009b\3\2\2\2\16\u009d\3\2\2\2\20"+
		"\u009f\3\2\2\2\22\u00a1\3\2\2\2\24\u00b7\3\2\2\2\26\u00c0\3\2\2\2\30\u00cf"+
		"\3\2\2\2\32\u00d1\3\2\2\2\34\u00f6\3\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2"+
		" %\5\6\4\2!\"\7)\2\2\"$\5\6\4\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&\5\3\2\2\2\'%\3\2\2\2(+\7\t\2\2),\5\b\5\2*,\5\n\6\2+)\3\2\2\2+*\3\2"+
		"\2\2,-\3\2\2\2-.\7%\2\2.\u008a\3\2\2\2/\60\5\24\13\2\60\61\t\2\2\2\61"+
		"\62\5\34\17\2\62\63\7%\2\2\63\u008a\3\2\2\2\64\65\7\b\2\2\65\66\7\35\2"+
		"\2\66\67\5\26\f\2\67;\7\36\2\28:\7)\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2"+
		";<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\37\2\2?@\5\4\3\2@A\7 \2\2A\u008a\3"+
		"\2\2\2BC\7\6\2\2CD\7\35\2\2DE\5\26\f\2EI\7\36\2\2FH\7)\2\2GF\3\2\2\2H"+
		"K\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\37\2\2MN\5\4\3\2"+
		"N`\7 \2\2OQ\7)\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2T"+
		"R\3\2\2\2UY\7\7\2\2VX\7)\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z"+
		"\\\3\2\2\2[Y\3\2\2\2\\]\7\37\2\2]^\5\4\3\2^_\7 \2\2_a\3\2\2\2`R\3\2\2"+
		"\2`a\3\2\2\2a\u008a\3\2\2\2bc\7\5\2\2cd\5\30\r\2de\5\16\b\2en\7\35\2\2"+
		"fk\5\22\n\2gh\7\31\2\2hj\5\22\n\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2lo\3\2\2\2mk\3\2\2\2nf\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\36\2\2qr\7"+
		"\37\2\2r|\5\4\3\2st\7\4\2\2tu\5\34\17\2uy\7%\2\2vx\7)\2\2wv\3\2\2\2x{"+
		"\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|s\3\2\2\2|}\3\2\2\2}"+
		"~\3\2\2\2~\177\7 \2\2\177\u008a\3\2\2\2\u0080\u0081\5\32\16\2\u0081\u0082"+
		"\7%\2\2\u0082\u008a\3\2\2\2\u0083\u0085\7)\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089(\3\2\2\2\u0089/\3\2\2\2\u0089\64\3\2\2"+
		"\2\u0089B\3\2\2\2\u0089b\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0086\3\2\2"+
		"\2\u008a\7\3\2\2\2\u008b\u008c\5\f\7\2\u008c\u008d\5\16\b\2\u008d\t\3"+
		"\2\2\2\u008e\u008f\7\n\2\2\u008f\u0090\7!\2\2\u0090\u0095\5\34\17\2\u0091"+
		"\u0092\7\31\2\2\u0092\u0094\5\34\17\2\u0093\u0091\3\2\2\2\u0094\u0097"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u0099\7\"\2\2\u0099\u009a\5\16\b\2\u009a\13\3\2\2"+
		"\2\u009b\u009c\t\3\2\2\u009c\r\3\2\2\2\u009d\u009e\7\'\2\2\u009e\17\3"+
		"\2\2\2\u009f\u00a0\7&\2\2\u00a0\21\3\2\2\2\u00a1\u00a6\5\f\7\2\u00a2\u00a3"+
		"\7!\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a5\7\"\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5\16"+
		"\b\2\u00a9\23\3\2\2\2\u00aa\u00b8\5\16\b\2\u00ab\u00ac\5\16\b\2\u00ac"+
		"\u00ad\7!\2\2\u00ad\u00b2\5\34\17\2\u00ae\u00af\7\31\2\2\u00af\u00b1\5"+
		"\34\17\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\""+
		"\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00aa\3\2\2\2\u00b7\u00ab\3\2\2\2\u00b8"+
		"\25\3\2\2\2\u00b9\u00ba\b\f\1\2\u00ba\u00bb\7\f\2\2\u00bb\u00c1\5\26\f"+
		"\2\u00bc\u00bd\5\34\17\2\u00bd\u00be\t\4\2\2\u00be\u00bf\5\34\17\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00ca\3\2"+
		"\2\2\u00c2\u00c3\6\f\2\3\u00c3\u00c4\7\32\2\2\u00c4\u00c9\5\26\f\2\u00c5"+
		"\u00c6\6\f\3\3\u00c6\u00c7\7\33\2\2\u00c7\u00c9\5\26\f\2\u00c8\u00c2\3"+
		"\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\7\3\2"+
		"\2\u00ce\u00d0\5\f\7\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\31"+
		"\3\2\2\2\u00d1\u00d2\5\16\b\2\u00d2\u00db\7\35\2\2\u00d3\u00d8\5\34\17"+
		"\2\u00d4\u00d5\7\31\2\2\u00d5\u00d7\5\34\17\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7\36\2\2\u00de\33\3\2\2\2\u00df\u00e0\b\17"+
		"\1\2\u00e0\u00e1\t\5\2\2\u00e1\u00f7\5\34\17\2\u00e2\u00e3\7\35\2\2\u00e3"+
		"\u00e4\5\34\17\2\u00e4\u00e5\7\36\2\2\u00e5\u00f7\3\2\2\2\u00e6\u00e7"+
		"\5\16\b\2\u00e7\u00e8\7!\2\2\u00e8\u00ed\5\34\17\2\u00e9\u00ea\7\31\2"+
		"\2\u00ea\u00ec\5\34\17\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f7\3\2\2\2\u00f2\u00f7\5\32\16\2\u00f3"+
		"\u00f7\5\16\b\2\u00f4\u00f7\7&\2\2\u00f5\u00f7\7*\2\2\u00f6\u00df\3\2"+
		"\2\2\u00f6\u00e2\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6"+
		"\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u0100\3\2"+
		"\2\2\u00f8\u00f9\6\17\4\3\u00f9\u00fa\t\6\2\2\u00fa\u00ff\5\34\17\2\u00fb"+
		"\u00fc\6\17\5\3\u00fc\u00fd\t\5\2\2\u00fd\u00ff\5\34\17\2\u00fe\u00f8"+
		"\3\2\2\2\u00fe\u00fb\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\35\3\2\2\2\u0102\u0100\3\2\2\2\35%+;IRY`kny|\u0086"+
		"\u0089\u0095\u00a6\u00b2\u00b7\u00c0\u00c8\u00ca\u00cf\u00d8\u00db\u00ed"+
		"\u00f6\u00fe\u0100";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}