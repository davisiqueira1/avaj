// Generated from Avaj.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AvajLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TYPE=3, STRING=4, ATRIB=5, AP=6, FP=7, AC=8, FC=9, OP=10, 
		OPR=11, OPCON=12, IN=13, OUT=14, RET=15, COND=16, ELSE=17, WHILE=18, NUM=19, 
		ID=20, WS=21, ERROR=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TYPE", "STRING", "ATRIB", "AP", "FP", "AC", "FC", "OP", 
			"OPR", "OPCON", "IN", "OUT", "RET", "COND", "ELSE", "WHILE", "NUM", "ID", 
			"WS", "ERROR", "CHAR", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", null, null, "'='", "'('", "')'", "'{'", "'}'", null, 
			null, "'<>'", "'tupni'", "'tnirp'", "'nruter'", "'fi'", "'esle'", "'elihw'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "STRING", "ATRIB", "AP", "FP", "AC", "FC", 
			"OP", "OPR", "OPCON", "IN", "OUT", "RET", "COND", "ELSE", "WHILE", "NUM", 
			"ID", "WS", "ERROR"
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


	public AvajLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Avaj.g4"; }

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
		"\u0004\u0000\u0016\u00af\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002H\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\nh\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012"+
		"\u008f\b\u0012\u000b\u0012\f\u0012\u0090\u0001\u0012\u0001\u0012\u0004"+
		"\u0012\u0095\b\u0012\u000b\u0012\f\u0012\u0096\u0003\u0012\u0099\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u009e\b\u0013\n\u0013"+
		"\f\u0013\u00a1\t\u0013\u0001\u0014\u0004\u0014\u00a4\b\u0014\u000b\u0014"+
		"\f\u0014\u00a5\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001M\u0000\u0018\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0000/\u0000\u0001\u0000"+
		"\u0005\u0003\u0000*+--//\u0002\u0000<<>>\u0003\u0000\t\n\r\r  \u0002\u0000"+
		"AZaz\u0001\u000009\u00ba\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u00011\u0001"+
		"\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000"+
		"\u0000\u0007I\u0001\u0000\u0000\u0000\tR\u0001\u0000\u0000\u0000\u000b"+
		"T\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000fX\u0001\u0000"+
		"\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000"+
		"\u0000\u0015g\u0001\u0000\u0000\u0000\u0017i\u0001\u0000\u0000\u0000\u0019"+
		"l\u0001\u0000\u0000\u0000\u001br\u0001\u0000\u0000\u0000\u001dx\u0001"+
		"\u0000\u0000\u0000\u001f\u007f\u0001\u0000\u0000\u0000!\u0082\u0001\u0000"+
		"\u0000\u0000#\u0087\u0001\u0000\u0000\u0000%\u008e\u0001\u0000\u0000\u0000"+
		"\'\u009a\u0001\u0000\u0000\u0000)\u00a3\u0001\u0000\u0000\u0000+\u00a9"+
		"\u0001\u0000\u0000\u0000-\u00ab\u0001\u0000\u0000\u0000/\u00ad\u0001\u0000"+
		"\u0000\u000012\u0005;\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005"+
		",\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005t\u0000\u000067\u0005"+
		"n\u0000\u00007H\u0005i\u0000\u000089\u0005t\u0000\u00009:\u0005a\u0000"+
		"\u0000:;\u0005o\u0000\u0000;<\u0005l\u0000\u0000<H\u0005f\u0000\u0000"+
		"=>\u0005g\u0000\u0000>?\u0005n\u0000\u0000?@\u0005i\u0000\u0000@A\u0005"+
		"r\u0000\u0000AB\u0005t\u0000\u0000BH\u0005s\u0000\u0000CD\u0005l\u0000"+
		"\u0000DE\u0005o\u0000\u0000EF\u0005o\u0000\u0000FH\u0005b\u0000\u0000"+
		"G5\u0001\u0000\u0000\u0000G8\u0001\u0000\u0000\u0000G=\u0001\u0000\u0000"+
		"\u0000GC\u0001\u0000\u0000\u0000H\u0006\u0001\u0000\u0000\u0000IM\u0005"+
		"\"\u0000\u0000JL\t\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000LO\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\"\u0000\u0000"+
		"Q\b\u0001\u0000\u0000\u0000RS\u0005=\u0000\u0000S\n\u0001\u0000\u0000"+
		"\u0000TU\u0005(\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005)\u0000"+
		"\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0005{\u0000\u0000Y\u0010\u0001"+
		"\u0000\u0000\u0000Z[\u0005}\u0000\u0000[\u0012\u0001\u0000\u0000\u0000"+
		"\\]\u0007\u0000\u0000\u0000]\u0014\u0001\u0000\u0000\u0000^_\u0005=\u0000"+
		"\u0000_h\u0005=\u0000\u0000`a\u0005!\u0000\u0000ah\u0005=\u0000\u0000"+
		"bh\u0007\u0001\u0000\u0000cd\u0005<\u0000\u0000dh\u0005=\u0000\u0000e"+
		"f\u0005>\u0000\u0000fh\u0005=\u0000\u0000g^\u0001\u0000\u0000\u0000g`"+
		"\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000h\u0016\u0001\u0000\u0000\u0000ij\u0005"+
		"<\u0000\u0000jk\u0005>\u0000\u0000k\u0018\u0001\u0000\u0000\u0000lm\u0005"+
		"t\u0000\u0000mn\u0005u\u0000\u0000no\u0005p\u0000\u0000op\u0005n\u0000"+
		"\u0000pq\u0005i\u0000\u0000q\u001a\u0001\u0000\u0000\u0000rs\u0005t\u0000"+
		"\u0000st\u0005n\u0000\u0000tu\u0005i\u0000\u0000uv\u0005r\u0000\u0000"+
		"vw\u0005p\u0000\u0000w\u001c\u0001\u0000\u0000\u0000xy\u0005n\u0000\u0000"+
		"yz\u0005r\u0000\u0000z{\u0005u\u0000\u0000{|\u0005t\u0000\u0000|}\u0005"+
		"e\u0000\u0000}~\u0005r\u0000\u0000~\u001e\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005f\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081 \u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005e\u0000\u0000\u0083\u0084\u0005s\u0000"+
		"\u0000\u0084\u0085\u0005l\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086"+
		"\"\u0001\u0000\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u0089"+
		"\u0005l\u0000\u0000\u0089\u008a\u0005i\u0000\u0000\u008a\u008b\u0005h"+
		"\u0000\u0000\u008b\u008c\u0005w\u0000\u0000\u008c$\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0003/\u0017\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0098\u0001\u0000\u0000\u0000\u0092"+
		"\u0094\u0005.\u0000\u0000\u0093\u0095\u0003/\u0017\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001"+
		"\u0000\u0000\u0000\u0098\u0092\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099&\u0001\u0000\u0000\u0000\u009a\u009f\u0003-\u0016"+
		"\u0000\u009b\u009e\u0003-\u0016\u0000\u009c\u009e\u0003/\u0017\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0(\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a4\u0007\u0002\u0000\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0006\u0014\u0000\u0000\u00a8*\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\t\u0000\u0000\u0000\u00aa,\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0007\u0003\u0000\u0000\u00ac.\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0007\u0004\u0000\u0000\u00ae0\u0001\u0000\u0000\u0000"+
		"\n\u0000GMg\u0090\u0096\u0098\u009d\u009f\u00a5\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}