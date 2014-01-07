// Generated from foxtrot.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class foxtrotLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, RETURN=2, DEF=3, IF=4, ELSE=5, WHILE=6, VAR=7, TYPE_INT=8, TYPE_STRING=9, 
		NOT=10, MUL=11, MOD=12, DIV=13, ADD=14, SUB=15, EXP=16, EQ=17, NEQ=18, 
		LEQ=19, GEQ=20, LT=21, GT=22, COMMA=23, AND=24, OR=25, DOUBLE_QUOTE=26, 
		LB=27, RB=28, LCB=29, RCB=30, LSB=31, RSB=32, ASGN=33, INCR=34, SEMICOLON=35, 
		INT=36, STRING=37, WHITESPACE=38, NEWLINE=39, STRING_LITERAL=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'void'", "'return'", "'def'", "'if'", "'else'", "'while'", "'var'", "'int'", 
		"'string'", "'not'", "'*'", "'%'", "'/'", "'+'", "'-'", "'^'", "'=='", 
		"'!='", "'<='", "'>='", "'<'", "'>'", "','", "'&&'", "'||'", "'\"'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "'='", "'+='", "';'", "INT", "STRING", 
		"WHITESPACE", "NEWLINE", "STRING_LITERAL"
	};
	public static final String[] ruleNames = {
		"VOID", "RETURN", "DEF", "IF", "ELSE", "WHILE", "VAR", "TYPE_INT", "TYPE_STRING", 
		"NOT", "MUL", "MOD", "DIV", "ADD", "SUB", "EXP", "EQ", "NEQ", "LEQ", "GEQ", 
		"LT", "GT", "COMMA", "AND", "OR", "DOUBLE_QUOTE", "LB", "RB", "LCB", "RCB", 
		"LSB", "RSB", "ASGN", "INCR", "SEMICOLON", "INT", "STRING", "WHITESPACE", 
		"NEWLINE", "STRING_LITERAL"
	};


	public foxtrotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "foxtrot.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 37: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2*\u00dd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\6%\u00bf\n%\r%\16%\u00c0\3&\3&\7&\u00c5"+
		"\n&\f&\16&\u00c8\13&\3\'\3\'\3\'\3\'\3(\5(\u00cf\n(\3(\3(\5(\u00d3\n("+
		"\3)\3)\7)\u00d7\n)\f)\16)\u00da\13)\3)\3)\2*\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\2O"+
		")\1Q*\1\3\2\7\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\3\2$$\u00e1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5"+
		"X\3\2\2\2\7_\3\2\2\2\tc\3\2\2\2\13f\3\2\2\2\rk\3\2\2\2\17q\3\2\2\2\21"+
		"u\3\2\2\2\23y\3\2\2\2\25\u0080\3\2\2\2\27\u0084\3\2\2\2\31\u0086\3\2\2"+
		"\2\33\u0088\3\2\2\2\35\u008a\3\2\2\2\37\u008c\3\2\2\2!\u008e\3\2\2\2#"+
		"\u0090\3\2\2\2%\u0093\3\2\2\2\'\u0096\3\2\2\2)\u0099\3\2\2\2+\u009c\3"+
		"\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a5\3\2\2\2"+
		"\65\u00a8\3\2\2\2\67\u00aa\3\2\2\29\u00ac\3\2\2\2;\u00ae\3\2\2\2=\u00b0"+
		"\3\2\2\2?\u00b2\3\2\2\2A\u00b4\3\2\2\2C\u00b6\3\2\2\2E\u00b8\3\2\2\2G"+
		"\u00bb\3\2\2\2I\u00be\3\2\2\2K\u00c2\3\2\2\2M\u00c9\3\2\2\2O\u00d2\3\2"+
		"\2\2Q\u00d4\3\2\2\2ST\7x\2\2TU\7q\2\2UV\7k\2\2VW\7f\2\2W\4\3\2\2\2XY\7"+
		"t\2\2YZ\7g\2\2Z[\7v\2\2[\\\7w\2\2\\]\7t\2\2]^\7p\2\2^\6\3\2\2\2_`\7f\2"+
		"\2`a\7g\2\2ab\7h\2\2b\b\3\2\2\2cd\7k\2\2de\7h\2\2e\n\3\2\2\2fg\7g\2\2"+
		"gh\7n\2\2hi\7u\2\2ij\7g\2\2j\f\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7k\2\2no\7"+
		"n\2\2op\7g\2\2p\16\3\2\2\2qr\7x\2\2rs\7c\2\2st\7t\2\2t\20\3\2\2\2uv\7"+
		"k\2\2vw\7p\2\2wx\7v\2\2x\22\3\2\2\2yz\7u\2\2z{\7v\2\2{|\7t\2\2|}\7k\2"+
		"\2}~\7p\2\2~\177\7i\2\2\177\24\3\2\2\2\u0080\u0081\7p\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0083\7v\2\2\u0083\26\3\2\2\2\u0084\u0085\7,\2\2\u0085\30"+
		"\3\2\2\2\u0086\u0087\7\'\2\2\u0087\32\3\2\2\2\u0088\u0089\7\61\2\2\u0089"+
		"\34\3\2\2\2\u008a\u008b\7-\2\2\u008b\36\3\2\2\2\u008c\u008d\7/\2\2\u008d"+
		" \3\2\2\2\u008e\u008f\7`\2\2\u008f\"\3\2\2\2\u0090\u0091\7?\2\2\u0091"+
		"\u0092\7?\2\2\u0092$\3\2\2\2\u0093\u0094\7#\2\2\u0094\u0095\7?\2\2\u0095"+
		"&\3\2\2\2\u0096\u0097\7>\2\2\u0097\u0098\7?\2\2\u0098(\3\2\2\2\u0099\u009a"+
		"\7@\2\2\u009a\u009b\7?\2\2\u009b*\3\2\2\2\u009c\u009d\7>\2\2\u009d,\3"+
		"\2\2\2\u009e\u009f\7@\2\2\u009f.\3\2\2\2\u00a0\u00a1\7.\2\2\u00a1\60\3"+
		"\2\2\2\u00a2\u00a3\7(\2\2\u00a3\u00a4\7(\2\2\u00a4\62\3\2\2\2\u00a5\u00a6"+
		"\7~\2\2\u00a6\u00a7\7~\2\2\u00a7\64\3\2\2\2\u00a8\u00a9\7$\2\2\u00a9\66"+
		"\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab8\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad:\3"+
		"\2\2\2\u00ae\u00af\7}\2\2\u00af<\3\2\2\2\u00b0\u00b1\7\177\2\2\u00b1>"+
		"\3\2\2\2\u00b2\u00b3\7]\2\2\u00b3@\3\2\2\2\u00b4\u00b5\7_\2\2\u00b5B\3"+
		"\2\2\2\u00b6\u00b7\7?\2\2\u00b7D\3\2\2\2\u00b8\u00b9\7-\2\2\u00b9\u00ba"+
		"\7?\2\2\u00baF\3\2\2\2\u00bb\u00bc\7=\2\2\u00bcH\3\2\2\2\u00bd\u00bf\t"+
		"\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1J\3\2\2\2\u00c2\u00c6\t\3\2\2\u00c3\u00c5\t\4\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7L\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\t\5\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\b\'\2\2\u00ccN\3\2\2\2\u00cd\u00cf\7\17\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3"+
		"\7\f\2\2\u00d1\u00d3\7\17\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3P\3\2\2\2\u00d4\u00d8\7$\2\2\u00d5\u00d7\n\6\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7$\2\2\u00dcR\3\2\2\2\b"+
		"\2\u00c0\u00c6\u00ce\u00d2\u00d8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}