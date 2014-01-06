// Generated from jazzik.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jazzikParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jazzikVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jazzikParser#AssignArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArray(@NotNull jazzikParser.AssignArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Una}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull jazzikParser.UnaContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ErrorNested}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorNested(@NotNull jazzikParser.ErrorNestedContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull jazzikParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#While}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull jazzikParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#VarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull jazzikParser.VarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull jazzikParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ForStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStm(@NotNull jazzikParser.ForStmContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#WriteID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteID(@NotNull jazzikParser.WriteIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull jazzikParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(@NotNull jazzikParser.SizeContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#FuncArgDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgDecl(@NotNull jazzikParser.FuncArgDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull jazzikParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#FuncDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(@NotNull jazzikParser.FuncDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#FuncArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgExpr(@NotNull jazzikParser.FuncArgExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ForEach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEach(@NotNull jazzikParser.ForEachContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull jazzikParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(@NotNull jazzikParser.FunccallContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Bin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin(@NotNull jazzikParser.BinContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#IntConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConstant(@NotNull jazzikParser.IntConstantContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(@NotNull jazzikParser.CmpContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ContinueError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueError(@NotNull jazzikParser.ContinueErrorContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(@NotNull jazzikParser.ReadContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull jazzikParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#funcdecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecls(@NotNull jazzikParser.FuncdeclsContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ReadArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadArray(@NotNull jazzikParser.ReadArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#funcargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncargs(@NotNull jazzikParser.FuncargsContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ArrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDecl(@NotNull jazzikParser.ArrayDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#WriteInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteInt(@NotNull jazzikParser.WriteIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull jazzikParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#IfStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStm(@NotNull jazzikParser.IfStmContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#FuncArgDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgDecls(@NotNull jazzikParser.FuncArgDeclsContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ErrorBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorBreak(@NotNull jazzikParser.ErrorBreakContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#IntDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDecl(@NotNull jazzikParser.IntDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#WriteStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStr(@NotNull jazzikParser.WriteStrContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(@NotNull jazzikParser.LogContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#FuncExtern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExtern(@NotNull jazzikParser.FuncExternContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(@NotNull jazzikParser.WriteContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ArrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(@NotNull jazzikParser.ArrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#For}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull jazzikParser.ForContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ReadInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInt(@NotNull jazzikParser.ReadIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#VarAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAccess(@NotNull jazzikParser.VarAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#FuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull jazzikParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(@NotNull jazzikParser.VarsContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull jazzikParser.ParContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#FuncArgID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgID(@NotNull jazzikParser.FuncArgIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#ReturnInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInt(@NotNull jazzikParser.ReturnIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#AssignInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignInt(@NotNull jazzikParser.AssignIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardecl(@NotNull jazzikParser.VardeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link jazzikParser#Unless}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnless(@NotNull jazzikParser.UnlessContext ctx);
}