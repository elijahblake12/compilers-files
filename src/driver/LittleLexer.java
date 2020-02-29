package driver;

// Generated from Little.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, FLOATLITERAL=2, INTLITERAL=3, COMMENT=4, KEYWORD=5, OPERATOR=6, 
		STRINGLITERAL=7, ID=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "FLOATLITERAL", "INTLITERAL", "COMMENT", "KEYWORD", "OPERATOR", 
		"STRINGLITERAL", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "FLOATLITERAL", "INTLITERAL", "COMMENT", "KEYWORD", "OPERATOR", 
		"STRINGLITERAL", "ID"
	};
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
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00b5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\2\3\2\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\3\3\3\6\3#"+
		"\n\3\r\3\16\3$\3\4\6\4(\n\4\r\4\16\4)\3\5\3\5\3\5\3\5\7\5\60\n\5\f\5\16"+
		"\5\63\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0092\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3\b\3\b\7\b\u00a4\n\b\f\b\16\b"+
		"\u00a7\13\b\3\b\3\b\3\t\6\t\u00ac\n\t\r\t\16\t\u00ad\3\t\7\t\u00b1\n\t"+
		"\f\t\16\t\u00b4\13\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\n\5"+
		"\2\13\f\17\17\"\"\3\2\62;\4\2\f\f\17\17\6\2,-//\61\61??\6\2*+..=>@@\5"+
		"\2\f\f\17\17$$\5\2C\\aac|\5\2\62;C\\c|\2\u00d3\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\3\24\3\2\2\2\5\35\3\2\2\2\7\'\3\2\2\2\t+\3\2\2\2\13\u0091\3\2\2"+
		"\2\r\u009d\3\2\2\2\17\u009f\3\2\2\2\21\u00ab\3\2\2\2\23\25\t\2\2\2\24"+
		"\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30"+
		"\31\b\2\2\2\31\4\3\2\2\2\32\34\t\3\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35"+
		"\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 \"\7\60\2\2!#\t\3"+
		"\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\6\3\2\2\2&(\t\3\2\2\'"+
		"&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\b\3\2\2\2+,\7/\2\2,-\7/\2\2"+
		"-\61\3\2\2\2.\60\n\4\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2"+
		"\2\2\62\n\3\2\2\2\63\61\3\2\2\2\64\65\7R\2\2\65\66\7T\2\2\66\67\7Q\2\2"+
		"\678\7I\2\289\7T\2\29:\7C\2\2:\u0092\7O\2\2;<\7D\2\2<=\7G\2\2=>\7I\2\2"+
		">?\7K\2\2?\u0092\7P\2\2@A\7G\2\2AB\7P\2\2B\u0092\7F\2\2CD\7H\2\2DE\7W"+
		"\2\2EF\7P\2\2FG\7E\2\2GH\7V\2\2HI\7K\2\2IJ\7Q\2\2J\u0092\7P\2\2KL\7T\2"+
		"\2LM\7G\2\2MN\7C\2\2N\u0092\7F\2\2OP\7Y\2\2PQ\7T\2\2QR\7K\2\2RS\7V\2\2"+
		"S\u0092\7G\2\2TU\7K\2\2U\u0092\7H\2\2VW\7G\2\2WX\7N\2\2XY\7U\2\2Y\u0092"+
		"\7G\2\2Z[\7G\2\2[\\\7P\2\2\\]\7F\2\2]^\7K\2\2^\u0092\7H\2\2_`\7Y\2\2`"+
		"a\7J\2\2ab\7K\2\2bc\7N\2\2c\u0092\7G\2\2de\7G\2\2ef\7P\2\2fg\7F\2\2gh"+
		"\7Y\2\2hi\7J\2\2ij\7K\2\2jk\7N\2\2k\u0092\7G\2\2lm\7E\2\2mn\7Q\2\2no\7"+
		"P\2\2op\7V\2\2pq\7K\2\2qr\7P\2\2rs\7W\2\2s\u0092\7G\2\2tu\7D\2\2uv\7T"+
		"\2\2vw\7G\2\2wx\7C\2\2x\u0092\7M\2\2yz\7T\2\2z{\7G\2\2{|\7V\2\2|}\7W\2"+
		"\2}~\7T\2\2~\u0092\7P\2\2\177\u0080\7K\2\2\u0080\u0081\7P\2\2\u0081\u0092"+
		"\7V\2\2\u0082\u0083\7X\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7K\2\2\u0085"+
		"\u0092\7F\2\2\u0086\u0087\7U\2\2\u0087\u0088\7V\2\2\u0088\u0089\7T\2\2"+
		"\u0089\u008a\7K\2\2\u008a\u008b\7P\2\2\u008b\u0092\7I\2\2\u008c\u008d"+
		"\7H\2\2\u008d\u008e\7N\2\2\u008e\u008f\7Q\2\2\u008f\u0090\7C\2\2\u0090"+
		"\u0092\7V\2\2\u0091\64\3\2\2\2\u0091;\3\2\2\2\u0091@\3\2\2\2\u0091C\3"+
		"\2\2\2\u0091K\3\2\2\2\u0091O\3\2\2\2\u0091T\3\2\2\2\u0091V\3\2\2\2\u0091"+
		"Z\3\2\2\2\u0091_\3\2\2\2\u0091d\3\2\2\2\u0091l\3\2\2\2\u0091t\3\2\2\2"+
		"\u0091y\3\2\2\2\u0091\177\3\2\2\2\u0091\u0082\3\2\2\2\u0091\u0086\3\2"+
		"\2\2\u0091\u008c\3\2\2\2\u0092\f\3\2\2\2\u0093\u0094\7<\2\2\u0094\u009e"+
		"\7?\2\2\u0095\u009e\t\5\2\2\u0096\u0097\7#\2\2\u0097\u009e\7?\2\2\u0098"+
		"\u009e\t\6\2\2\u0099\u009a\7>\2\2\u009a\u009e\7?\2\2\u009b\u009c\7@\2"+
		"\2\u009c\u009e\7?\2\2\u009d\u0093\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0096"+
		"\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\16\3\2\2\2\u009f\u00a5\7$\2\2\u00a0\u00a4\n\7\2\2\u00a1\u00a2\7$\2\2"+
		"\u00a2\u00a4\7$\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00a9\7$\2\2\u00a9\20\3\2\2\2\u00aa\u00ac\t\b\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\t\t\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\22\3\2\2"+
		"\2\u00b4\u00b2\3\2\2\2\20\2\26\35$)\61\u0091\u009d\u00a3\u00a5\u00ab\u00ad"+
		"\u00b0\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}