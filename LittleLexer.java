<<<<<<< Updated upstream
// Generated from Little.g4 by ANTLR 4.7.2
=======
// Generated from Little.g4 by ANTLR 4.5.2
>>>>>>> Stashed changes
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleLexer extends Lexer {
<<<<<<< Updated upstream
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }
=======
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }
>>>>>>> Stashed changes

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, WS=15, FLOATLITERAL=16, 
		INTLITERAL=17, COMMENT=18, KEYWORD=19, OPERATOR=20, STRINGLITERAL=21, 
		ID=22, PROGRAM=23, BEGIN=24, END=25, FUNCTION=26, READ=27, WRITE=28, IF=29, 
		ELSE=30, ENDIF=31, WHILE=32, ENDWHILE=33, CONTINUE=34, BREAK=35, RETURN=36, 
		INT=37, VOID=38, STRING=39, FLOAT=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

<<<<<<< Updated upstream
	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "WS", "FLOATLITERAL", 
			"INTLITERAL", "COMMENT", "KEYWORD", "OPERATOR", "STRINGLITERAL", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'BEGIN'", "'END'", "'\"\"'", "'STRING'", "':='", 
			"'FLOAT'", "'INT'", "'VOID'", "','", "'FUNCTION'", "'READ'", "'('", "')'", 
			"'WRITE'", "'RETURN'", "'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", 
			"'ELSE'", "'<'", "'>'", "'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "WS", "FLOATLITERAL", 
			"INTLITERAL", "COMMENT", "KEYWORD", "OPERATOR", "STRINGLITERAL", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
=======
	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "WS", "FLOATLITERAL", "INTLITERAL", 
		"COMMENT", "KEYWORD", "OPERATOR", "STRINGLITERAL", "ID", "PROGRAM", "BEGIN", 
		"END", "FUNCTION", "READ", "WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", 
		"CONTINUE", "BREAK", "RETURN", "INT", "VOID", "STRING", "FLOAT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "':='", "'<'", 
		"'>'", "'='", "'!='", "'<='", "'>='", null, null, null, null, null, null, 
		null, null, "'PROGRAM'", "'BEGIN'", "'END'", "'FUNCTION'", "'READ'", "'WRITE'", 
		"'IF'", "'ELSE'", "'ENDIF'", "'WHILE'", "'ENDWHILE'", "'CONTINUE'", "'BREAK'", 
		"'RETURN'", "'INT'", "'VOID'", "'STRING'", "'FLOAT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "WS", "FLOATLITERAL", "INTLITERAL", "COMMENT", "KEYWORD", 
		"OPERATOR", "STRINGLITERAL", "ID", "PROGRAM", "BEGIN", "END", "FUNCTION", 
		"READ", "WRITE", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "CONTINUE", 
		"BREAK", "RETURN", "INT", "VOID", "STRING", "FLOAT"
	};
