// Generated from grammar/foxtrot.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link foxtrotParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface foxtrotVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Una}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull foxtrotParser.UnaContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#DeclareVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVar(@NotNull foxtrotParser.DeclareVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#DeclareArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareArray(@NotNull foxtrotParser.DeclareArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(@NotNull foxtrotParser.DeclareContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull foxtrotParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewline(@NotNull foxtrotParser.NewlineContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#While}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull foxtrotParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull foxtrotParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(@NotNull foxtrotParser.Var_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull foxtrotParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull foxtrotParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Idx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdx(@NotNull foxtrotParser.IdxContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull foxtrotParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull foxtrotParser.DefContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(@NotNull foxtrotParser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull foxtrotParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(@NotNull foxtrotParser.CallContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(@NotNull foxtrotParser.StrContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull foxtrotParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull foxtrotParser.ParContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(@NotNull foxtrotParser.Return_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull foxtrotParser.NotContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#arity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArity(@NotNull foxtrotParser.ArityContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull foxtrotParser.LvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull foxtrotParser.Function_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull foxtrotParser.OrContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull foxtrotParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull foxtrotParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull foxtrotParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#And}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull foxtrotParser.AndContext ctx);

	/**
	 * Visit a parse tree produced by {@link foxtrotParser#Comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(@NotNull foxtrotParser.CompContext ctx);
}