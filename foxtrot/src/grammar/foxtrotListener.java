// Generated from grammar/foxtrot.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link foxtrotParser}.
 */
public interface foxtrotListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Una}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull foxtrotParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Una}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull foxtrotParser.UnaContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#DeclareVar}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVar(@NotNull foxtrotParser.DeclareVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#DeclareVar}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVar(@NotNull foxtrotParser.DeclareVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#DeclareArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclareArray(@NotNull foxtrotParser.DeclareArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#DeclareArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclareArray(@NotNull foxtrotParser.DeclareArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(@NotNull foxtrotParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(@NotNull foxtrotParser.DeclareContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull foxtrotParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull foxtrotParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Newline}.
	 * @param ctx the parse tree
	 */
	void enterNewline(@NotNull foxtrotParser.NewlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Newline}.
	 * @param ctx the parse tree
	 */
	void exitNewline(@NotNull foxtrotParser.NewlineContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#While}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull foxtrotParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#While}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull foxtrotParser.WhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull foxtrotParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull foxtrotParser.StatementsContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(@NotNull foxtrotParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(@NotNull foxtrotParser.Var_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull foxtrotParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull foxtrotParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull foxtrotParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull foxtrotParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Idx}.
	 * @param ctx the parse tree
	 */
	void enterIdx(@NotNull foxtrotParser.IdxContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Idx}.
	 * @param ctx the parse tree
	 */
	void exitIdx(@NotNull foxtrotParser.IdxContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull foxtrotParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull foxtrotParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Def}.
	 * @param ctx the parse tree
	 */
	void enterDef(@NotNull foxtrotParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Def}.
	 * @param ctx the parse tree
	 */
	void exitDef(@NotNull foxtrotParser.DefContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(@NotNull foxtrotParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(@NotNull foxtrotParser.ArgumentContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull foxtrotParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull foxtrotParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Call}.
	 * @param ctx the parse tree
	 */
	void enterCall(@NotNull foxtrotParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Call}.
	 * @param ctx the parse tree
	 */
	void exitCall(@NotNull foxtrotParser.CallContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Str}.
	 * @param ctx the parse tree
	 */
	void enterStr(@NotNull foxtrotParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Str}.
	 * @param ctx the parse tree
	 */
	void exitStr(@NotNull foxtrotParser.StrContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull foxtrotParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull foxtrotParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Par}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull foxtrotParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Par}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull foxtrotParser.ParContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(@NotNull foxtrotParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(@NotNull foxtrotParser.Return_typeContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Not}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull foxtrotParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Not}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull foxtrotParser.NotContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#arity}.
	 * @param ctx the parse tree
	 */
	void enterArity(@NotNull foxtrotParser.ArityContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#arity}.
	 * @param ctx the parse tree
	 */
	void exitArity(@NotNull foxtrotParser.ArityContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(@NotNull foxtrotParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(@NotNull foxtrotParser.LvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull foxtrotParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull foxtrotParser.Function_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Or}.
	 * @param ctx the parse tree
	 */
	void enterOr(@NotNull foxtrotParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Or}.
	 * @param ctx the parse tree
	 */
	void exitOr(@NotNull foxtrotParser.OrContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull foxtrotParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull foxtrotParser.VarContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#If}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull foxtrotParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#If}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull foxtrotParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull foxtrotParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull foxtrotParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#And}.
	 * @param ctx the parse tree
	 */
	void enterAnd(@NotNull foxtrotParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#And}.
	 * @param ctx the parse tree
	 */
	void exitAnd(@NotNull foxtrotParser.AndContext ctx);

	/**
	 * Enter a parse tree produced by {@link foxtrotParser#Comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull foxtrotParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link foxtrotParser#Comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull foxtrotParser.CompContext ctx);
}