>>>>>>> Stashed changes
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LittleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Little.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u0184\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\6\20u\n\20"+
		"\r\20\16\20v\3\20\3\20\3\21\7\21|\n\21\f\21\16\21\177\13\21\3\21\3\21"+
		"\6\21\u0083\n\21\r\21\16\21\u0084\3\22\6\22\u0088\n\22\r\22\16\22\u0089"+
		"\3\23\3\23\3\23\3\23\7\23\u0090\n\23\f\23\16\23\u0093\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f2\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fe\n\25\3\26\3\26\3\26\3\26\7\26"+
		"\u0104\n\26\f\26\16\26\u0107\13\26\3\26\3\26\3\27\6\27\u010c\n\27\r\27"+
		"\16\27\u010d\3\27\7\27\u0111\n\27\f\27\16\27\u0114\13\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\n\5\2\13\f\17\17\"\"\3\2\62;\4"+
		"\2\f\f\17\17\6\2,-//\61\61??\6\2*+..=>@@\5\2\f\f\17\17$$\5\2C\\aac|\5"+
		"\2\62;C\\c|\u01a2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2"+
		"\2\17_\3\2\2\2\21a\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31j\3\2"+
		"\2\2\33m\3\2\2\2\35p\3\2\2\2\37t\3\2\2\2!}\3\2\2\2#\u0087\3\2\2\2%\u008b"+
		"\3\2\2\2\'\u00f1\3\2\2\2)\u00fd\3\2\2\2+\u00ff\3\2\2\2-\u010b\3\2\2\2"+
		"/\u0115\3\2\2\2\61\u011d\3\2\2\2\63\u0123\3\2\2\2\65\u0127\3\2\2\2\67"+
		"\u0130\3\2\2\29\u0135\3\2\2\2;\u013b\3\2\2\2=\u013e\3\2\2\2?\u0143\3\2"+
		"\2\2A\u0149\3\2\2\2C\u014f\3\2\2\2E\u0158\3\2\2\2G\u0161\3\2\2\2I\u0167"+
		"\3\2\2\2K\u016e\3\2\2\2M\u0172\3\2\2\2O\u0177\3\2\2\2Q\u017e\3\2\2\2S"+
		"T\7.\2\2T\4\3\2\2\2UV\7*\2\2V\6\3\2\2\2WX\7+\2\2X\b\3\2\2\2YZ\7-\2\2Z"+
		"\n\3\2\2\2[\\\7/\2\2\\\f\3\2\2\2]^\7,\2\2^\16\3\2\2\2_`\7\61\2\2`\20\3"+
		"\2\2\2ab\7<\2\2bc\7?\2\2c\22\3\2\2\2de\7>\2\2e\24\3\2\2\2fg\7@\2\2g\26"+
		"\3\2\2\2hi\7?\2\2i\30\3\2\2\2jk\7#\2\2kl\7?\2\2l\32\3\2\2\2mn\7>\2\2n"+
		"o\7?\2\2o\34\3\2\2\2pq\7@\2\2qr\7?\2\2r\36\3\2\2\2su\t\2\2\2ts\3\2\2\2"+
		"uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\20\2\2y \3\2\2\2z|\t\3\2"+
		"\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0082\7\60\2\2\u0081\u0083\t\3\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\"\3\2\2\2"+
		"\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a$\3\2\2\2\u008b\u008c\7/\2\2\u008c\u008d"+
		"\7/\2\2\u008d\u0091\3\2\2\2\u008e\u0090\n\4\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092&\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0094\u0095\7R\2\2\u0095\u0096\7T\2\2\u0096\u0097"+
		"\7Q\2\2\u0097\u0098\7I\2\2\u0098\u0099\7T\2\2\u0099\u009a\7C\2\2\u009a"+
		"\u00f2\7O\2\2\u009b\u009c\7D\2\2\u009c\u009d\7G\2\2\u009d\u009e\7I\2\2"+
		"\u009e\u009f\7K\2\2\u009f\u00f2\7P\2\2\u00a0\u00a1\7G\2\2\u00a1\u00a2"+
		"\7P\2\2\u00a2\u00f2\7F\2\2\u00a3\u00a4\7H\2\2\u00a4\u00a5\7W\2\2\u00a5"+
		"\u00a6\7P\2\2\u00a6\u00a7\7E\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7K\2\2"+
		"\u00a9\u00aa\7Q\2\2\u00aa\u00f2\7P\2\2\u00ab\u00ac\7T\2\2\u00ac\u00ad"+
		"\7G\2\2\u00ad\u00ae\7C\2\2\u00ae\u00f2\7F\2\2\u00af\u00b0\7Y\2\2\u00b0"+
		"\u00b1\7T\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7V\2\2\u00b3\u00f2\7G\2\2"+
		"\u00b4\u00b5\7K\2\2\u00b5\u00f2\7H\2\2\u00b6\u00b7\7G\2\2\u00b7\u00b8"+
		"\7N\2\2\u00b8\u00b9\7U\2\2\u00b9\u00f2\7G\2\2\u00ba\u00bb\7G\2\2\u00bb"+
		"\u00bc\7P\2\2\u00bc\u00bd\7F\2\2\u00bd\u00be\7K\2\2\u00be\u00f2\7H\2\2"+
		"\u00bf\u00c0\7Y\2\2\u00c0\u00c1\7J\2\2\u00c1\u00c2\7K\2\2\u00c2\u00c3"+
		"\7N\2\2\u00c3\u00f2\7G\2\2\u00c4\u00c5\7G\2\2\u00c5\u00c6\7P\2\2\u00c6"+
		"\u00c7\7F\2\2\u00c7\u00c8\7Y\2\2\u00c8\u00c9\7J\2\2\u00c9\u00ca\7K\2\2"+
		"\u00ca\u00cb\7N\2\2\u00cb\u00f2\7G\2\2\u00cc\u00cd\7E\2\2\u00cd\u00ce"+
		"\7Q\2\2\u00ce\u00cf\7P\2\2\u00cf\u00d0\7V\2\2\u00d0\u00d1\7K\2\2\u00d1"+
		"\u00d2\7P\2\2\u00d2\u00d3\7W\2\2\u00d3\u00f2\7G\2\2\u00d4\u00d5\7D\2\2"+
		"\u00d5\u00d6\7T\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8\7C\2\2\u00d8\u00f2"+
		"\7M\2\2\u00d9\u00da\7T\2\2\u00da\u00db\7G\2\2\u00db\u00dc\7V\2\2\u00dc"+
		"\u00dd\7W\2\2\u00dd\u00de\7T\2\2\u00de\u00f2\7P\2\2\u00df\u00e0\7K\2\2"+
		"\u00e0\u00e1\7P\2\2\u00e1\u00f2\7V\2\2\u00e2\u00e3\7X\2\2\u00e3\u00e4"+
		"\7Q\2\2\u00e4\u00e5\7K\2\2\u00e5\u00f2\7F\2\2\u00e6\u00e7\7U\2\2\u00e7"+
		"\u00e8\7V\2\2\u00e8\u00e9\7T\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7P\2\2"+
		"\u00eb\u00f2\7I\2\2\u00ec\u00ed\7H\2\2\u00ed\u00ee\7N\2\2\u00ee\u00ef"+
		"\7Q\2\2\u00ef\u00f0\7C\2\2\u00f0\u00f2\7V\2\2\u00f1\u0094\3\2\2\2\u00f1"+
		"\u009b\3\2\2\2\u00f1\u00a0\3\2\2\2\u00f1\u00a3\3\2\2\2\u00f1\u00ab\3\2"+
		"\2\2\u00f1\u00af\3\2\2\2\u00f1\u00b4\3\2\2\2\u00f1\u00b6\3\2\2\2\u00f1"+
		"\u00ba\3\2\2\2\u00f1\u00bf\3\2\2\2\u00f1\u00c4\3\2\2\2\u00f1\u00cc\3\2"+
		"\2\2\u00f1\u00d4\3\2\2\2\u00f1\u00d9\3\2\2\2\u00f1\u00df\3\2\2\2\u00f1"+
		"\u00e2\3\2\2\2\u00f1\u00e6\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2(\3\2\2\2"+
		"\u00f3\u00f4\7<\2\2\u00f4\u00fe\7?\2\2\u00f5\u00fe\t\5\2\2\u00f6\u00f7"+
		"\7#\2\2\u00f7\u00fe\7?\2\2\u00f8\u00fe\t\6\2\2\u00f9\u00fa\7>\2\2\u00fa"+
		"\u00fe\7?\2\2\u00fb\u00fc\7@\2\2\u00fc\u00fe\7?\2\2\u00fd\u00f3\3\2\2"+
		"\2\u00fd\u00f5\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe*\3\2\2\2\u00ff\u0105\7$\2\2\u0100\u0104"+
		"\n\7\2\2\u0101\u0102\7$\2\2\u0102\u0104\7$\2\2\u0103\u0100\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7$\2\2\u0109"+
		",\3\2\2\2\u010a\u010c\t\b\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0112\3\2\2\2\u010f\u0111"+
		"\t\t\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113.\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7R\2\2\u0116"+
		"\u0117\7T\2\2\u0117\u0118\7Q\2\2\u0118\u0119\7I\2\2\u0119\u011a\7T\2\2"+
		"\u011a\u011b\7C\2\2\u011b\u011c\7O\2\2\u011c\60\3\2\2\2\u011d\u011e\7"+
		"D\2\2\u011e\u011f\7G\2\2\u011f\u0120\7I\2\2\u0120\u0121\7K\2\2\u0121\u0122"+
		"\7P\2\2\u0122\62\3\2\2\2\u0123\u0124\7G\2\2\u0124\u0125\7P\2\2\u0125\u0126"+
		"\7F\2\2\u0126\64\3\2\2\2\u0127\u0128\7H\2\2\u0128\u0129\7W\2\2\u0129\u012a"+
		"\7P\2\2\u012a\u012b\7E\2\2\u012b\u012c\7V\2\2\u012c\u012d\7K\2\2\u012d"+
		"\u012e\7Q\2\2\u012e\u012f\7P\2\2\u012f\66\3\2\2\2\u0130\u0131\7T\2\2\u0131"+
		"\u0132\7G\2\2\u0132\u0133\7C\2\2\u0133\u0134\7F\2\2\u01348\3\2\2\2\u0135"+
		"\u0136\7Y\2\2\u0136\u0137\7T\2\2\u0137\u0138\7K\2\2\u0138\u0139\7V\2\2"+
		"\u0139\u013a\7G\2\2\u013a:\3\2\2\2\u013b\u013c\7K\2\2\u013c\u013d\7H\2"+
		"\2\u013d<\3\2\2\2\u013e\u013f\7G\2\2\u013f\u0140\7N\2\2\u0140\u0141\7"+
		"U\2\2\u0141\u0142\7G\2\2\u0142>\3\2\2\2\u0143\u0144\7G\2\2\u0144\u0145"+
		"\7P\2\2\u0145\u0146\7F\2\2\u0146\u0147\7K\2\2\u0147\u0148\7H\2\2\u0148"+
		"@\3\2\2\2\u0149\u014a\7Y\2\2\u014a\u014b\7J\2\2\u014b\u014c\7K\2\2\u014c"+
		"\u014d\7N\2\2\u014d\u014e\7G\2\2\u014eB\3\2\2\2\u014f\u0150\7G\2\2\u0150"+
		"\u0151\7P\2\2\u0151\u0152\7F\2\2\u0152\u0153\7Y\2\2\u0153\u0154\7J\2\2"+
		"\u0154\u0155\7K\2\2\u0155\u0156\7N\2\2\u0156\u0157\7G\2\2\u0157D\3\2\2"+
		"\2\u0158\u0159\7E\2\2\u0159\u015a\7Q\2\2\u015a\u015b\7P\2\2\u015b\u015c"+
		"\7V\2\2\u015c\u015d\7K\2\2\u015d\u015e\7P\2\2\u015e\u015f\7W\2\2\u015f"+
		"\u0160\7G\2\2\u0160F\3\2\2\2\u0161\u0162\7D\2\2\u0162\u0163\7T\2\2\u0163"+
		"\u0164\7G\2\2\u0164\u0165\7C\2\2\u0165\u0166\7M\2\2\u0166H\3\2\2\2\u0167"+
		"\u0168\7T\2\2\u0168\u0169\7G\2\2\u0169\u016a\7V\2\2\u016a\u016b\7W\2\2"+
		"\u016b\u016c\7T\2\2\u016c\u016d\7P\2\2\u016dJ\3\2\2\2\u016e\u016f\7K\2"+
		"\2\u016f\u0170\7P\2\2\u0170\u0171\7V\2\2\u0171L\3\2\2\2\u0172\u0173\7"+
		"X\2\2\u0173\u0174\7Q\2\2\u0174\u0175\7K\2\2\u0175\u0176\7F\2\2\u0176N"+
		"\3\2\2\2\u0177\u0178\7U\2\2\u0178\u0179\7V\2\2\u0179\u017a\7T\2\2\u017a"+
		"\u017b\7K\2\2\u017b\u017c\7P\2\2\u017c\u017d\7I\2\2\u017dP\3\2\2\2\u017e"+
		"\u017f\7H\2\2\u017f\u0180\7N\2\2\u0180\u0181\7Q\2\2\u0181\u0182\7C\2\2"+
		"\u0182\u0183\7V\2\2\u0183R\3\2\2\2\20\2v}\u0084\u0089\u0091\u00f1\u00fd"+
		"\u0103\u0105\u010b\u010d\u0110\u0112\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}