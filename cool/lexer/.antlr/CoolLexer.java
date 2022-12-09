// Generated from /home/cgeorge/cpl/tema-cpl-1/cool/lexer/CoolLexer.g4 by ANTLR 4.9.2

    package cool.lexer;	

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, CL_CLASS=2, INHERITS=3, NEW=4, IF=5, THEN=6, ELSE=7, FI=8, CASE=9, 
		ESAC=10, OF=11, LET=12, IN=13, WHILE=14, LOOP=15, POOL=16, TRUE=17, FALSE=18, 
		NOT=19, ISVOID=20, TYPE_ID=21, OBJ_ID=22, SELF=23, SELF_TYPE=24, INTEGER=25, 
		STRING=26, BAD_COMMENT=27, LINE_COMMENT=28, BLOCK_COMMENT=29, SEMI=30, 
		DOT=31, COLON=32, COMMA=33, COMPL=34, ASSIGN=35, LPAREN=36, RPAREN=37, 
		LBRACE=38, RBRACE=39, PLUS=40, MINUS=41, MULT=42, DIV=43, EQUAL=44, LT=45, 
		LE=46, CASE_EXPR=47, PARENT_CLASS=48, END_FILE=49, WS=50, INVALID=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER_LOWER", "LETTER_UPPER", "LETTER_ANY", "DIGIT", "CL_CLASS", "INHERITS", 
			"NEW", "IF", "THEN", "ELSE", "FI", "CASE", "ESAC", "OF", "LET", "IN", 
			"WHILE", "LOOP", "POOL", "TRUE", "FALSE", "NOT", "ISVOID", "TYPE_ID", 
			"OBJ_ID", "SELF", "SELF_TYPE", "INTEGER", "STRING", "BAD_COMMENT", "LINE_COMMENT", 
			"BLOCK_COMMENT", "SEMI", "DOT", "COLON", "COMMA", "COMPL", "ASSIGN", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "PLUS", "MINUS", "MULT", "DIV", 
			"EQUAL", "LT", "LE", "CASE_EXPR", "PARENT_CLASS", "END_FILE", "WS", "INVALID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'class'", "'inherits'", "'new'", "'if'", "'then'", "'else'", 
			"'fi'", "'case'", "'esac'", "'of'", "'let'", "'in'", "'while'", "'loop'", 
			"'pool'", "'true'", "'false'", "'not'", "'isvoid'", null, null, "'self'", 
			"'SELF_TYPE'", null, null, "'*)'", null, null, "';'", "'.'", "':'", "','", 
			"'~'", "'<-'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
			"'='", "'<'", "'<='", "'=>'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "CL_CLASS", "INHERITS", "NEW", "IF", "THEN", "ELSE", "FI", 
			"CASE", "ESAC", "OF", "LET", "IN", "WHILE", "LOOP", "POOL", "TRUE", "FALSE", 
			"NOT", "ISVOID", "TYPE_ID", "OBJ_ID", "SELF", "SELF_TYPE", "INTEGER", 
			"STRING", "BAD_COMMENT", "LINE_COMMENT", "BLOCK_COMMENT", "SEMI", "DOT", 
			"COLON", "COMMA", "COMPL", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"PLUS", "MINUS", "MULT", "DIV", "EQUAL", "LT", "LE", "CASE_EXPR", "PARENT_CLASS", 
			"END_FILE", "WS", "INVALID"
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

	    
	    private void raiseError(String msg) {
	        setText(msg);
	        setType(ERROR);
	    }


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			BAD_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			BLOCK_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			INVALID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        // Remove quotes
			        setText(getText().substring(1, getText().length()-1));

			        // Replace special characters
			        String cleanText = getText();
			        cleanText = cleanText.replace("\\t", "\t");
			        cleanText = cleanText.replace("\\\r\n", "\r\n");
			        cleanText = cleanText.replace("\\n", "\n");
			        cleanText = cleanText.replace("\\b", "\b");
			        cleanText = cleanText.replace("\\f", "\f");
			        // Removes only one \ in sequence
			        cleanText = cleanText.replaceAll("\\\\(?!\\\\)", "");

			        // Error checking
			        if(getText().length() > 1024) {
			            raiseError("String constant too long");
			        } else if (getText().contains("\0")) {
			            raiseError("String contains null character");
			        } else {
			            setText(cleanText);
			        }
			    
			break;
		case 1:
			raiseError("Unterminated string constant");
			break;
		case 2:
			raiseError("EOF in string constant");
			break;
		}
	}
	private void BAD_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 raiseError("Unmatched *)"); 
			break;
		}
	}
	private void BLOCK_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 
			        skip();
			    
			break;
		case 5:
			 
			        raiseError("EOF in comment"); 
			    
			break;
		}
	}
	private void INVALID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 
			    raiseError("Invalid character: "+getText());

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0172\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00d9\n\31\f\31\16\31\u00dc\13\31"+
		"\3\32\3\32\3\32\3\32\7\32\u00e2\n\32\f\32\16\32\u00e5\13\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\6\35\u00f7\n\35\r\35\16\35\u00f8\3\36\3\36\3\36\3\36\3\36\5\36\u0100"+
		"\n\36\3\36\3\36\7\36\u0104\n\36\f\36\16\36\u0107\13\36\3\36\3\36\3\36"+
		"\5\36\u010c\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u0113\n\36\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \7 \u011e\n \f \16 \u0121\13 \3 \5 \u0124\n "+
		"\3 \3 \5 \u0128\n \3 \3 \3!\3!\3!\3!\3!\7!\u0131\n!\f!\16!\u0134\13!\3"+
		"!\3!\3!\3!\3!\3!\5!\u013c\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u016a\n\66"+
		"\r\66\16\66\u016b\3\66\3\66\3\67\3\67\3\67\5\u0105\u011f\u0132\28\3\2"+
		"\5\2\7\2\t\2\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!"+
		"\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?"+
		"\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65\3\2"+
		"\7\3\2c|\3\2C\\\4\2C\\c|\3\2\62;\5\2\13\f\16\17\"\"\2\u0182\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\r"+
		"}\3\2\2\2\17\u0086\3\2\2\2\21\u008a\3\2\2\2\23\u008d\3\2\2\2\25\u0092"+
		"\3\2\2\2\27\u0097\3\2\2\2\31\u009a\3\2\2\2\33\u009f\3\2\2\2\35\u00a4\3"+
		"\2\2\2\37\u00a7\3\2\2\2!\u00ab\3\2\2\2#\u00ae\3\2\2\2%\u00b4\3\2\2\2\'"+
		"\u00b9\3\2\2\2)\u00be\3\2\2\2+\u00c3\3\2\2\2-\u00c9\3\2\2\2/\u00cd\3\2"+
		"\2\2\61\u00d4\3\2\2\2\63\u00dd\3\2\2\2\65\u00e6\3\2\2\2\67\u00eb\3\2\2"+
		"\29\u00f6\3\2\2\2;\u00fa\3\2\2\2=\u0114\3\2\2\2?\u0119\3\2\2\2A\u012b"+
		"\3\2\2\2C\u013d\3\2\2\2E\u013f\3\2\2\2G\u0141\3\2\2\2I\u0143\3\2\2\2K"+
		"\u0145\3\2\2\2M\u0147\3\2\2\2O\u014a\3\2\2\2Q\u014c\3\2\2\2S\u014e\3\2"+
		"\2\2U\u0150\3\2\2\2W\u0152\3\2\2\2Y\u0154\3\2\2\2[\u0156\3\2\2\2]\u0158"+
		"\3\2\2\2_\u015a\3\2\2\2a\u015c\3\2\2\2c\u015e\3\2\2\2e\u0161\3\2\2\2g"+
		"\u0164\3\2\2\2i\u0166\3\2\2\2k\u0169\3\2\2\2m\u016f\3\2\2\2op\t\2\2\2"+
		"p\4\3\2\2\2qr\t\3\2\2r\6\3\2\2\2st\t\4\2\2t\b\3\2\2\2uv\t\5\2\2v\n\3\2"+
		"\2\2wx\7e\2\2xy\7n\2\2yz\7c\2\2z{\7u\2\2{|\7u\2\2|\f\3\2\2\2}~\7k\2\2"+
		"~\177\7p\2\2\177\u0080\7j\2\2\u0080\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082"+
		"\u0083\7k\2\2\u0083\u0084\7v\2\2\u0084\u0085\7u\2\2\u0085\16\3\2\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0088\7g\2\2\u0088\u0089\7y\2\2\u0089\20\3\2\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7h\2\2\u008c\22\3\2\2\2\u008d\u008e\7v\2\2\u008e"+
		"\u008f\7j\2\2\u008f\u0090\7g\2\2\u0090\u0091\7p\2\2\u0091\24\3\2\2\2\u0092"+
		"\u0093\7g\2\2\u0093\u0094\7n\2\2\u0094\u0095\7u\2\2\u0095\u0096\7g\2\2"+
		"\u0096\26\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7k\2\2\u0099\30\3\2\2"+
		"\2\u009a\u009b\7e\2\2\u009b\u009c\7c\2\2\u009c\u009d\7u\2\2\u009d\u009e"+
		"\7g\2\2\u009e\32\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2"+
		"\7c\2\2\u00a2\u00a3\7e\2\2\u00a3\34\3\2\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7h\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7v\2\2\u00aa \3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\"\3"+
		"\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7n\2\2\u00b2\u00b3\7g\2\2\u00b3$\3\2\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"\u00b6\7q\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7r\2\2\u00b8&\3\2\2\2\u00b9"+
		"\u00ba\7r\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd(\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7w\2"+
		"\2\u00c1\u00c2\7g\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7"+
		"c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8,"+
		"\3\2\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7v\2\2\u00cc"+
		".\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7x\2\2\u00d0"+
		"\u00d1\7q\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7f\2\2\u00d3\60\3\2\2\2\u00d4"+
		"\u00da\5\5\3\2\u00d5\u00d9\5\7\4\2\u00d6\u00d9\7a\2\2\u00d7\u00d9\5\t"+
		"\5\2\u00d8\u00d5\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\62\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dd\u00e3\5\3\2\2\u00de\u00e2\5\7\4\2\u00df\u00e2"+
		"\7a\2\2\u00e0\u00e2\5\t\5\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\64\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7g\2\2\u00e8\u00e9\7n\2\2\u00e9\u00ea\7h\2\2\u00ea\66\3\2\2\2\u00eb\u00ec"+
		"\7U\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee\7N\2\2\u00ee\u00ef\7H\2\2\u00ef"+
		"\u00f0\7a\2\2\u00f0\u00f1\7V\2\2\u00f1\u00f2\7[\2\2\u00f2\u00f3\7R\2\2"+
		"\u00f3\u00f4\7G\2\2\u00f48\3\2\2\2\u00f5\u00f7\5\t\5\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		":\3\2\2\2\u00fa\u0105\7$\2\2\u00fb\u00fc\7^\2\2\u00fc\u0104\7$\2\2\u00fd"+
		"\u00ff\7^\2\2\u00fe\u0100\7\17\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0104\7\f\2\2\u0102\u0104\13\2\2\2\u0103"+
		"\u00fb\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0112\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0109\7$\2\2\u0109\u0113\b\36\2\2\u010a\u010c\7\17"+
		"\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\7\f\2\2\u010e\u010f\3\2\2\2\u010f\u0113\b\36\3\2\u0110\u0111\7"+
		"\2\2\3\u0111\u0113\b\36\4\2\u0112\u0108\3\2\2\2\u0112\u010b\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0113<\3\2\2\2\u0114\u0115\7,\2\2\u0115\u0116\7+\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\b\37\5\2\u0118>\3\2\2\2\u0119\u011a\7/\2\2"+
		"\u011a\u011b\7/\2\2\u011b\u011f\3\2\2\2\u011c\u011e\13\2\2\2\u011d\u011c"+
		"\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0127\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7\17\2\2\u0123\u0122\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\7\f\2\2\u0126"+
		"\u0128\7\2\2\3\u0127\u0123\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\b \6\2\u012a@\3\2\2\2\u012b\u012c\7*\2\2\u012c\u012d"+
		"\7,\2\2\u012d\u0132\3\2\2\2\u012e\u0131\5A!\2\u012f\u0131\13\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0133\u013b\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\7,\2\2\u0136\u0137\7+\2\2\u0137\u0138\3\2\2\2\u0138\u013c\b!\7"+
		"\2\u0139\u013a\7\2\2\3\u013a\u013c\b!\b\2\u013b\u0135\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013cB\3\2\2\2\u013d\u013e\7=\2\2\u013eD\3\2\2\2\u013f\u0140"+
		"\7\60\2\2\u0140F\3\2\2\2\u0141\u0142\7<\2\2\u0142H\3\2\2\2\u0143\u0144"+
		"\7.\2\2\u0144J\3\2\2\2\u0145\u0146\7\u0080\2\2\u0146L\3\2\2\2\u0147\u0148"+
		"\7>\2\2\u0148\u0149\7/\2\2\u0149N\3\2\2\2\u014a\u014b\7*\2\2\u014bP\3"+
		"\2\2\2\u014c\u014d\7+\2\2\u014dR\3\2\2\2\u014e\u014f\7}\2\2\u014fT\3\2"+
		"\2\2\u0150\u0151\7\177\2\2\u0151V\3\2\2\2\u0152\u0153\7-\2\2\u0153X\3"+
		"\2\2\2\u0154\u0155\7/\2\2\u0155Z\3\2\2\2\u0156\u0157\7,\2\2\u0157\\\3"+
		"\2\2\2\u0158\u0159\7\61\2\2\u0159^\3\2\2\2\u015a\u015b\7?\2\2\u015b`\3"+
		"\2\2\2\u015c\u015d\7>\2\2\u015db\3\2\2\2\u015e\u015f\7>\2\2\u015f\u0160"+
		"\7?\2\2\u0160d\3\2\2\2\u0161\u0162\7?\2\2\u0162\u0163\7@\2\2\u0163f\3"+
		"\2\2\2\u0164\u0165\7B\2\2\u0165h\3\2\2\2\u0166\u0167\7\2\2\3\u0167j\3"+
		"\2\2\2\u0168\u016a\t\6\2\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\b\66"+
		"\6\2\u016el\3\2\2\2\u016f\u0170\13\2\2\2\u0170\u0171\b\67\t\2\u0171n\3"+
		"\2\2\2\24\2\u00d8\u00da\u00e1\u00e3\u00f8\u00ff\u0103\u0105\u010b\u0112"+
		"\u011f\u0123\u0127\u0130\u0132\u013b\u016b\n\3\36\2\3\36\3\3\36\4\3\37"+
		"\5\b\2\2\3!\6\3!\7\3\67\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}