// Generated from jazzik.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jazzikParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, STRING=2, TRUE=3, FALSE=4, ASSIGN=5, COMMA=6, COLON=7, QMARK=8, 
		INC=9, DEC=10, MUL=11, DIV=12, ADD=13, SUB=14, MOD=15, EQ=16, NEQ=17, 
		GT=18, LT=19, GTE=20, LTE=21, NEG=22, AND=23, IAND=24, OR=25, IOR=26, 
		IXOR=27, INEG=28, ARRAY_TYPE=29, INT_TYPE=30, BOOL_TYPE=31, VOID_TYPE=32, 
		SIZE=33, IF=34, UNLESS=35, ELSE=36, FOR=37, IN=38, WHILE=39, EXTERN=40, 
		READ=41, WRITE=42, RETURN=43, BREAK=44, CONTINUE=45, ID=46, BLOCK_BEGIN=47, 
		BLOCK_END=48, PAREN_BEGIN=49, PAREN_END=50, ARRAY_BEGIN=51, ARRAY_END=52, 
		INC_RANGE=53, EXC_RANGE=54, NEWLINE=55, WHITESPACE=56;
	public static final String[] tokenNames = {
		"<INVALID>", "INT", "STRING", "'true'", "'false'", "'='", "','", "':'", 
		"'?'", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'%'", "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'!'", "'&&'", "'&'", "'||'", "'|'", "'^'", 
		"'~'", "'int[]'", "'int'", "'bool'", "'void'", "'size'", "'if'", "'unless'", 
		"'else'", "'for'", "'in'", "'while'", "'extern'", "'read'", "'write'", 
		"'return'", "'break'", "'continue'", "ID", "'{'", "'}'", "'('", "')'", 
		"'['", "']'", "'..'", "'...'", "NEWLINE", "WHITESPACE"
	};
	public static final int
		RULE_init = 0, RULE_funcdecls = 1, RULE_funcdecl = 2, RULE_funcargdecls = 3, 
		RULE_funcargdecl = 4, RULE_block = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_writearg = 8, RULE_readarg = 9, RULE_funccall = 10, RULE_funcargs = 11, 
		RULE_funcarg = 12, RULE_vardecl = 13, RULE_intvardecl = 14, RULE_varaccess = 15, 
		RULE_assignment = 16, RULE_ifstatement = 17, RULE_forstatement = 18;
	public static final String[] ruleNames = {
		"init", "funcdecls", "funcdecl", "funcargdecls", "funcargdecl", "block", 
		"statement", "expression", "writearg", "readarg", "funccall", "funcargs", 
		"funcarg", "vardecl", "intvardecl", "varaccess", "assignment", "ifstatement", 
		"forstatement"
	};

	@Override
	public String getGrammarFileName() { return "jazzik.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public jazzikParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public FuncdeclsContext funcdecls() {
			return getRuleContext(FuncdeclsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); funcdecls();
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

	public static class FuncdeclsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(jazzikParser.NEWLINE); }
		public FuncdeclContext funcdecl(int i) {
			return getRuleContext(FuncdeclContext.class,i);
		}
		public List<FuncdeclContext> funcdecl() {
			return getRuleContexts(FuncdeclContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(jazzikParser.NEWLINE, i);
		}
		public FuncdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncdecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncdecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclsContext funcdecls() throws RecognitionException {
		FuncdeclsContext _localctx = new FuncdeclsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdecls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(40); match(NEWLINE);
						}
						}
						setState(45);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(46); funcdecl();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(52); match(NEWLINE);
				}
				}
				setState(57);
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

	public static class FuncdeclContext extends ParserRuleContext {
		public FuncdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl; }
	 
		public FuncdeclContext() { }
		public void copyFrom(FuncdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDefContext extends FuncdeclContext {
		public Token type;
		public Token name;
		public FuncargdeclsContext args;
		public FuncargdeclsContext funcargdecls() {
			return getRuleContext(FuncargdeclsContext.class,0);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(FuncdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExternContext extends FuncdeclContext {
		public Token type;
		public Token name;
		public FuncargdeclsContext args;
		public FuncargdeclsContext funcargdecls() {
			return getRuleContext(FuncargdeclsContext.class,0);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncExternContext(FuncdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncExtern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncExtern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclContext funcdecl() throws RecognitionException {
		FuncdeclContext _localctx = new FuncdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcdecl);
		int _la;
		try {
			setState(74);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case BOOL_TYPE:
			case VOID_TYPE:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((FuncDefContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
					((FuncDefContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(59); ((FuncDefContext)_localctx).name = match(ID);
				setState(60); match(PAREN_BEGIN);
				setState(62);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << INT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					setState(61); ((FuncDefContext)_localctx).args = funcargdecls();
					}
				}

				setState(64); match(PAREN_END);
				setState(65); block();
				}
				break;
			case EXTERN:
				_localctx = new FuncExternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(EXTERN);
				setState(67);
				((FuncExternContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==VOID_TYPE) ) {
					((FuncExternContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(68); ((FuncExternContext)_localctx).name = match(ID);
				setState(69); match(PAREN_BEGIN);
				setState(71);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << INT_TYPE) | (1L << BOOL_TYPE))) != 0)) {
					{
					setState(70); ((FuncExternContext)_localctx).args = funcargdecls();
					}
				}

				setState(73); match(PAREN_END);
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

	public static class FuncargdeclsContext extends ParserRuleContext {
		public FuncargdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargdecls; }
	 
		public FuncargdeclsContext() { }
		public void copyFrom(FuncargdeclsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncArgDeclsContext extends FuncargdeclsContext {
		public List<FuncargdeclContext> funcargdecl() {
			return getRuleContexts(FuncargdeclContext.class);
		}
		public FuncargdeclContext funcargdecl(int i) {
			return getRuleContext(FuncargdeclContext.class,i);
		}
		public FuncArgDeclsContext(FuncargdeclsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargdeclsContext funcargdecls() throws RecognitionException {
		FuncargdeclsContext _localctx = new FuncargdeclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcargdecls);
		int _la;
		try {
			_localctx = new FuncArgDeclsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76); funcargdecl();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77); match(COMMA);
				setState(78); funcargdecl();
				}
				}
				setState(83);
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

	public static class FuncargdeclContext extends ParserRuleContext {
		public FuncargdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargdecl; }
	 
		public FuncargdeclContext() { }
		public void copyFrom(FuncargdeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncArgDeclContext extends FuncargdeclContext {
		public Token type;
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncArgDeclContext(FuncargdeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargdeclContext funcargdecl() throws RecognitionException {
		FuncargdeclContext _localctx = new FuncargdeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcargdecl);
		int _la;
		try {
			_localctx = new FuncArgDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((FuncArgDeclContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARRAY_TYPE) | (1L << INT_TYPE) | (1L << BOOL_TYPE))) != 0)) ) {
				((FuncArgDeclContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(85); ((FuncArgDeclContext)_localctx).name = match(ID);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(jazzikParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(jazzikParser.NEWLINE, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(87); match(NEWLINE);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(BLOCK_BEGIN);
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(94); match(NEWLINE);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100); statement();
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(102); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(101); match(NEWLINE);
							}
							}
							setState(104); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						setState(106); statement();
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(114); match(NEWLINE);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(BLOCK_END);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(121); match(NEWLINE);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class ReturnIntContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnIntContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterReturnInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitReturnInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitReturnInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclContext extends StatementContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public VarDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteContext extends StatementContext {
		public WriteargContext writearg(int i) {
			return getRuleContext(WriteargContext.class,i);
		}
		public List<WriteargContext> writearg() {
			return getRuleContexts(WriteargContext.class);
		}
		public WriteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueErrorContext extends StatementContext {
		public ContinueErrorContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterContinueError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitContinueError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitContinueError(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorNestedContext extends StatementContext {
		public FuncdeclContext funcdecl() {
			return getRuleContext(FuncdeclContext.class,0);
		}
		public ErrorNestedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterErrorNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitErrorNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitErrorNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StatementContext {
		public ReadargContext readarg(int i) {
			return getRuleContext(ReadargContext.class,i);
		}
		public List<ReadargContext> readarg() {
			return getRuleContexts(ReadargContext.class);
		}
		public ReadContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmContext extends StatementContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public IfStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIfStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIfStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIfStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmContext extends StatementContext {
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public ForStmContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterForStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitForStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitForStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ErrorBreakContext extends StatementContext {
		public ErrorBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterErrorBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitErrorBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitErrorBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127); assignment();
				}
				break;

			case 2:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128); vardecl();
				}
				break;

			case 3:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129); match(WRITE);
				setState(130); writearg();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131); match(COMMA);
					setState(132); writearg();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(138); match(READ);
				setState(139); readarg();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(140); match(COMMA);
					setState(141); readarg();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				_localctx = new ForStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(147); forstatement();
				}
				break;

			case 6:
				_localctx = new IfStmContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(148); ifstatement();
				}
				break;

			case 7:
				_localctx = new ReturnIntContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(149); match(RETURN);
				setState(151);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRUE) | (1L << FALSE) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << INEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
					{
					setState(150); expression(0);
					}
				}

				}
				break;

			case 8:
				_localctx = new ExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(153); expression(0);
				}
				break;

			case 9:
				_localctx = new ErrorBreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(154); match(BREAK);
				 notifyErrorListeners("break statement is not supported"); 
				}
				break;

			case 10:
				_localctx = new ContinueErrorContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(156); match(CONTINUE);
				 notifyErrorListeners("continue statement is not supported"); 
				}
				break;

			case 11:
				_localctx = new ErrorNestedContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(158); funcdecl();
				 notifyErrorListeners("nested functions are not allowed"); 
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
	public static class BinContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LogContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConstantContext extends ExpressionContext {
		public TerminalNode TRUE() { return getToken(jazzikParser.TRUE, 0); }
		public TerminalNode INT() { return getToken(jazzikParser.INT, 0); }
		public TerminalNode FALSE() { return getToken(jazzikParser.FALSE, 0); }
		public IntConstantContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIntConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIntConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIntConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CmpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncargsContext funcargs() {
			return getRuleContext(FuncargsContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncCall(this);
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
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarsContext extends ExpressionContext {
		public VaraccessContext varaccess() {
			return getRuleContext(VaraccessContext.class,0);
		}
		public VarsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public SizeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << INEG))) != 0)) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(165); expression(11);
				}
				break;

			case 2:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166); match(PAREN_BEGIN);
				setState(167); expression(0);
				setState(168); match(PAREN_END);
				}
				break;

			case 3:
				{
				_localctx = new SizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); match(SIZE);
				setState(171); match(PAREN_BEGIN);
				setState(172); match(ID);
				setState(173); match(PAREN_END);
				}
				break;

			case 4:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174); match(ID);
				setState(175); match(PAREN_BEGIN);
				setState(177);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRUE) | (1L << FALSE) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << INEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
					{
					setState(176); funcargs();
					}
				}

				setState(179); match(PAREN_END);
				}
				break;

			case 5:
				{
				_localctx = new IntConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 6:
				{
				_localctx = new VarsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181); varaccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(185);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(186); expression(11);
						}
						break;

					case 2:
						{
						_localctx = new BinContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(188);
						((BinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IAND) | (1L << IOR) | (1L << IXOR))) != 0)) ) {
							((BinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(189); expression(10);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(191);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(192); expression(9);
						}
						break;

					case 4:
						{
						_localctx = new CmpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(194);
						((CmpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << LT) | (1L << GTE) | (1L << LTE))) != 0)) ) {
							((CmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(195); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new LogContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(197);
						((LogContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((LogContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(198); expression(7);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class WriteargContext extends ParserRuleContext {
		public WriteargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writearg; }
	 
		public WriteargContext() { }
		public void copyFrom(WriteargContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteStrContext extends WriteargContext {
		public TerminalNode STRING() { return getToken(jazzikParser.STRING, 0); }
		public WriteStrContext(WriteargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWriteStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWriteStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWriteStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteIntContext extends WriteargContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteIntContext(WriteargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWriteInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWriteInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWriteInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteIDContext extends WriteargContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public WriteIDContext(WriteargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWriteID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWriteID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWriteID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteargContext writearg() throws RecognitionException {
		WriteargContext _localctx = new WriteargContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_writearg);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new WriteIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204); match(ID);
				}
				break;

			case 2:
				_localctx = new WriteIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205); expression(0);
				}
				break;

			case 3:
				_localctx = new WriteStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206); match(STRING);
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

	public static class ReadargContext extends ParserRuleContext {
		public ReadargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readarg; }
	 
		public ReadargContext() { }
		public void copyFrom(ReadargContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadArrayContext extends ReadargContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReadArrayContext(ReadargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterReadArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitReadArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitReadArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadIntContext extends ReadargContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ReadIntContext(ReadargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitReadInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadargContext readarg() throws RecognitionException {
		ReadargContext _localctx = new ReadargContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_readarg);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new ReadArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(ID);
				setState(210); match(ARRAY_BEGIN);
				setState(211); expression(0);
				setState(212); match(ARRAY_END);
				}
				break;

			case 2:
				_localctx = new ReadIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214); match(ID);
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncargsContext funcargs() {
			return getRuleContext(FuncargsContext.class,0);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFunccall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(ID);
			setState(218); match(PAREN_BEGIN);
			setState(220);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TRUE) | (1L << FALSE) | (1L << ADD) | (1L << SUB) | (1L << NEG) | (1L << INEG) | (1L << SIZE) | (1L << ID) | (1L << PAREN_BEGIN))) != 0)) {
				{
				setState(219); funcargs();
				}
			}

			setState(222); match(PAREN_END);
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

	public static class FuncargsContext extends ParserRuleContext {
		public List<FuncargContext> funcarg() {
			return getRuleContexts(FuncargContext.class);
		}
		public FuncargContext funcarg(int i) {
			return getRuleContext(FuncargContext.class,i);
		}
		public FuncargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargsContext funcargs() throws RecognitionException {
		FuncargsContext _localctx = new FuncargsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funcargs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); funcarg();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225); match(COMMA);
				setState(226); funcarg();
				}
				}
				setState(231);
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

	public static class FuncargContext extends ParserRuleContext {
		public FuncargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcarg; }
	 
		public FuncargContext() { }
		public void copyFrom(FuncargContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncArgExprContext extends FuncargContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncArgExprContext(FuncargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncArgIDContext extends FuncargContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public FuncArgIDContext(FuncargContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFuncArgID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFuncArgID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFuncArgID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncargContext funcarg() throws RecognitionException {
		FuncargContext _localctx = new FuncargContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcarg);
		try {
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new FuncArgIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(ID);
				}
				break;

			case 2:
				_localctx = new FuncArgExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233); expression(0);
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

	public static class VardeclContext extends ParserRuleContext {
		public IntvardeclContext intvardecl(int i) {
			return getRuleContext(IntvardeclContext.class,i);
		}
		public List<IntvardeclContext> intvardecl() {
			return getRuleContexts(IntvardeclContext.class);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterVardecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitVardecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitVardecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vardecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==BOOL_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(237); intvardecl();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238); match(COMMA);
				setState(239); intvardecl();
				}
				}
				setState(244);
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

	public static class IntvardeclContext extends ParserRuleContext {
		public IntvardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intvardecl; }
	 
		public IntvardeclContext() { }
		public void copyFrom(IntvardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclContext extends IntvardeclContext {
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayDeclContext(IntvardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterArrayDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitArrayDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitArrayDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDeclContext extends IntvardeclContext {
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntDeclContext(IntvardeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIntDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIntDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIntDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntvardeclContext intvardecl() throws RecognitionException {
		IntvardeclContext _localctx = new IntvardeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_intvardecl);
		int _la;
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new IntDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(245); ((IntDeclContext)_localctx).name = match(ID);
				setState(248);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(246); match(ASSIGN);
					setState(247); expression(0);
					}
				}

				}
				break;

			case 2:
				_localctx = new ArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250); ((ArrayDeclContext)_localctx).name = match(ID);
				setState(251); match(ARRAY_BEGIN);
				setState(252); expression(0);
				setState(253); match(ARRAY_END);
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

	public static class VaraccessContext extends ParserRuleContext {
		public VaraccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varaccess; }
	 
		public VaraccessContext() { }
		public void copyFrom(VaraccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAccessContext extends VaraccessContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public VarAccessContext(VaraccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterVarAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitVarAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitVarAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessContext extends VaraccessContext {
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAccessContext(VaraccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaraccessContext varaccess() throws RecognitionException {
		VaraccessContext _localctx = new VaraccessContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varaccess);
		try {
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new VarAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257); match(ID);
				}
				break;

			case 2:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258); match(ID);
				setState(259); match(ARRAY_BEGIN);
				setState(260); expression(0);
				setState(261); match(ARRAY_END);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignArrayContext extends AssignmentContext {
		public Token name;
		public ExpressionContext index;
		public ExpressionContext value;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignArrayContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAssignArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIntContext extends AssignmentContext {
		public Token name;
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignIntContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterAssignInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitAssignInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitAssignInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new AssignIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265); ((AssignIntContext)_localctx).name = match(ID);
				setState(266); match(ASSIGN);
				setState(267); expression(0);
				}
				break;

			case 2:
				_localctx = new AssignArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(268); ((AssignArrayContext)_localctx).name = match(ID);
				setState(269); match(ARRAY_BEGIN);
				setState(270); ((AssignArrayContext)_localctx).index = expression(0);
				setState(271); match(ARRAY_END);
				setState(272); match(ASSIGN);
				setState(273); ((AssignArrayContext)_localctx).value = expression(0);
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

	public static class IfstatementContext extends ParserRuleContext {
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
	 
		public IfstatementContext() { }
		public void copyFrom(IfstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfContext extends IfstatementContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public IfContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnlessContext extends IfstatementContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public UnlessContext(IfstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterUnless(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitUnless(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitUnless(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifstatement);
		int _la;
		try {
			setState(291);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277); match(IF);
				setState(278); expression(0);
				setState(279); block();
				setState(282);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(280); match(ELSE);
					setState(281); block();
					}
				}

				}
				break;
			case UNLESS:
				_localctx = new UnlessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284); match(UNLESS);
				setState(285); expression(0);
				setState(286); block();
				setState(289);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(287); match(ELSE);
					setState(288); block();
					}
				}

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

	public static class ForstatementContext extends ParserRuleContext {
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
	 
		public ForstatementContext() { }
		public void copyFrom(ForstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends ForstatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(ForstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForEachContext extends ForstatementContext {
		public List<TerminalNode> ID() { return getTokens(jazzikParser.ID); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(jazzikParser.ID, i);
		}
		public ForEachContext(ForstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitForEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitForEach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends ForstatementContext {
		public Token rtype;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(jazzikParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(ForstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jazzikListener ) ((jazzikListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jazzikVisitor ) return ((jazzikVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forstatement);
		int _la;
		try {
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293); match(FOR);
				setState(294); match(ID);
				setState(295); match(IN);
				setState(296); expression(0);
				setState(297);
				((ForContext)_localctx).rtype = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC_RANGE || _la==EXC_RANGE) ) {
					((ForContext)_localctx).rtype = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(298); expression(0);
				setState(299); block();
				}
				break;

			case 2:
				_localctx = new ForEachContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301); match(FOR);
				setState(302); match(ID);
				setState(303); match(IN);
				setState(304); match(ID);
				setState(305); block();
				}
				break;

			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306); match(WHILE);
				setState(307); expression(0);
				setState(308); block();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3:\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\7\3\62\n"+
		"\3\f\3\16\3\65\13\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\4\3\4\5\4A\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\5\4M\n\4\3\5\3\5\3\5\7\5R"+
		"\n\5\f\5\16\5U\13\5\3\6\3\6\3\6\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\3\7\7"+
		"\7b\n\7\f\7\16\7e\13\7\3\7\3\7\6\7i\n\7\r\7\16\7j\3\7\7\7n\n\7\f\7\16"+
		"\7q\13\7\5\7s\n\7\3\7\7\7v\n\7\f\7\16\7y\13\7\3\7\3\7\7\7}\n\7\f\7\16"+
		"\7\u0080\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\3\b\3\b\3\b\5"+
		"\b\u009a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\3\t"+
		"\5\t\u00b9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u00ca\n\t\f\t\16\t\u00cd\13\t\3\n\3\n\3\n\5\n\u00d2\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f\3\f\5\f\u00df\n\f\3"+
		"\f\3\f\3\r\3\r\3\r\7\r\u00e6\n\r\f\r\16\r\u00e9\13\r\3\16\3\16\5\16\u00ed"+
		"\n\16\3\17\3\17\3\17\3\17\7\17\u00f3\n\17\f\17\16\17\u00f6\13\17\3\20"+
		"\3\20\3\20\5\20\u00fb\n\20\3\20\3\20\3\20\3\20\3\20\5\20\u0102\n\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u010a\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0116\n\22\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u011d\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0124\n\23\5\23\u0126\n\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0139\n\24\3\24\2\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\16\3\2 \"\4\2  \"\"\3\2\37!\5\2\17\20\30\30\36\36\4\2"+
		"\3\3\5\6\4\2\r\16\21\21\4\2\32\32\34\35\3\2\17\20\3\2\22\27\4\2\31\31"+
		"\33\33\3\2 !\3\2\678\u015d\2(\3\2\2\2\4\63\3\2\2\2\6L\3\2\2\2\bN\3\2\2"+
		"\2\nV\3\2\2\2\f\\\3\2\2\2\16\u00a3\3\2\2\2\20\u00b8\3\2\2\2\22\u00d1\3"+
		"\2\2\2\24\u00d9\3\2\2\2\26\u00db\3\2\2\2\30\u00e2\3\2\2\2\32\u00ec\3\2"+
		"\2\2\34\u00ee\3\2\2\2\36\u0101\3\2\2\2 \u0109\3\2\2\2\"\u0115\3\2\2\2"+
		"$\u0125\3\2\2\2&\u0138\3\2\2\2()\5\4\3\2)\3\3\2\2\2*,\79\2\2+*\3\2\2\2"+
		",/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\62\5\6\4\2\61"+
		"-\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\649\3\2\2\2\65\63"+
		"\3\2\2\2\668\79\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3"+
		"\2\2\2;9\3\2\2\2<=\t\2\2\2=>\7\60\2\2>@\7\63\2\2?A\5\b\5\2@?\3\2\2\2@"+
		"A\3\2\2\2AB\3\2\2\2BC\7\64\2\2CM\5\f\7\2DE\7*\2\2EF\t\3\2\2FG\7\60\2\2"+
		"GI\7\63\2\2HJ\5\b\5\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KM\7\64\2\2L<\3\2\2"+
		"\2LD\3\2\2\2M\7\3\2\2\2NS\5\n\6\2OP\7\b\2\2PR\5\n\6\2QO\3\2\2\2RU\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2T\t\3\2\2\2US\3\2\2\2VW\t\4\2\2WX\7\60\2\2X\13"+
		"\3\2\2\2Y[\79\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2"+
		"^\\\3\2\2\2_r\7\61\2\2`b\79\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2"+
		"\2df\3\2\2\2ec\3\2\2\2fo\5\16\b\2gi\79\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2"+
		"\2jk\3\2\2\2kl\3\2\2\2ln\5\16\b\2mh\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2ps\3\2\2\2qo\3\2\2\2rc\3\2\2\2rs\3\2\2\2sw\3\2\2\2tv\79\2\2ut\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z~\7\62\2\2{}\7"+
		"9\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\r\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u00a4\5\"\22\2\u0082\u00a4\5\34\17\2\u0083\u0084\7,\2"+
		"\2\u0084\u0089\5\22\n\2\u0085\u0086\7\b\2\2\u0086\u0088\5\22\n\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u00a4\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7+\2\2\u008d"+
		"\u0092\5\24\13\2\u008e\u008f\7\b\2\2\u008f\u0091\5\24\13\2\u0090\u008e"+
		"\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u00a4\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u00a4\5&\24\2\u0096\u00a4\5$"+
		"\23\2\u0097\u0099\7-\2\2\u0098\u009a\5\20\t\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u00a4\3\2\2\2\u009b\u00a4\5\20\t\2\u009c\u009d\7"+
		".\2\2\u009d\u00a4\b\b\1\2\u009e\u009f\7/\2\2\u009f\u00a4\b\b\1\2\u00a0"+
		"\u00a1\5\6\4\2\u00a1\u00a2\b\b\1\2\u00a2\u00a4\3\2\2\2\u00a3\u0081\3\2"+
		"\2\2\u00a3\u0082\3\2\2\2\u00a3\u0083\3\2\2\2\u00a3\u008c\3\2\2\2\u00a3"+
		"\u0095\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3\u009b\3\2"+
		"\2\2\u00a3\u009c\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4"+
		"\17\3\2\2\2\u00a5\u00a6\b\t\1\2\u00a6\u00a7\t\5\2\2\u00a7\u00b9\5\20\t"+
		"\2\u00a8\u00a9\7\63\2\2\u00a9\u00aa\5\20\t\2\u00aa\u00ab\7\64\2\2\u00ab"+
		"\u00b9\3\2\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\7\63\2\2\u00ae\u00af\7\60"+
		"\2\2\u00af\u00b9\7\64\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b3\7\63\2\2\u00b2"+
		"\u00b4\5\30\r\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b9\7\64\2\2\u00b6\u00b9\t\6\2\2\u00b7\u00b9\5 \21\2\u00b8"+
		"\u00a5\3\2\2\2\u00b8\u00a8\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00b0\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00cb\3\2\2\2\u00ba"+
		"\u00bb\6\t\2\3\u00bb\u00bc\t\7\2\2\u00bc\u00ca\5\20\t\2\u00bd\u00be\6"+
		"\t\3\3\u00be\u00bf\t\b\2\2\u00bf\u00ca\5\20\t\2\u00c0\u00c1\6\t\4\3\u00c1"+
		"\u00c2\t\t\2\2\u00c2\u00ca\5\20\t\2\u00c3\u00c4\6\t\5\3\u00c4\u00c5\t"+
		"\n\2\2\u00c5\u00ca\5\20\t\2\u00c6\u00c7\6\t\6\3\u00c7\u00c8\t\13\2\2\u00c8"+
		"\u00ca\5\20\t\2\u00c9\u00ba\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c0\3"+
		"\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\21\3\2\2\2\u00cd\u00cb\3\2\2"+
		"\2\u00ce\u00d2\7\60\2\2\u00cf\u00d2\5\20\t\2\u00d0\u00d2\7\4\2\2\u00d1"+
		"\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\23\3\2\2"+
		"\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7\65\2\2\u00d5\u00d6\5\20\t\2\u00d6"+
		"\u00d7\7\66\2\2\u00d7\u00da\3\2\2\2\u00d8\u00da\7\60\2\2\u00d9\u00d3\3"+
		"\2\2\2\u00d9\u00d8\3\2\2\2\u00da\25\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc"+
		"\u00de\7\63\2\2\u00dd\u00df\5\30\r\2\u00de\u00dd\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\64\2\2\u00e1\27\3\2\2\2\u00e2"+
		"\u00e7\5\32\16\2\u00e3\u00e4\7\b\2\2\u00e4\u00e6\5\32\16\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\31\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\7\60\2\2\u00eb\u00ed\5\20"+
		"\t\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\33\3\2\2\2\u00ee\u00ef"+
		"\t\f\2\2\u00ef\u00f4\5\36\20\2\u00f0\u00f1\7\b\2\2\u00f1\u00f3\5\36\20"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\35\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\7\60\2\2\u00f8"+
		"\u00f9\7\7\2\2\u00f9\u00fb\5\20\t\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fb\u0102\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe\7\65\2\2\u00fe"+
		"\u00ff\5\20\t\2\u00ff\u0100\7\66\2\2\u0100\u0102\3\2\2\2\u0101\u00f7\3"+
		"\2\2\2\u0101\u00fc\3\2\2\2\u0102\37\3\2\2\2\u0103\u010a\7\60\2\2\u0104"+
		"\u0105\7\60\2\2\u0105\u0106\7\65\2\2\u0106\u0107\5\20\t\2\u0107\u0108"+
		"\7\66\2\2\u0108\u010a\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0104\3\2\2\2"+
		"\u010a!\3\2\2\2\u010b\u010c\7\60\2\2\u010c\u010d\7\7\2\2\u010d\u0116\5"+
		"\20\t\2\u010e\u010f\7\60\2\2\u010f\u0110\7\65\2\2\u0110\u0111\5\20\t\2"+
		"\u0111\u0112\7\66\2\2\u0112\u0113\7\7\2\2\u0113\u0114\5\20\t\2\u0114\u0116"+
		"\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u010e\3\2\2\2\u0116#\3\2\2\2\u0117"+
		"\u0118\7$\2\2\u0118\u0119\5\20\t\2\u0119\u011c\5\f\7\2\u011a\u011b\7&"+
		"\2\2\u011b\u011d\5\f\7\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0126\3\2\2\2\u011e\u011f\7%\2\2\u011f\u0120\5\20\t\2\u0120\u0123\5\f"+
		"\7\2\u0121\u0122\7&\2\2\u0122\u0124\5\f\7\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0117\3\2\2\2\u0125\u011e\3\2"+
		"\2\2\u0126%\3\2\2\2\u0127\u0128\7\'\2\2\u0128\u0129\7\60\2\2\u0129\u012a"+
		"\7(\2\2\u012a\u012b\5\20\t\2\u012b\u012c\t\r\2\2\u012c\u012d\5\20\t\2"+
		"\u012d\u012e\5\f\7\2\u012e\u0139\3\2\2\2\u012f\u0130\7\'\2\2\u0130\u0131"+
		"\7\60\2\2\u0131\u0132\7(\2\2\u0132\u0133\7\60\2\2\u0133\u0139\5\f\7\2"+
		"\u0134\u0135\7)\2\2\u0135\u0136\5\20\t\2\u0136\u0137\5\f\7\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0127\3\2\2\2\u0138\u012f\3\2\2\2\u0138\u0134\3\2\2\2\u0139"+
		"\'\3\2\2\2&-\639@ILS\\cjorw~\u0089\u0092\u0099\u00a3\u00b3\u00b8\u00c9"+
		"\u00cb\u00d1\u00d9\u00de\u00e7\u00ec\u00f4\u00fa\u0101\u0109\u0115\u011c"+
		"\u0123\u0125\u0138";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}