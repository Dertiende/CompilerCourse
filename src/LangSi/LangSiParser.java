// Generated from D:/Users/Alex/IdeaProjects/Compile/src/LangSi\LangSi.g4 by ANTLR 4.9.1
package LangSi;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangSiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		BOOLEAN=25, BREAK=26, CHAR=27, CONST=28, CONTINUE=29, FLOAT=30, IF=31, 
		INT=32, WHILE=33, DEF=34, RETURN=35, PRINT=36, MAIN=37, LETTERS=38, NUMBERS=39, 
		WS=40, COMMENT=41, LINE_COMMENT=42;
	public static final int
		RULE_compileUnit = 0, RULE_main = 1, RULE_block = 2, RULE_blockFunc = 3, 
		RULE_function = 4, RULE_returnFunc = 5, RULE_funcName = 6, RULE_consts = 7, 
		RULE_types = 8, RULE_variableDeclaration = 9, RULE_assignment = 10, RULE_callFunctionList = 11, 
		RULE_callFunction = 12, RULE_argsList = 13, RULE_exprList = 14, RULE_varName = 15, 
		RULE_statement = 16, RULE_print = 17, RULE_printList = 18, RULE_ifCondtion = 19, 
		RULE_ifBlock = 20, RULE_ifStatement = 21, RULE_breakContinue = 22, RULE_whileCicle = 23, 
		RULE_whileBlock = 24, RULE_whileStatement = 25, RULE_logicExprList = 26, 
		RULE_logicExpr = 27, RULE_expr = 28, RULE_literal = 29, RULE_intLiteral = 30, 
		RULE_boolLiteral = 31, RULE_charLiteral = 32, RULE_floatLiteral = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"compileUnit", "main", "block", "blockFunc", "function", "returnFunc", 
			"funcName", "consts", "types", "variableDeclaration", "assignment", "callFunctionList", 
			"callFunction", "argsList", "exprList", "varName", "statement", "print", 
			"printList", "ifCondtion", "ifBlock", "ifStatement", "breakContinue", 
			"whileCicle", "whileBlock", "whileStatement", "logicExprList", "logicExpr", 
			"expr", "literal", "intLiteral", "boolLiteral", "charLiteral", "floatLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'('", "')'", "'='", "','", "'and'", "'or'", 
			"'=='", "'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'true'", "'false'", "'''", "'.'", "'bool'", "'break'", "'char'", 
			"'const'", "'continue'", "'float'", "'if'", "'int'", "'while'", "'def'", 
			"'return'", "'print'", "'__main__()'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BOOLEAN", "BREAK", "CHAR", "CONST", "CONTINUE", "FLOAT", "IF", 
			"INT", "WHILE", "DEF", "RETURN", "PRINT", "MAIN", "LETTERS", "NUMBERS", 
			"WS", "COMMENT", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "LangSi.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangSiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompileUnitContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LangSiParser.EOF, 0); }
		public ConstsContext consts() {
			return getRuleContext(ConstsContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterCompileUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitCompileUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitCompileUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompileUnitContext compileUnit() throws RecognitionException {
		CompileUnitContext _localctx = new CompileUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compileUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(68);
				consts();
				}
			}

			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(71);
					function();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(77);
			main();
			setState(78);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(LangSiParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(MAIN);
			setState(81);
			block();
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
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__0);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << WHILE) | (1L << PRINT) | (1L << LETTERS) | (1L << NUMBERS))) != 0)) {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__1);
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

	public static class BlockFuncContext extends ParserRuleContext {
		public ReturnFuncContext returnFunc() {
			return getRuleContext(ReturnFuncContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterBlockFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitBlockFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitBlockFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockFuncContext blockFunc() throws RecognitionException {
		BlockFuncContext _localctx = new BlockFuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_blockFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__0);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << WHILE) | (1L << PRINT) | (1L << LETTERS) | (1L << NUMBERS))) != 0)) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			returnFunc();
			setState(100);
			match(T__2);
			setState(101);
			match(T__1);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(LangSiParser.DEF, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public ArgsListContext argsList() {
			return getRuleContext(ArgsListContext.class,0);
		}
		public BlockFuncContext blockFunc() {
			return getRuleContext(BlockFuncContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DEF);
			setState(104);
			types();
			setState(105);
			funcName();
			setState(106);
			match(T__3);
			setState(107);
			argsList();
			setState(108);
			match(T__4);
			setState(109);
			blockFunc();
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

	public static class ReturnFuncContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LangSiParser.RETURN, 0); }
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ReturnFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterReturnFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitReturnFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitReturnFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnFuncContext returnFunc() throws RecognitionException {
		ReturnFuncContext _localctx = new ReturnFuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(RETURN);
			setState(112);
			varName();
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

	public static class FuncNameContext extends ParserRuleContext {
		public List<TerminalNode> LETTERS() { return getTokens(LangSiParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(LangSiParser.LETTERS, i);
		}
		public List<TerminalNode> NUMBERS() { return getTokens(LangSiParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(LangSiParser.NUMBERS, i);
		}
		public FuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncNameContext funcName() throws RecognitionException {
		FuncNameContext _localctx = new FuncNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(114);
					match(LETTERS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTERS || _la==NUMBERS) {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LETTERS:
					{
					setState(120); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(119);
							match(LETTERS);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(122); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case NUMBERS:
					{
					setState(124);
					match(NUMBERS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
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

	public static class ConstsContext extends ParserRuleContext {
		public List<TerminalNode> CONST() { return getTokens(LangSiParser.CONST); }
		public TerminalNode CONST(int i) {
			return getToken(LangSiParser.CONST, i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public ConstsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterConsts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitConsts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitConsts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstsContext consts() throws RecognitionException {
		ConstsContext _localctx = new ConstsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_consts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(CONST);
			setState(131);
			variableDeclaration();
			setState(132);
			match(T__2);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(133);
				match(CONST);
				setState(134);
				variableDeclaration();
				setState(135);
				match(T__2);
				}
				}
				setState(141);
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(LangSiParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(LangSiParser.CHAR, 0); }
		public TerminalNode INT() { return getToken(LangSiParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LangSiParser.FLOAT, 0); }
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			types();
			setState(145);
			varName();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(146);
				match(T__5);
				setState(147);
				expr(0);
				}
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

	public static class AssignmentContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			varName();
			setState(151);
			match(T__5);
			setState(152);
			expr(0);
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

	public static class CallFunctionListContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public CallFunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunctionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterCallFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitCallFunctionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitCallFunctionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionListContext callFunctionList() throws RecognitionException {
		CallFunctionListContext _localctx = new CallFunctionListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callFunctionList);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERS:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				varName();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
			case NUMBERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				literal();
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

	public static class CallFunctionContext extends ParserRuleContext {
		public FuncNameContext funcName() {
			return getRuleContext(FuncNameContext.class,0);
		}
		public List<CallFunctionListContext> callFunctionList() {
			return getRuleContexts(CallFunctionListContext.class);
		}
		public CallFunctionListContext callFunctionList(int i) {
			return getRuleContext(CallFunctionListContext.class,i);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			funcName();
			setState(159);
			match(T__3);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << LETTERS) | (1L << NUMBERS))) != 0)) {
				{
				setState(160);
				callFunctionList();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(161);
					match(T__6);
					setState(162);
					callFunctionList();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(170);
			match(T__4);
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

	public static class ArgsListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public ArgsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterArgsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitArgsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitArgsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsListContext argsList() throws RecognitionException {
		ArgsListContext _localctx = new ArgsListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << INT))) != 0)) {
				{
				setState(172);
				variableDeclaration();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(173);
					match(T__6);
					setState(174);
					variableDeclaration();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << LETTERS) | (1L << NUMBERS))) != 0)) {
				{
				setState(182);
				expr(0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(183);
					match(T__6);
					setState(184);
					expr(0);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class VarNameContext extends ParserRuleContext {
		public List<TerminalNode> LETTERS() { return getTokens(LangSiParser.LETTERS); }
		public TerminalNode LETTERS(int i) {
			return getToken(LangSiParser.LETTERS, i);
		}
		public List<TerminalNode> NUMBERS() { return getTokens(LangSiParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(LangSiParser.NUMBERS, i);
		}
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(192);
					match(LETTERS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(203);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTERS:
						{
						setState(198); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(197);
								match(LETTERS);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(200); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case NUMBERS:
						{
						setState(202);
						match(NUMBERS);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfCondtionContext ifCondtion() {
			return getRuleContext(IfCondtionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileCicleContext whileCicle() {
			return getRuleContext(WhileCicleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				variableDeclaration();
				setState(209);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				expr(0);
				setState(212);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				print();
				setState(215);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				ifCondtion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				whileCicle();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LangSiParser.PRINT, 0); }
		public PrintListContext printList() {
			return getRuleContext(PrintListContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(PRINT);
			setState(223);
			match(T__3);
			setState(224);
			printList();
			setState(225);
			match(T__4);
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

	public static class PrintListContext extends ParserRuleContext {
		public PrintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printList; }
	 
		public PrintListContext() { }
		public void copyFrom(PrintListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintLiteralContext extends PrintListContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrintLiteralContext(PrintListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterPrintLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitPrintLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitPrintLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintVarContext extends PrintListContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public PrintVarContext(PrintListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterPrintVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitPrintVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitPrintVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintListContext printList() throws RecognitionException {
		PrintListContext _localctx = new PrintListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printList);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
			case T__22:
			case NUMBERS:
				_localctx = new PrintLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				literal();
				}
				break;
			case LETTERS:
				_localctx = new PrintVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				varName();
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

	public static class IfCondtionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LangSiParser.IF, 0); }
		public LogicExprListContext logicExprList() {
			return getRuleContext(LogicExprListContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public IfCondtionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondtion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterIfCondtion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitIfCondtion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitIfCondtion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfCondtionContext ifCondtion() throws RecognitionException {
		IfCondtionContext _localctx = new IfCondtionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifCondtion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(IF);
			setState(232);
			match(T__3);
			setState(233);
			logicExprList();
			setState(234);
			match(T__4);
			setState(235);
			ifBlock();
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

	public static class IfBlockContext extends ParserRuleContext {
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__0);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << BOOLEAN) | (1L << BREAK) | (1L << CHAR) | (1L << CONTINUE) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << WHILE) | (1L << PRINT) | (1L << LETTERS) | (1L << NUMBERS))) != 0)) {
				{
				{
				setState(238);
				ifStatement();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(T__1);
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

	public static class IfStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfCondtionContext ifCondtion() {
			return getRuleContext(IfCondtionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileCicleContext whileCicle() {
			return getRuleContext(WhileCicleContext.class,0);
		}
		public BreakContinueContext breakContinue() {
			return getRuleContext(BreakContinueContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifStatement);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				variableDeclaration();
				setState(247);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				expr(0);
				setState(250);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				print();
				setState(253);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				ifCondtion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				whileCicle();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				breakContinue();
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

	public static class BreakContinueContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(LangSiParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(LangSiParser.CONTINUE, 0); }
		public BreakContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakContinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterBreakContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitBreakContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitBreakContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContinueContext breakContinue() throws RecognitionException {
		BreakContinueContext _localctx = new BreakContinueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_breakContinue);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(BREAK);
				setState(262);
				match(T__2);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(CONTINUE);
				setState(264);
				match(T__2);
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

	public static class WhileCicleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LangSiParser.WHILE, 0); }
		public LogicExprListContext logicExprList() {
			return getRuleContext(LogicExprListContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public WhileCicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterWhileCicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitWhileCicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitWhileCicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileCicleContext whileCicle() throws RecognitionException {
		WhileCicleContext _localctx = new WhileCicleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_whileCicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(WHILE);
			setState(268);
			match(T__3);
			setState(269);
			logicExprList();
			setState(270);
			match(T__4);
			setState(271);
			whileBlock();
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

	public static class WhileBlockContext extends ParserRuleContext {
		public List<WhileStatementContext> whileStatement() {
			return getRuleContexts(WhileStatementContext.class);
		}
		public WhileStatementContext whileStatement(int i) {
			return getRuleContext(WhileStatementContext.class,i);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__0);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << IF) | (1L << INT) | (1L << WHILE) | (1L << PRINT) | (1L << LETTERS) | (1L << NUMBERS))) != 0)) {
				{
				{
				setState(274);
				whileStatement();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(T__1);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfCondtionContext ifCondtion() {
			return getRuleContext(IfCondtionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public WhileCicleContext whileCicle() {
			return getRuleContext(WhileCicleContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileStatement);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				variableDeclaration();
				setState(283);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				expr(0);
				setState(286);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				print();
				setState(289);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				ifCondtion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				assignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				whileCicle();
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

	public static class LogicExprListContext extends ParserRuleContext {
		public Token pob;
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public LogicExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterLogicExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitLogicExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitLogicExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprListContext logicExprList() throws RecognitionException {
		LogicExprListContext _localctx = new LogicExprListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			logicExpr();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				{
				setState(297);
				((LogicExprListContext)_localctx).pob = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((LogicExprListContext)_localctx).pob = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(298);
				logicExpr();
				}
				}
				setState(303);
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

	public static class LogicExprContext extends ParserRuleContext {
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
	 
		public LogicExprContext() { }
		public void copyFrom(LogicExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualsConclusionContext extends LogicExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsConclusionContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterEqualsConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitEqualsConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitEqualsConclusion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThenConclusionContext extends LogicExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThenConclusionContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterLessThenConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitLessThenConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitLessThenConclusion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpConclusionContext extends LogicExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpConclusionContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterExpConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitExpConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitExpConclusion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreThenConclusionContext extends LogicExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MoreThenConclusionContext(LogicExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterMoreThenConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitMoreThenConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitMoreThenConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logicExpr);
		int _la;
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ExpConclusionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				expr(0);
				}
				break;
			case 2:
				_localctx = new EqualsConclusionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				expr(0);
				setState(306);
				((EqualsConclusionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((EqualsConclusionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				expr(0);
				}
				break;
			case 3:
				_localctx = new MoreThenConclusionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				expr(0);
				setState(310);
				((MoreThenConclusionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
					((MoreThenConclusionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				expr(0);
				}
				break;
			case 4:
				_localctx = new LessThenConclusionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				expr(0);
				setState(314);
				((LessThenConclusionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
					((LessThenConclusionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SummExpressionContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SummExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterSummExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitSummExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitSummExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNameExpressionContext extends ExprContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public VarNameExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterVarNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitVarNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitVarNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExpressionContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFuncExpressionContext extends ExprContext {
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public CallFuncExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterCallFuncExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitCallFuncExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitCallFuncExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipliesExpressionContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultipliesExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterMultipliesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitMultipliesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitMultipliesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssigmentExpressionContext extends ExprContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssigmentExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterAssigmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitAssigmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitAssigmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new AssigmentExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(320);
				assignment();
				}
				break;
			case 2:
				{
				_localctx = new CallFuncExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				callFunction();
				}
				break;
			case 3:
				{
				_localctx = new VarNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				varName();
				}
				break;
			case 4:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				literal();
				}
				break;
			case 5:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(T__3);
				setState(325);
				expr(0);
				setState(326);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(336);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new MultipliesExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(331);
						((MultipliesExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
							((MultipliesExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(332);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SummExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(334);
						((SummExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((SummExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class LiteralContext extends ParserRuleContext {
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				boolLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				intLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				floatLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				charLiteral();
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

	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode NUMBERS() { return getToken(LangSiParser.NUMBERS, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_intLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(NUMBERS);
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CharLiteralContext extends ParserRuleContext {
		public TerminalNode LETTERS() { return getToken(LangSiParser.LETTERS, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_charLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__22);
			setState(352);
			match(LETTERS);
			setState(353);
			match(T__22);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMBERS() { return getTokens(LangSiParser.NUMBERS); }
		public TerminalNode NUMBERS(int i) {
			return getToken(LangSiParser.NUMBERS, i);
		}
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangSiListener ) ((LangSiListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangSiVisitor ) return ((LangSiVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_floatLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(NUMBERS);
			setState(356);
			match(T__23);
			setState(357);
			match(NUMBERS);
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
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u016a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\5\2H\n\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\3\5\7\5a\n\5"+
		"\f\5\16\5d\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\6\bv\n\b\r\b\16\bw\3\b\6\b{\n\b\r\b\16\b|\3\b\7\b\u0080\n\b"+
		"\f\b\16\b\u0083\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u008c\n\t\f\t\16"+
		"\t\u008f\13\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\5\r\u009f\n\r\3\16\3\16\3\16\3\16\3\16\7\16\u00a6\n\16\f"+
		"\16\16\16\u00a9\13\16\5\16\u00ab\n\16\3\16\3\16\3\17\3\17\3\17\7\17\u00b2"+
		"\n\17\f\17\16\17\u00b5\13\17\5\17\u00b7\n\17\3\20\3\20\3\20\7\20\u00bc"+
		"\n\20\f\20\16\20\u00bf\13\20\5\20\u00c1\n\20\3\21\6\21\u00c4\n\21\r\21"+
		"\16\21\u00c5\3\21\6\21\u00c9\n\21\r\21\16\21\u00ca\3\21\7\21\u00ce\n\21"+
		"\f\21\16\21\u00d1\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00df\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24"+
		"\u00e8\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00f2\n\26\f"+
		"\26\16\26\u00f5\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0106\n\27\3\30\3\30\3\30\3\30\5\30\u010c"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\7\32\u0116\n\32\f\32\16"+
		"\32\u0119\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0129\n\33\3\34\3\34\3\34\7\34\u012e\n\34\f\34\16"+
		"\34\u0131\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0140\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u014b\n\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0153\n\36\f\36\16"+
		"\36\u0156\13\36\3\37\3\37\3\37\3\37\5\37\u015c\n\37\3 \3 \3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3L\3:$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BD\2\n\6\2\33\33\35\35  \"\"\3\2\n\13\3\2\f"+
		"\r\3\2\16\17\3\2\20\21\3\2\22\24\3\2\25\26\3\2\27\30\2\u017d\2G\3\2\2"+
		"\2\4R\3\2\2\2\6U\3\2\2\2\b^\3\2\2\2\ni\3\2\2\2\fq\3\2\2\2\16u\3\2\2\2"+
		"\20\u0084\3\2\2\2\22\u0090\3\2\2\2\24\u0092\3\2\2\2\26\u0098\3\2\2\2\30"+
		"\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00b6\3\2\2\2\36\u00c0\3\2\2\2 \u00c3"+
		"\3\2\2\2\"\u00de\3\2\2\2$\u00e0\3\2\2\2&\u00e7\3\2\2\2(\u00e9\3\2\2\2"+
		"*\u00ef\3\2\2\2,\u0105\3\2\2\2.\u010b\3\2\2\2\60\u010d\3\2\2\2\62\u0113"+
		"\3\2\2\2\64\u0128\3\2\2\2\66\u012a\3\2\2\28\u013f\3\2\2\2:\u014a\3\2\2"+
		"\2<\u015b\3\2\2\2>\u015d\3\2\2\2@\u015f\3\2\2\2B\u0161\3\2\2\2D\u0165"+
		"\3\2\2\2FH\5\20\t\2GF\3\2\2\2GH\3\2\2\2HL\3\2\2\2IK\5\n\6\2JI\3\2\2\2"+
		"KN\3\2\2\2LM\3\2\2\2LJ\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\5\4\3\2PQ\7\2\2\3"+
		"Q\3\3\2\2\2RS\7\'\2\2ST\5\6\4\2T\5\3\2\2\2UY\7\3\2\2VX\5\"\22\2WV\3\2"+
		"\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\4\2\2]\7"+
		"\3\2\2\2^b\7\3\2\2_a\5\"\22\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2"+
		"ce\3\2\2\2db\3\2\2\2ef\5\f\7\2fg\7\5\2\2gh\7\4\2\2h\t\3\2\2\2ij\7$\2\2"+
		"jk\5\22\n\2kl\5\16\b\2lm\7\6\2\2mn\5\34\17\2no\7\7\2\2op\5\b\5\2p\13\3"+
		"\2\2\2qr\7%\2\2rs\5 \21\2s\r\3\2\2\2tv\7(\2\2ut\3\2\2\2vw\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2x\u0081\3\2\2\2y{\7(\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\u0080\3\2\2\2~\u0080\7)\2\2\177z\3\2\2\2\177~\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\17\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0086\5\24\13\2\u0086"+
		"\u008d\7\5\2\2\u0087\u0088\7\36\2\2\u0088\u0089\5\24\13\2\u0089\u008a"+
		"\7\5\2\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\21\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0091\t\2\2\2\u0091\23\3\2\2\2\u0092\u0093\5\22\n\2\u0093\u0096"+
		"\5 \21\2\u0094\u0095\7\b\2\2\u0095\u0097\5:\36\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\25\3\2\2\2\u0098\u0099\5 \21\2\u0099\u009a\7\b\2"+
		"\2\u009a\u009b\5:\36\2\u009b\27\3\2\2\2\u009c\u009f\5 \21\2\u009d\u009f"+
		"\5<\37\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\31\3\2\2\2\u00a0"+
		"\u00a1\5\16\b\2\u00a1\u00aa\7\6\2\2\u00a2\u00a7\5\30\r\2\u00a3\u00a4\7"+
		"\t\2\2\u00a4\u00a6\5\30\r\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00aa\u00a2\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\7\7\2\2\u00ad\33\3\2\2\2\u00ae\u00b3\5\24\13\2\u00af\u00b0\7\t"+
		"\2\2\u00b0\u00b2\5\24\13\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\35\3\2\2\2\u00b8\u00bd"+
		"\5:\36\2\u00b9\u00ba\7\t\2\2\u00ba\u00bc\5:\36\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\37\3\2\2\2\u00c2\u00c4\7(\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cf\3\2\2\2\u00c7\u00c9"+
		"\7(\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ce\7)\2\2\u00cd\u00c8\3\2"+
		"\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0!\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5\24\13"+
		"\2\u00d3\u00d4\7\5\2\2\u00d4\u00df\3\2\2\2\u00d5\u00d6\5:\36\2\u00d6\u00d7"+
		"\7\5\2\2\u00d7\u00df\3\2\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\7\5\2\2\u00da"+
		"\u00df\3\2\2\2\u00db\u00df\5(\25\2\u00dc\u00df\5\26\f\2\u00dd\u00df\5"+
		"\60\31\2\u00de\u00d2\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d8\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df#\3\2\2\2"+
		"\u00e0\u00e1\7&\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5&\24\2\u00e3\u00e4"+
		"\7\7\2\2\u00e4%\3\2\2\2\u00e5\u00e8\5<\37\2\u00e6\u00e8\5 \21\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\'\3\2\2\2\u00e9\u00ea\7!\2\2"+
		"\u00ea\u00eb\7\6\2\2\u00eb\u00ec\5\66\34\2\u00ec\u00ed\7\7\2\2\u00ed\u00ee"+
		"\5*\26\2\u00ee)\3\2\2\2\u00ef\u00f3\7\3\2\2\u00f0\u00f2\5,\27\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\4\2\2\u00f7"+
		"+\3\2\2\2\u00f8\u00f9\5\24\13\2\u00f9\u00fa\7\5\2\2\u00fa\u0106\3\2\2"+
		"\2\u00fb\u00fc\5:\36\2\u00fc\u00fd\7\5\2\2\u00fd\u0106\3\2\2\2\u00fe\u00ff"+
		"\5$\23\2\u00ff\u0100\7\5\2\2\u0100\u0106\3\2\2\2\u0101\u0106\5(\25\2\u0102"+
		"\u0106\5\26\f\2\u0103\u0106\5\60\31\2\u0104\u0106\5.\30\2\u0105\u00f8"+
		"\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u0101\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106-\3\2\2\2"+
		"\u0107\u0108\7\34\2\2\u0108\u010c\7\5\2\2\u0109\u010a\7\37\2\2\u010a\u010c"+
		"\7\5\2\2\u010b\u0107\3\2\2\2\u010b\u0109\3\2\2\2\u010c/\3\2\2\2\u010d"+
		"\u010e\7#\2\2\u010e\u010f\7\6\2\2\u010f\u0110\5\66\34\2\u0110\u0111\7"+
		"\7\2\2\u0111\u0112\5\62\32\2\u0112\61\3\2\2\2\u0113\u0117\7\3\2\2\u0114"+
		"\u0116\5\64\33\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011b\7\4\2\2\u011b\63\3\2\2\2\u011c\u011d\5\24\13\2\u011d\u011e\7\5"+
		"\2\2\u011e\u0129\3\2\2\2\u011f\u0120\5:\36\2\u0120\u0121\7\5\2\2\u0121"+
		"\u0129\3\2\2\2\u0122\u0123\5$\23\2\u0123\u0124\7\5\2\2\u0124\u0129\3\2"+
		"\2\2\u0125\u0129\5(\25\2\u0126\u0129\5\26\f\2\u0127\u0129\5\60\31\2\u0128"+
		"\u011c\3\2\2\2\u0128\u011f\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0125\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\65\3\2\2\2\u012a\u012f"+
		"\58\35\2\u012b\u012c\t\3\2\2\u012c\u012e\58\35\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\67\3\2\2"+
		"\2\u0131\u012f\3\2\2\2\u0132\u0140\5:\36\2\u0133\u0134\5:\36\2\u0134\u0135"+
		"\t\4\2\2\u0135\u0136\5:\36\2\u0136\u0140\3\2\2\2\u0137\u0138\5:\36\2\u0138"+
		"\u0139\t\5\2\2\u0139\u013a\5:\36\2\u013a\u0140\3\2\2\2\u013b\u013c\5:"+
		"\36\2\u013c\u013d\t\6\2\2\u013d\u013e\5:\36\2\u013e\u0140\3\2\2\2\u013f"+
		"\u0132\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0137\3\2\2\2\u013f\u013b\3\2"+
		"\2\2\u01409\3\2\2\2\u0141\u0142\b\36\1\2\u0142\u014b\5\26\f\2\u0143\u014b"+
		"\5\32\16\2\u0144\u014b\5 \21\2\u0145\u014b\5<\37\2\u0146\u0147\7\6\2\2"+
		"\u0147\u0148\5:\36\2\u0148\u0149\7\7\2\2\u0149\u014b\3\2\2\2\u014a\u0141"+
		"\3\2\2\2\u014a\u0143\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a"+
		"\u0146\3\2\2\2\u014b\u0154\3\2\2\2\u014c\u014d\f\7\2\2\u014d\u014e\t\7"+
		"\2\2\u014e\u0153\5:\36\b\u014f\u0150\f\6\2\2\u0150\u0151\t\b\2\2\u0151"+
		"\u0153\5:\36\7\u0152\u014c\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0156\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155;\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0157\u015c\5@!\2\u0158\u015c\5> \2\u0159\u015c\5D#\2\u015a\u015c"+
		"\5B\"\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015c=\3\2\2\2\u015d\u015e\7)\2\2\u015e?\3\2\2\2\u015f"+
		"\u0160\t\t\2\2\u0160A\3\2\2\2\u0161\u0162\7\31\2\2\u0162\u0163\7(\2\2"+
		"\u0163\u0164\7\31\2\2\u0164C\3\2\2\2\u0165\u0166\7)\2\2\u0166\u0167\7"+
		"\32\2\2\u0167\u0168\7)\2\2\u0168E\3\2\2\2$GLYbw|\177\u0081\u008d\u0096"+
		"\u009e\u00a7\u00aa\u00b3\u00b6\u00bd\u00c0\u00c5\u00ca\u00cd\u00cf\u00de"+
		"\u00e7\u00f3\u0105\u010b\u0117\u0128\u012f\u013f\u014a\u0152\u0154\u015b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}