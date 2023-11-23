// Generated from C:/Users/danie/Documents/A3_Computacao_Grafica/CompiladorA3/src/main/antlr4/Grammar.g4 by ANTLR 4.13.1
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
		ID=1, INT=2, FLOAT=3, STRING=4, PLUS=5, EQUALS=6, IF=7, ELSE=8, WHILE=9, 
		DO=10, SEMICOLON=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, NOTEQUAL=16, 
		LT=17, LTEQUAL=18, GT=19, GTEQUAL=20, PRINT=21, WRITE=22, WS=23, COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "INT", "FLOAT", "STRING", "PLUS", "EQUALS", "IF", "ELSE", "WHILE", 
			"DO", "SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "NOTEQUAL", 
			"LT", "LTEQUAL", "GT", "GTEQUAL", "PRINT", "WRITE", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'+'", "'='", "'if'", "'else'", "'while'", 
			"'do'", "';'", "'('", "')'", "'{'", "'}'", "'!='", "'<'", "'<='", "'>'", 
			"'>='", "'print'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "INT", "FLOAT", "STRING", "PLUS", "EQUALS", "IF", "ELSE", 
			"WHILE", "DO", "SEMICOLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "NOTEQUAL", 
			"LT", "LTEQUAL", "GT", "GTEQUAL", "PRINT", "WRITE", "WS", "COMMENT"
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
		"\u0004\u0000\u0018\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000"+
		"\u0001\u0001\u0004\u0001:\b\u0001\u000b\u0001\f\u0001;\u0001\u0002\u0004"+
		"\u0002?\b\u0002\u000b\u0002\f\u0002@\u0001\u0002\u0001\u0002\u0004\u0002"+
		"E\b\u0002\u000b\u0002\f\u0002F\u0001\u0002\u0001\u0002\u0004\u0002K\b"+
		"\u0002\u000b\u0002\f\u0002L\u0001\u0002\u0004\u0002P\b\u0002\u000b\u0002"+
		"\f\u0002Q\u0001\u0002\u0003\u0002U\b\u0002\u0001\u0003\u0001\u0003\u0005"+
		"\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016\u0099\b\u0016\u000b"+
		"\u0016\f\u0016\u009a\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u00a3\b\u0017\n\u0017\f\u0017\u00a6\t\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0002Z\u00a4"+
		"\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u0018\u0001\u0000\u0004\u0002\u0000AZ__\u0001\u0000az\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u00b6\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000"+
		"\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005T\u0001\u0000\u0000\u0000"+
		"\u0007V\u0001\u0000\u0000\u0000\t_\u0001\u0000\u0000\u0000\u000ba\u0001"+
		"\u0000\u0000\u0000\rc\u0001\u0000\u0000\u0000\u000ff\u0001\u0000\u0000"+
		"\u0000\u0011k\u0001\u0000\u0000\u0000\u0013q\u0001\u0000\u0000\u0000\u0015"+
		"t\u0001\u0000\u0000\u0000\u0017v\u0001\u0000\u0000\u0000\u0019x\u0001"+
		"\u0000\u0000\u0000\u001bz\u0001\u0000\u0000\u0000\u001d|\u0001\u0000\u0000"+
		"\u0000\u001f~\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#"+
		"\u0083\u0001\u0000\u0000\u0000%\u0086\u0001\u0000\u0000\u0000\'\u0088"+
		"\u0001\u0000\u0000\u0000)\u008b\u0001\u0000\u0000\u0000+\u0091\u0001\u0000"+
		"\u0000\u0000-\u0098\u0001\u0000\u0000\u0000/\u009e\u0001\u0000\u0000\u0000"+
		"15\u0007\u0000\u0000\u000024\u0007\u0001\u0000\u000032\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006\u0002\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"8:\u0007\u0002\u0000\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0004\u0001"+
		"\u0000\u0000\u0000=?\u0007\u0002\u0000\u0000>=\u0001\u0000\u0000\u0000"+
		"?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0005.\u0000\u0000CE\u0007\u0002\u0000"+
		"\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GU\u0001\u0000\u0000\u0000HJ\u0005"+
		".\u0000\u0000IK\u0007\u0002\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000"+
		"MU\u0001\u0000\u0000\u0000NP\u0007\u0002\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SU\u0005.\u0000\u0000T>\u0001\u0000"+
		"\u0000\u0000TH\u0001\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000U\u0006"+
		"\u0001\u0000\u0000\u0000VZ\u0005\"\u0000\u0000WY\t\u0000\u0000\u0000X"+
		"W\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]^\u0005\"\u0000\u0000^\b\u0001\u0000\u0000\u0000_`\u0005"+
		"+\u0000\u0000`\n\u0001\u0000\u0000\u0000ab\u0005=\u0000\u0000b\f\u0001"+
		"\u0000\u0000\u0000cd\u0005i\u0000\u0000de\u0005f\u0000\u0000e\u000e\u0001"+
		"\u0000\u0000\u0000fg\u0005e\u0000\u0000gh\u0005l\u0000\u0000hi\u0005s"+
		"\u0000\u0000ij\u0005e\u0000\u0000j\u0010\u0001\u0000\u0000\u0000kl\u0005"+
		"w\u0000\u0000lm\u0005h\u0000\u0000mn\u0005i\u0000\u0000no\u0005l\u0000"+
		"\u0000op\u0005e\u0000\u0000p\u0012\u0001\u0000\u0000\u0000qr\u0005d\u0000"+
		"\u0000rs\u0005o\u0000\u0000s\u0014\u0001\u0000\u0000\u0000tu\u0005;\u0000"+
		"\u0000u\u0016\u0001\u0000\u0000\u0000vw\u0005(\u0000\u0000w\u0018\u0001"+
		"\u0000\u0000\u0000xy\u0005)\u0000\u0000y\u001a\u0001\u0000\u0000\u0000"+
		"z{\u0005{\u0000\u0000{\u001c\u0001\u0000\u0000\u0000|}\u0005}\u0000\u0000"+
		"}\u001e\u0001\u0000\u0000\u0000~\u007f\u0005!\u0000\u0000\u007f\u0080"+
		"\u0005=\u0000\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0082\u0005<"+
		"\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0084\u0005<\u0000"+
		"\u0000\u0084\u0085\u0005=\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005>\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		">\u0000\u0000\u0089\u008a\u0005=\u0000\u0000\u008a(\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005p\u0000\u0000\u008c\u008d\u0005r\u0000\u0000\u008d"+
		"\u008e\u0005i\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f\u0090\u0005"+
		"t\u0000\u0000\u0090*\u0001\u0000\u0000\u0000\u0091\u0092\u0005w\u0000"+
		"\u0000\u0092\u0093\u0005r\u0000\u0000\u0093\u0094\u0005i\u0000\u0000\u0094"+
		"\u0095\u0005t\u0000\u0000\u0095\u0096\u0005e\u0000\u0000\u0096,\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0007\u0003\u0000\u0000\u0098\u0097\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0006\u0016\u0000\u0000\u009d.\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005/\u0000\u0000\u009f\u00a0\u0005*\u0000\u0000"+
		"\u00a0\u00a4\u0001\u0000\u0000\u0000\u00a1\u00a3\t\u0000\u0000\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005*\u0000\u0000\u00a8\u00a9\u0005/\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0006\u0017\u0000\u0000\u00ab0\u0001\u0000"+
		"\u0000\u0000\u000b\u00005;@FLQTZ\u009a\u00a4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}