// Generated from C:/Users/daniel.o.martins/Documents/Faculdade/src/main/antlr4/Grammar.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TYPE=5, ID=6, INT=7, FLOAT=8, STRING=9, 
		PLUS=10, ASSING=11, EQUALS=12, IF=13, ELSE=14, SEMICOLON=15, NOTEQUAL=16, 
		LT=17, LTEQUAL=18, GT=19, GTEQUAL=20, PRINT=21, NEWLINE=22, WS=23, COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TYPE", "ID", "INT", "FLOAT", "STRING", 
			"PLUS", "ASSING", "EQUALS", "IF", "ELSE", "SEMICOLON", "NOTEQUAL", "LT", 
			"LTEQUAL", "GT", "GTEQUAL", "PRINT", "NEWLINE", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", null, null, null, null, null, "'+'", 
			"'='", "'=='", "'if'", "'else'", "';'", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TYPE", "ID", "INT", "FLOAT", "STRING", 
			"PLUS", "ASSING", "EQUALS", "IF", "ELSE", "SEMICOLON", "NOTEQUAL", "LT", 
			"LTEQUAL", "GT", "GTEQUAL", "PRINT", "NEWLINE", "WS", "COMMENT"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000\u0018\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004H\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0005\u0005L\b\u0005\n\u0005\f\u0005O\t\u0005"+
		"\u0001\u0006\u0004\u0006R\b\u0006\u000b\u0006\f\u0006S\u0001\u0007\u0004"+
		"\u0007W\b\u0007\u000b\u0007\f\u0007X\u0001\u0007\u0001\u0007\u0004\u0007"+
		"]\b\u0007\u000b\u0007\f\u0007^\u0001\u0007\u0001\u0007\u0004\u0007c\b"+
		"\u0007\u000b\u0007\f\u0007d\u0001\u0007\u0004\u0007h\b\u0007\u000b\u0007"+
		"\f\u0007i\u0001\u0007\u0003\u0007m\b\u0007\u0001\b\u0001\b\u0005\bq\b"+
		"\b\n\b\f\bt\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0004\u0015\u009d\b\u0015\u000b\u0015\f\u0015\u009e\u0001\u0016\u0004"+
		"\u0016\u00a2\b\u0016\u000b\u0016\f\u0016\u00a3\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00ac\b\u0017"+
		"\n\u0017\f\u0017\u00af\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0002r\u00ad\u0000\u0018\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0005\u0001"+
		"\u0000az\u0002\u0000AZ__\u0001\u000009\u0002\u0000\n\n\r\r\u0003\u0000"+
		"\t\n\r\r  \u00c2\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"3\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000\u00077\u0001"+
		"\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000bI\u0001\u0000\u0000"+
		"\u0000\rQ\u0001\u0000\u0000\u0000\u000fl\u0001\u0000\u0000\u0000\u0011"+
		"n\u0001\u0000\u0000\u0000\u0013w\u0001\u0000\u0000\u0000\u0015y\u0001"+
		"\u0000\u0000\u0000\u0017{\u0001\u0000\u0000\u0000\u0019~\u0001\u0000\u0000"+
		"\u0000\u001b\u0081\u0001\u0000\u0000\u0000\u001d\u0086\u0001\u0000\u0000"+
		"\u0000\u001f\u0088\u0001\u0000\u0000\u0000!\u008b\u0001\u0000\u0000\u0000"+
		"#\u008d\u0001\u0000\u0000\u0000%\u0090\u0001\u0000\u0000\u0000\'\u0092"+
		"\u0001\u0000\u0000\u0000)\u0095\u0001\u0000\u0000\u0000+\u009c\u0001\u0000"+
		"\u0000\u0000-\u00a1\u0001\u0000\u0000\u0000/\u00a7\u0001\u0000\u0000\u0000"+
		"12\u0005(\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005)\u0000\u0000"+
		"4\u0004\u0001\u0000\u0000\u000056\u0005{\u0000\u00006\u0006\u0001\u0000"+
		"\u0000\u000078\u0005}\u0000\u00008\b\u0001\u0000\u0000\u00009:\u0005i"+
		"\u0000\u0000:;\u0005n\u0000\u0000;H\u0005t\u0000\u0000<=\u0005f\u0000"+
		"\u0000=>\u0005l\u0000\u0000>?\u0005o\u0000\u0000?@\u0005a\u0000\u0000"+
		"@H\u0005t\u0000\u0000AB\u0005S\u0000\u0000BC\u0005t\u0000\u0000CD\u0005"+
		"r\u0000\u0000DE\u0005i\u0000\u0000EF\u0005n\u0000\u0000FH\u0005g\u0000"+
		"\u0000G9\u0001\u0000\u0000\u0000G<\u0001\u0000\u0000\u0000GA\u0001\u0000"+
		"\u0000\u0000H\n\u0001\u0000\u0000\u0000IM\u0007\u0000\u0000\u0000JL\u0007"+
		"\u0001\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\f\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PR\u0007\u0002\u0000\u0000QP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UW\u0007\u0002\u0000"+
		"\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0005"+
		".\u0000\u0000[]\u0007\u0002\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_m\u0001\u0000\u0000\u0000`b\u0005.\u0000\u0000ac\u0007\u0002\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000em\u0001\u0000\u0000\u0000fh\u0007\u0002"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"km\u0005.\u0000\u0000lV\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000\u0000"+
		"lg\u0001\u0000\u0000\u0000m\u0010\u0001\u0000\u0000\u0000nr\u0005\"\u0000"+
		"\u0000oq\t\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\"\u0000\u0000v\u0012\u0001"+
		"\u0000\u0000\u0000wx\u0005+\u0000\u0000x\u0014\u0001\u0000\u0000\u0000"+
		"yz\u0005=\u0000\u0000z\u0016\u0001\u0000\u0000\u0000{|\u0005=\u0000\u0000"+
		"|}\u0005=\u0000\u0000}\u0018\u0001\u0000\u0000\u0000~\u007f\u0005i\u0000"+
		"\u0000\u007f\u0080\u0005f\u0000\u0000\u0080\u001a\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005e\u0000\u0000\u0082\u0083\u0005l\u0000\u0000\u0083\u0084"+
		"\u0005s\u0000\u0000\u0084\u0085\u0005e\u0000\u0000\u0085\u001c\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005;\u0000\u0000\u0087\u001e\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005!\u0000\u0000\u0089\u008a\u0005=\u0000\u0000\u008a"+
		" \u0001\u0000\u0000\u0000\u008b\u008c\u0005<\u0000\u0000\u008c\"\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005<\u0000\u0000\u008e\u008f\u0005=\u0000"+
		"\u0000\u008f$\u0001\u0000\u0000\u0000\u0090\u0091\u0005>\u0000\u0000\u0091"+
		"&\u0001\u0000\u0000\u0000\u0092\u0093\u0005>\u0000\u0000\u0093\u0094\u0005"+
		"=\u0000\u0000\u0094(\u0001\u0000\u0000\u0000\u0095\u0096\u0005p\u0000"+
		"\u0000\u0096\u0097\u0005r\u0000\u0000\u0097\u0098\u0005i\u0000\u0000\u0098"+
		"\u0099\u0005n\u0000\u0000\u0099\u009a\u0005t\u0000\u0000\u009a*\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0007\u0003\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f,\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0007\u0004\u0000\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0006\u0016\u0000\u0000\u00a6.\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005/\u0000\u0000\u00a8\u00a9\u0005*\u0000\u0000\u00a9"+
		"\u00ad\u0001\u0000\u0000\u0000\u00aa\u00ac\t\u0000\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005*\u0000\u0000\u00b1\u00b2\u0005/\u0000\u0000\u00b2\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0006\u0017\u0000\u0000\u00b40\u0001\u0000\u0000"+
		"\u0000\r\u0000GMSX^dilr\u009e\u00a3\u00ad\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}