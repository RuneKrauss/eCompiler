// Generated from E.g4 by ANTLR 4.7.2
package com.runekrauss.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		BUILTINFUNCTION=39, BOOL=40, INTEGER=41, FLOAT=42, STRING=43, IDENTIFIER=44, 
		COMMENT=45, WHITESPACE=46, SCOLON=47, DOT=48, COMMA=49, ASSIGN=50, QMARK=51, 
		OPAREN=52, CPAREN=53, OBRACE=54, CBRACE=55, OBRACKET=56, CBRACKET=57, 
		OCBRACKET=58;
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
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "BUILTINFUNCTION", "BOOL", 
			"INTEGER", "FLOAT", "STRING", "IDENTIFIER", "COMMENT", "WHITESPACE", 
			"SCOLON", "DOT", "COMMA", "ASSIGN", "QMARK", "OPAREN", "CPAREN", "OBRACE", 
			"CBRACE", "OBRACKET", "CBRACKET", "OCBRACKET", "LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'use'", "'#define'", "'noMain'", "'print'", "'println'", "'if'", 
			"'else'", "'while'", "'asm'", "'invoke'", "'new'", "'pushToStack'", "'setTopOfStack'", 
			"':'", "'return'", "'struct'", "'-'", "'/'", "'*'", "'%'", "'+'", "'<<'", 
			"'>>'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'&&'", "'||'", 
			"'^'", "'topOfStack'", "'bool'", "'int'", "'float'", "'String'", "'void'", 
			null, null, null, null, null, null, null, null, "';'", "'.'", "','", 
			"'='", "'\"'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'[]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BUILTINFUNCTION", "BOOL", "INTEGER", "FLOAT", "STRING", 
			"IDENTIFIER", "COMMENT", "WHITESPACE", "SCOLON", "DOT", "COMMA", "ASSIGN", 
			"QMARK", "OPAREN", "CPAREN", "OBRACE", "CBRACE", "OBRACKET", "CBRACKET", 
			"OCBRACKET"
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


	public ELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "E.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0152\n(\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\5)\u015d\n)\3*\6*\u0160\n*\r*\16*\u0161\3+\3+\3+\3+\3+\3+\3+\5+\u016b"+
		"\n+\3,\3,\7,\u016f\n,\f,\16,\u0172\13,\3,\3,\3-\3-\3-\7-\u0179\n-\f-\16"+
		"-\u017c\13-\3.\3.\3.\3.\7.\u0182\n.\f.\16.\u0185\13.\3.\5.\u0188\n.\3"+
		".\3.\3.\3.\3.\7.\u018f\n.\f.\16.\u0192\13.\3.\3.\3.\3.\3.\3.\3.\7.\u019b"+
		"\n.\f.\16.\u019e\13.\3.\3.\5.\u01a2\n.\3.\3.\3/\6/\u01a7\n/\r/\16/\u01a8"+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\5\u0170\u0190\u019c"+
		"\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w\2y\2\3\2\6\4\2\f\f\17\17\5\2\13\f\17\17\"\"\5\2C\\aac|\3\2"+
		"\62;\2\u01d7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3{\3\2\2\2\5"+
		"\177\3\2\2\2\7\u0087\3\2\2\2\t\u008e\3\2\2\2\13\u0094\3\2\2\2\r\u009c"+
		"\3\2\2\2\17\u009f\3\2\2\2\21\u00a4\3\2\2\2\23\u00aa\3\2\2\2\25\u00ae\3"+
		"\2\2\2\27\u00b5\3\2\2\2\31\u00b9\3\2\2\2\33\u00c5\3\2\2\2\35\u00d3\3\2"+
		"\2\2\37\u00d5\3\2\2\2!\u00dc\3\2\2\2#\u00e3\3\2\2\2%\u00e5\3\2\2\2\'\u00e7"+
		"\3\2\2\2)\u00e9\3\2\2\2+\u00eb\3\2\2\2-\u00ed\3\2\2\2/\u00f0\3\2\2\2\61"+
		"\u00f3\3\2\2\2\63\u00f5\3\2\2\2\65\u00f8\3\2\2\2\67\u00fa\3\2\2\29\u00fd"+
		"\3\2\2\2;\u0100\3\2\2\2=\u0103\3\2\2\2?\u0106\3\2\2\2A\u0109\3\2\2\2C"+
		"\u010b\3\2\2\2E\u0116\3\2\2\2G\u011b\3\2\2\2I\u011f\3\2\2\2K\u0125\3\2"+
		"\2\2M\u012c\3\2\2\2O\u0151\3\2\2\2Q\u015c\3\2\2\2S\u015f\3\2\2\2U\u016a"+
		"\3\2\2\2W\u016c\3\2\2\2Y\u0175\3\2\2\2[\u01a1\3\2\2\2]\u01a6\3\2\2\2_"+
		"\u01ac\3\2\2\2a\u01ae\3\2\2\2c\u01b0\3\2\2\2e\u01b2\3\2\2\2g\u01b4\3\2"+
		"\2\2i\u01b6\3\2\2\2k\u01b8\3\2\2\2m\u01ba\3\2\2\2o\u01bc\3\2\2\2q\u01be"+
		"\3\2\2\2s\u01c0\3\2\2\2u\u01c2\3\2\2\2w\u01c5\3\2\2\2y\u01c7\3\2\2\2{"+
		"|\7w\2\2|}\7u\2\2}~\7g\2\2~\4\3\2\2\2\177\u0080\7%\2\2\u0080\u0081\7f"+
		"\2\2\u0081\u0082\7g\2\2\u0082\u0083\7h\2\2\u0083\u0084\7k\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u0086\7g\2\2\u0086\6\3\2\2\2\u0087\u0088\7p\2\2\u0088\u0089"+
		"\7q\2\2\u0089\u008a\7O\2\2\u008a\u008b\7c\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7p\2\2\u008d\b\3\2\2\2\u008e\u008f\7r\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092\u0093\7v\2\2\u0093\n\3\2\2\2\u0094"+
		"\u0095\7r\2\2\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2"+
		"\u0098\u0099\7v\2\2\u0099\u009a\7n\2\2\u009a\u009b\7p\2\2\u009b\f\3\2"+
		"\2\2\u009c\u009d\7k\2\2\u009d\u009e\7h\2\2\u009e\16\3\2\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\20\3\2\2\2\u00a4\u00a5\7y\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7c\2\2\u00ab"+
		"\u00ac\7u\2\2\u00ac\u00ad\7o\2\2\u00ad\24\3\2\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7p\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7m\2\2"+
		"\u00b3\u00b4\7g\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7"+
		"g\2\2\u00b7\u00b8\7y\2\2\u00b8\30\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb"+
		"\7w\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7j\2\2\u00bd\u00be\7V\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7U\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c3\7e\2\2\u00c3\u00c4\7m\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7"+
		"u\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7V\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7Q\2\2\u00cc\u00cd\7h\2\2\u00cd"+
		"\u00ce\7U\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7e\2\2"+
		"\u00d1\u00d2\7m\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4\36\3\2\2"+
		"\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9"+
		"\7w\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7p\2\2\u00db \3\2\2\2\u00dc\u00dd"+
		"\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7w\2\2\u00e0"+
		"\u00e1\7e\2\2\u00e1\u00e2\7v\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4"+
		"$\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7,\2\2\u00e8"+
		"(\3\2\2\2\u00e9\u00ea\7\'\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec"+
		",\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7>\2\2\u00ef.\3\2\2\2\u00f0\u00f1"+
		"\7@\2\2\u00f1\u00f2\7@\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4\62"+
		"\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7?\2\2\u00f7\64\3\2\2\2\u00f8"+
		"\u00f9\7@\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc\7?\2\2\u00fc"+
		"8\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe\u00ff\7?\2\2\u00ff:\3\2\2\2\u0100\u0101"+
		"\7#\2\2\u0101\u0102\7?\2\2\u0102<\3\2\2\2\u0103\u0104\7(\2\2\u0104\u0105"+
		"\7(\2\2\u0105>\3\2\2\2\u0106\u0107\7~\2\2\u0107\u0108\7~\2\2\u0108@\3"+
		"\2\2\2\u0109\u010a\7`\2\2\u010aB\3\2\2\2\u010b\u010c\7v\2\2\u010c\u010d"+
		"\7q\2\2\u010d\u010e\7r\2\2\u010e\u010f\7Q\2\2\u010f\u0110\7h\2\2\u0110"+
		"\u0111\7U\2\2\u0111\u0112\7v\2\2\u0112\u0113\7c\2\2\u0113\u0114\7e\2\2"+
		"\u0114\u0115\7m\2\2\u0115D\3\2\2\2\u0116\u0117\7d\2\2\u0117\u0118\7q\2"+
		"\2\u0118\u0119\7q\2\2\u0119\u011a\7n\2\2\u011aF\3\2\2\2\u011b\u011c\7"+
		"k\2\2\u011c\u011d\7p\2\2\u011d\u011e\7v\2\2\u011eH\3\2\2\2\u011f\u0120"+
		"\7h\2\2\u0120\u0121\7n\2\2\u0121\u0122\7q\2\2\u0122\u0123\7c\2\2\u0123"+
		"\u0124\7v\2\2\u0124J\3\2\2\2\u0125\u0126\7U\2\2\u0126\u0127\7v\2\2\u0127"+
		"\u0128\7t\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a\u012b\7i\2\2"+
		"\u012bL\3\2\2\2\u012c\u012d\7x\2\2\u012d\u012e\7q\2\2\u012e\u012f\7k\2"+
		"\2\u012f\u0130\7f\2\2\u0130N\3\2\2\2\u0131\u0132\7v\2\2\u0132\u0133\7"+
		"q\2\2\u0133\u0134\7K\2\2\u0134\u0135\7p\2\2\u0135\u0152\7v\2\2\u0136\u0137"+
		"\7v\2\2\u0137\u0138\7q\2\2\u0138\u0139\7H\2\2\u0139\u013a\7n\2\2\u013a"+
		"\u013b\7q\2\2\u013b\u013c\7c\2\2\u013c\u0152\7v\2\2\u013d\u013e\7v\2\2"+
		"\u013e\u013f\7q\2\2\u013f\u0140\7U\2\2\u0140\u0141\7v\2\2\u0141\u0142"+
		"\7t\2\2\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144\u0152\7i\2\2\u0145"+
		"\u0146\7c\2\2\u0146\u0147\7r\2\2\u0147\u0148\7r\2\2\u0148\u0149\7g\2\2"+
		"\u0149\u014a\7p\2\2\u014a\u0152\7f\2\2\u014b\u014c\7n\2\2\u014c\u014d"+
		"\7g\2\2\u014d\u014e\7p\2\2\u014e\u014f\7i\2\2\u014f\u0150\7v\2\2\u0150"+
		"\u0152\7j\2\2\u0151\u0131\3\2\2\2\u0151\u0136\3\2\2\2\u0151\u013d\3\2"+
		"\2\2\u0151\u0145\3\2\2\2\u0151\u014b\3\2\2\2\u0152P\3\2\2\2\u0153\u0154"+
		"\7v\2\2\u0154\u0155\7t\2\2\u0155\u0156\7w\2\2\u0156\u015d\7g\2\2\u0157"+
		"\u0158\7h\2\2\u0158\u0159\7c\2\2\u0159\u015a\7n\2\2\u015a\u015b\7u\2\2"+
		"\u015b\u015d\7g\2\2\u015c\u0153\3\2\2\2\u015c\u0157\3\2\2\2\u015dR\3\2"+
		"\2\2\u015e\u0160\5y=\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162T\3\2\2\2\u0163\u0164\5S*\2\u0164\u0165"+
		"\5a\61\2\u0165\u0166\5S*\2\u0166\u016b\3\2\2\2\u0167\u0168\5a\61\2\u0168"+
		"\u0169\5S*\2\u0169\u016b\3\2\2\2\u016a\u0163\3\2\2\2\u016a\u0167\3\2\2"+
		"\2\u016bV\3\2\2\2\u016c\u0170\5g\64\2\u016d\u016f\13\2\2\2\u016e\u016d"+
		"\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\5g\64\2\u0174X\3\2\2\2"+
		"\u0175\u017a\5w<\2\u0176\u0179\5w<\2\u0177\u0179\5y=\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017bZ\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\61\2\2"+
		"\u017e\u017f\7\61\2\2\u017f\u0183\3\2\2\2\u0180\u0182\n\2\2\2\u0181\u0180"+
		"\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0188\7\17\2\2\u0187\u0186\3"+
		"\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u01a2\7\f\2\2\u018a"+
		"\u018b\7\61\2\2\u018b\u018c\7,\2\2\u018c\u0190\3\2\2\2\u018d\u018f\13"+
		"\2\2\2\u018e\u018d\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7,"+
		"\2\2\u0194\u01a2\7\61\2\2\u0195\u0196\7\61\2\2\u0196\u0197\7,\2\2\u0197"+
		"\u0198\7,\2\2\u0198\u019c\3\2\2\2\u0199\u019b\13\2\2\2\u019a\u0199\3\2"+
		"\2\2\u019b\u019e\3\2\2\2\u019c\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7,\2\2\u01a0\u01a2\7\61"+
		"\2\2\u01a1\u017d\3\2\2\2\u01a1\u018a\3\2\2\2\u01a1\u0195\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\b.\2\2\u01a4\\\3\2\2\2\u01a5\u01a7\t\3\2\2"+
		"\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b/\2\2\u01ab^\3\2\2\2\u01ac\u01ad"+
		"\7=\2\2\u01ad`\3\2\2\2\u01ae\u01af\7\60\2\2\u01afb\3\2\2\2\u01b0\u01b1"+
		"\7.\2\2\u01b1d\3\2\2\2\u01b2\u01b3\7?\2\2\u01b3f\3\2\2\2\u01b4\u01b5\7"+
		"$\2\2\u01b5h\3\2\2\2\u01b6\u01b7\7*\2\2\u01b7j\3\2\2\2\u01b8\u01b9\7+"+
		"\2\2\u01b9l\3\2\2\2\u01ba\u01bb\7}\2\2\u01bbn\3\2\2\2\u01bc\u01bd\7\177"+
		"\2\2\u01bdp\3\2\2\2\u01be\u01bf\7]\2\2\u01bfr\3\2\2\2\u01c0\u01c1\7_\2"+
		"\2\u01c1t\3\2\2\2\u01c2\u01c3\7]\2\2\u01c3\u01c4\7_\2\2\u01c4v\3\2\2\2"+
		"\u01c5\u01c6\t\4\2\2\u01c6x\3\2\2\2\u01c7\u01c8\t\5\2\2\u01c8z\3\2\2\2"+
		"\20\2\u0151\u015c\u0161\u016a\u0170\u0178\u017a\u0183\u0187\u0190\u019c"+
		"\u01a1\u01a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}