// Generated from Little.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		WS=32, FLOATLITERAL=33, INTLITERAL=34, COMMENT=35, KEYWORD=36, OPERATOR=37, 
		STRINGLITERAL=38, ID=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0176\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		"!\6!\u00d6\n!\r!\16!\u00d7\3!\3!\3\"\7\"\u00dd\n\"\f\"\16\"\u00e0\13\""+
		"\3\"\3\"\6\"\u00e4\n\"\r\"\16\"\u00e5\3#\6#\u00e9\n#\r#\16#\u00ea\3$\3"+
		"$\3$\3$\7$\u00f1\n$\f$\16$\u00f4\13$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0153\n%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\5&\u015f\n&\3\'\3\'\3\'\3\'\7\'\u0165\n\'\f\'\16\'\u0168"+
		"\13\'\3\'\3\'\3(\6(\u016d\n(\r(\16(\u016e\3(\7(\u0172\n(\f(\16(\u0175"+
		"\13(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\n\5\2\13\f\17\17\"\"\3\2\62;\4\2"+
		"\f\f\17\17\6\2,-//\61\61??\6\2*+..=>@@\5\2\f\f\17\17$$\5\2C\\aac|\5\2"+
		"\62;C\\c|\2\u0194\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2"+
		"\2\2\5Y\3\2\2\2\7_\3\2\2\2\tc\3\2\2\2\13f\3\2\2\2\rm\3\2\2\2\17p\3\2\2"+
		"\2\21v\3\2\2\2\23z\3\2\2\2\25\177\3\2\2\2\27\u0081\3\2\2\2\31\u008a\3"+
		"\2\2\2\33\u008f\3\2\2\2\35\u0091\3\2\2\2\37\u0093\3\2\2\2!\u0099\3\2\2"+
		"\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8"+
		"\3\2\2\2-\u00ab\3\2\2\2/\u00b1\3\2\2\2\61\u00b6\3\2\2\2\63\u00b8\3\2\2"+
		"\2\65\u00ba\3\2\2\2\67\u00bc\3\2\2\29\u00bf\3\2\2\2;\u00c2\3\2\2\2=\u00c5"+
		"\3\2\2\2?\u00cb\3\2\2\2A\u00d5\3\2\2\2C\u00de\3\2\2\2E\u00e8\3\2\2\2G"+
		"\u00ec\3\2\2\2I\u0152\3\2\2\2K\u015e\3\2\2\2M\u0160\3\2\2\2O\u016c\3\2"+
		"\2\2QR\7R\2\2RS\7T\2\2ST\7Q\2\2TU\7I\2\2UV\7T\2\2VW\7C\2\2WX\7O\2\2X\4"+
		"\3\2\2\2YZ\7D\2\2Z[\7G\2\2[\\\7I\2\2\\]\7K\2\2]^\7P\2\2^\6\3\2\2\2_`\7"+
		"G\2\2`a\7P\2\2ab\7F\2\2b\b\3\2\2\2cd\7$\2\2de\7$\2\2e\n\3\2\2\2fg\7U\2"+
		"\2gh\7V\2\2hi\7T\2\2ij\7K\2\2jk\7P\2\2kl\7I\2\2l\f\3\2\2\2mn\7<\2\2no"+
		"\7?\2\2o\16\3\2\2\2pq\7H\2\2qr\7N\2\2rs\7Q\2\2st\7C\2\2tu\7V\2\2u\20\3"+
		"\2\2\2vw\7K\2\2wx\7P\2\2xy\7V\2\2y\22\3\2\2\2z{\7X\2\2{|\7Q\2\2|}\7K\2"+
		"\2}~\7F\2\2~\24\3\2\2\2\177\u0080\7.\2\2\u0080\26\3\2\2\2\u0081\u0082"+
		"\7H\2\2\u0082\u0083\7W\2\2\u0083\u0084\7P\2\2\u0084\u0085\7E\2\2\u0085"+
		"\u0086\7V\2\2\u0086\u0087\7K\2\2\u0087\u0088\7Q\2\2\u0088\u0089\7P\2\2"+
		"\u0089\30\3\2\2\2\u008a\u008b\7T\2\2\u008b\u008c\7G\2\2\u008c\u008d\7"+
		"C\2\2\u008d\u008e\7F\2\2\u008e\32\3\2\2\2\u008f\u0090\7*\2\2\u0090\34"+
		"\3\2\2\2\u0091\u0092\7+\2\2\u0092\36\3\2\2\2\u0093\u0094\7Y\2\2\u0094"+
		"\u0095\7T\2\2\u0095\u0096\7K\2\2\u0096\u0097\7V\2\2\u0097\u0098\7G\2\2"+
		"\u0098 \3\2\2\2\u0099\u009a\7T\2\2\u009a\u009b\7G\2\2\u009b\u009c\7V\2"+
		"\2\u009c\u009d\7W\2\2\u009d\u009e\7T\2\2\u009e\u009f\7P\2\2\u009f\"\3"+
		"\2\2\2\u00a0\u00a1\7-\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3&\3\2"+
		"\2\2\u00a4\u00a5\7,\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7*\3\2"+
		"\2\2\u00a8\u00a9\7K\2\2\u00a9\u00aa\7H\2\2\u00aa,\3\2\2\2\u00ab\u00ac"+
		"\7G\2\2\u00ac\u00ad\7P\2\2\u00ad\u00ae\7F\2\2\u00ae\u00af\7K\2\2\u00af"+
		"\u00b0\7H\2\2\u00b0.\3\2\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\7N\2\2\u00b3"+
		"\u00b4\7U\2\2\u00b4\u00b5\7G\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7"+
		"\62\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb"+
		"\66\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be\7?\2\2\u00be8\3\2\2\2\u00bf"+
		"\u00c0\7>\2\2\u00c0\u00c1\7?\2\2\u00c1:\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3"+
		"\u00c4\7?\2\2\u00c4<\3\2\2\2\u00c5\u00c6\7Y\2\2\u00c6\u00c7\7J\2\2\u00c7"+
		"\u00c8\7K\2\2\u00c8\u00c9\7N\2\2\u00c9\u00ca\7G\2\2\u00ca>\3\2\2\2\u00cb"+
		"\u00cc\7G\2\2\u00cc\u00cd\7P\2\2\u00cd\u00ce\7F\2\2\u00ce\u00cf\7Y\2\2"+
		"\u00cf\u00d0\7J\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2\7N\2\2\u00d2\u00d3"+
		"\7G\2\2\u00d3@\3\2\2\2\u00d4\u00d6\t\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\b!\2\2\u00daB\3\2\2\2\u00db\u00dd\t\3\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\7\60\2\2\u00e2\u00e4\t\3\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6D\3\2\2\2\u00e7\u00e9\t\3\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ebF\3\2\2\2\u00ec"+
		"\u00ed\7/\2\2\u00ed\u00ee\7/\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\n\4\2"+
		"\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3H\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7R\2\2\u00f6\u00f7"+
		"\7T\2\2\u00f7\u00f8\7Q\2\2\u00f8\u00f9\7I\2\2\u00f9\u00fa\7T\2\2\u00fa"+
		"\u00fb\7C\2\2\u00fb\u0153\7O\2\2\u00fc\u00fd\7D\2\2\u00fd\u00fe\7G\2\2"+
		"\u00fe\u00ff\7I\2\2\u00ff\u0100\7K\2\2\u0100\u0153\7P\2\2\u0101\u0102"+
		"\7G\2\2\u0102\u0103\7P\2\2\u0103\u0153\7F\2\2\u0104\u0105\7H\2\2\u0105"+
		"\u0106\7W\2\2\u0106\u0107\7P\2\2\u0107\u0108\7E\2\2\u0108\u0109\7V\2\2"+
		"\u0109\u010a\7K\2\2\u010a\u010b\7Q\2\2\u010b\u0153\7P\2\2\u010c\u010d"+
		"\7T\2\2\u010d\u010e\7G\2\2\u010e\u010f\7C\2\2\u010f\u0153\7F\2\2\u0110"+
		"\u0111\7Y\2\2\u0111\u0112\7T\2\2\u0112\u0113\7K\2\2\u0113\u0114\7V\2\2"+
		"\u0114\u0153\7G\2\2\u0115\u0116\7K\2\2\u0116\u0153\7H\2\2\u0117\u0118"+
		"\7G\2\2\u0118\u0119\7N\2\2\u0119\u011a\7U\2\2\u011a\u0153\7G\2\2\u011b"+
		"\u011c\7G\2\2\u011c\u011d\7P\2\2\u011d\u011e\7F\2\2\u011e\u011f\7K\2\2"+
		"\u011f\u0153\7H\2\2\u0120\u0121\7Y\2\2\u0121\u0122\7J\2\2\u0122\u0123"+
		"\7K\2\2\u0123\u0124\7N\2\2\u0124\u0153\7G\2\2\u0125\u0126\7G\2\2\u0126"+
		"\u0127\7P\2\2\u0127\u0128\7F\2\2\u0128\u0129\7Y\2\2\u0129\u012a\7J\2\2"+
		"\u012a\u012b\7K\2\2\u012b\u012c\7N\2\2\u012c\u0153\7G\2\2\u012d\u012e"+
		"\7E\2\2\u012e\u012f\7Q\2\2\u012f\u0130\7P\2\2\u0130\u0131\7V\2\2\u0131"+
		"\u0132\7K\2\2\u0132\u0133\7P\2\2\u0133\u0134\7W\2\2\u0134\u0153\7G\2\2"+
		"\u0135\u0136\7D\2\2\u0136\u0137\7T\2\2\u0137\u0138\7G\2\2\u0138\u0139"+
		"\7C\2\2\u0139\u0153\7M\2\2\u013a\u013b\7T\2\2\u013b\u013c\7G\2\2\u013c"+
		"\u013d\7V\2\2\u013d\u013e\7W\2\2\u013e\u013f\7T\2\2\u013f\u0153\7P\2\2"+
		"\u0140\u0141\7K\2\2\u0141\u0142\7P\2\2\u0142\u0153\7V\2\2\u0143\u0144"+
		"\7X\2\2\u0144\u0145\7Q\2\2\u0145\u0146\7K\2\2\u0146\u0153\7F\2\2\u0147"+
		"\u0148\7U\2\2\u0148\u0149\7V\2\2\u0149\u014a\7T\2\2\u014a\u014b\7K\2\2"+
		"\u014b\u014c\7P\2\2\u014c\u0153\7I\2\2\u014d\u014e\7H\2\2\u014e\u014f"+
		"\7N\2\2\u014f\u0150\7Q\2\2\u0150\u0151\7C\2\2\u0151\u0153\7V\2\2\u0152"+
		"\u00f5\3\2\2\2\u0152\u00fc\3\2\2\2\u0152\u0101\3\2\2\2\u0152\u0104\3\2"+
		"\2\2\u0152\u010c\3\2\2\2\u0152\u0110\3\2\2\2\u0152\u0115\3\2\2\2\u0152"+
		"\u0117\3\2\2\2\u0152\u011b\3\2\2\2\u0152\u0120\3\2\2\2\u0152\u0125\3\2"+
		"\2\2\u0152\u012d\3\2\2\2\u0152\u0135\3\2\2\2\u0152\u013a\3\2\2\2\u0152"+
		"\u0140\3\2\2\2\u0152\u0143\3\2\2\2\u0152\u0147\3\2\2\2\u0152\u014d\3\2"+
		"\2\2\u0153J\3\2\2\2\u0154\u0155\7<\2\2\u0155\u015f\7?\2\2\u0156\u015f"+
		"\t\5\2\2\u0157\u0158\7#\2\2\u0158\u015f\7?\2\2\u0159\u015f\t\6\2\2\u015a"+
		"\u015b\7>\2\2\u015b\u015f\7?\2\2\u015c\u015d\7@\2\2\u015d\u015f\7?\2\2"+
		"\u015e\u0154\3\2\2\2\u015e\u0156\3\2\2\2\u015e\u0157\3\2\2\2\u015e\u0159"+
		"\3\2\2\2\u015e\u015a\3\2\2\2\u015e\u015c\3\2\2\2\u015fL\3\2\2\2\u0160"+
		"\u0166\7$\2\2\u0161\u0165\n\7\2\2\u0162\u0163\7$\2\2\u0163\u0165\7$\2"+
		"\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\7$\2\2\u016aN\3\2\2\2\u016b\u016d\t\b\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0173\3\2"+
		"\2\2\u0170\u0172\t\t\2\2\u0171\u0170\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174P\3\2\2\2\u0175\u0173\3\2\2\2"+
		"\20\2\u00d7\u00de\u00e5\u00ea\u00f2\u0152\u015e\u0164\u0166\u016c\u016e"+
		"\u0171\u0173\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}