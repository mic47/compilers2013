// Generated from jazzik.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jazzikParser}.
 */
public interface jazzikListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jazzikParser#AssignArray}.
	 * @param ctx the parse tree
	 */
	void enterAssignArray(@NotNull jazzikParser.AssignArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#AssignArray}.
	 * @param ctx the parse tree
	 */
	void exitAssignArray(@NotNull jazzikParser.AssignArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Una}.
	 * @param ctx the parse tree
	 */
	void enterUna(@NotNull jazzikParser.UnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Una}.
	 * @param ctx the parse tree
	 */
	void exitUna(@NotNull jazzikParser.UnaContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ErrorNested}.
	 * @param ctx the parse tree
	 */
	void enterErrorNested(@NotNull jazzikParser.ErrorNestedContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ErrorNested}.
	 * @param ctx the parse tree
	 */
	void exitErrorNested(@NotNull jazzikParser.ErrorNestedContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull jazzikParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull jazzikParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#While}.
	 * @param ctx the parse tree
	 */
	void enterWhile(@NotNull jazzikParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#While}.
	 * @param ctx the parse tree
	 */
	void exitWhile(@NotNull jazzikParser.WhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#VarDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull jazzikParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#VarDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull jazzikParser.VarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull jazzikParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull jazzikParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ForStm}.
	 * @param ctx the parse tree
	 */
	void enterForStm(@NotNull jazzikParser.ForStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ForStm}.
	 * @param ctx the parse tree
	 */
	void exitForStm(@NotNull jazzikParser.ForStmContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#WriteID}.
	 * @param ctx the parse tree
	 */
	void enterWriteID(@NotNull jazzikParser.WriteIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#WriteID}.
	 * @param ctx the parse tree
	 */
	void exitWriteID(@NotNull jazzikParser.WriteIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull jazzikParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull jazzikParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Size}.
	 * @param ctx the parse tree
	 */
	void enterSize(@NotNull jazzikParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Size}.
	 * @param ctx the parse tree
	 */
	void exitSize(@NotNull jazzikParser.SizeContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#FuncArgDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgDecl(@NotNull jazzikParser.FuncArgDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#FuncArgDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgDecl(@NotNull jazzikParser.FuncArgDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull jazzikParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull jazzikParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#FuncDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(@NotNull jazzikParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#FuncDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(@NotNull jazzikParser.FuncDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#FuncArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgExpr(@NotNull jazzikParser.FuncArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#FuncArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgExpr(@NotNull jazzikParser.FuncArgExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ForEach}.
	 * @param ctx the parse tree
	 */
	void enterForEach(@NotNull jazzikParser.ForEachContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ForEach}.
	 * @param ctx the parse tree
	 */
	void exitForEach(@NotNull jazzikParser.ForEachContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull jazzikParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull jazzikParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(@NotNull jazzikParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(@NotNull jazzikParser.FunccallContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Bin}.
	 * @param ctx the parse tree
	 */
	void enterBin(@NotNull jazzikParser.BinContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Bin}.
	 * @param ctx the parse tree
	 */
	void exitBin(@NotNull jazzikParser.BinContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#IntConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntConstant(@NotNull jazzikParser.IntConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#IntConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntConstant(@NotNull jazzikParser.IntConstantContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(@NotNull jazzikParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(@NotNull jazzikParser.CmpContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ContinueError}.
	 * @param ctx the parse tree
	 */
	void enterContinueError(@NotNull jazzikParser.ContinueErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ContinueError}.
	 * @param ctx the parse tree
	 */
	void exitContinueError(@NotNull jazzikParser.ContinueErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Read}.
	 * @param ctx the parse tree
	 */
	void enterRead(@NotNull jazzikParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Read}.
	 * @param ctx the parse tree
	 */
	void exitRead(@NotNull jazzikParser.ReadContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#If}.
	 * @param ctx the parse tree
	 */
	void enterIf(@NotNull jazzikParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#If}.
	 * @param ctx the parse tree
	 */
	void exitIf(@NotNull jazzikParser.IfContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#funcdecls}.
	 * @param ctx the parse tree
	 */
	void enterFuncdecls(@NotNull jazzikParser.FuncdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#funcdecls}.
	 * @param ctx the parse tree
	 */
	void exitFuncdecls(@NotNull jazzikParser.FuncdeclsContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ReadArray}.
	 * @param ctx the parse tree
	 */
	void enterReadArray(@NotNull jazzikParser.ReadArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ReadArray}.
	 * @param ctx the parse tree
	 */
	void exitReadArray(@NotNull jazzikParser.ReadArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#funcargs}.
	 * @param ctx the parse tree
	 */
	void enterFuncargs(@NotNull jazzikParser.FuncargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#funcargs}.
	 * @param ctx the parse tree
	 */
	void exitFuncargs(@NotNull jazzikParser.FuncargsContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ArrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDecl(@NotNull jazzikParser.ArrayDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ArrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDecl(@NotNull jazzikParser.ArrayDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#WriteInt}.
	 * @param ctx the parse tree
	 */
	void enterWriteInt(@NotNull jazzikParser.WriteIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#WriteInt}.
	 * @param ctx the parse tree
	 */
	void exitWriteInt(@NotNull jazzikParser.WriteIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull jazzikParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull jazzikParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#IfStm}.
	 * @param ctx the parse tree
	 */
	void enterIfStm(@NotNull jazzikParser.IfStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#IfStm}.
	 * @param ctx the parse tree
	 */
	void exitIfStm(@NotNull jazzikParser.IfStmContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#FuncArgDecls}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgDecls(@NotNull jazzikParser.FuncArgDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#FuncArgDecls}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgDecls(@NotNull jazzikParser.FuncArgDeclsContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ErrorBreak}.
	 * @param ctx the parse tree
	 */
	void enterErrorBreak(@NotNull jazzikParser.ErrorBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ErrorBreak}.
	 * @param ctx the parse tree
	 */
	void exitErrorBreak(@NotNull jazzikParser.ErrorBreakContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#IntDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntDecl(@NotNull jazzikParser.IntDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#IntDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntDecl(@NotNull jazzikParser.IntDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#WriteStr}.
	 * @param ctx the parse tree
	 */
	void enterWriteStr(@NotNull jazzikParser.WriteStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#WriteStr}.
	 * @param ctx the parse tree
	 */
	void exitWriteStr(@NotNull jazzikParser.WriteStrContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Log}.
	 * @param ctx the parse tree
	 */
	void enterLog(@NotNull jazzikParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Log}.
	 * @param ctx the parse tree
	 */
	void exitLog(@NotNull jazzikParser.LogContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#FuncExtern}.
	 * @param ctx the parse tree
	 */
	void enterFuncExtern(@NotNull jazzikParser.FuncExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#FuncExtern}.
	 * @param ctx the parse tree
	 */
	void exitFuncExtern(@NotNull jazzikParser.FuncExternContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(@NotNull jazzikParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(@NotNull jazzikParser.WriteContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ArrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(@NotNull jazzikParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ArrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(@NotNull jazzikParser.ArrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#For}.
	 * @param ctx the parse tree
	 */
	void enterFor(@NotNull jazzikParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#For}.
	 * @param ctx the parse tree
	 */
	void exitFor(@NotNull jazzikParser.ForContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ReadInt}.
	 * @param ctx the parse tree
	 */
	void enterReadInt(@NotNull jazzikParser.ReadIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ReadInt}.
	 * @param ctx the parse tree
	 */
	void exitReadInt(@NotNull jazzikParser.ReadIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#VarAccess}.
	 * @param ctx the parse tree
	 */
	void enterVarAccess(@NotNull jazzikParser.VarAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#VarAccess}.
	 * @param ctx the parse tree
	 */
	void exitVarAccess(@NotNull jazzikParser.VarAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#FuncCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(@NotNull jazzikParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#FuncCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(@NotNull jazzikParser.FuncCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(@NotNull jazzikParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(@NotNull jazzikParser.VarsContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Par}.
	 * @param ctx the parse tree
	 */
	void enterPar(@NotNull jazzikParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Par}.
	 * @param ctx the parse tree
	 */
	void exitPar(@NotNull jazzikParser.ParContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#FuncArgID}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgID(@NotNull jazzikParser.FuncArgIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#FuncArgID}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgID(@NotNull jazzikParser.FuncArgIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#ReturnInt}.
	 * @param ctx the parse tree
	 */
	void enterReturnInt(@NotNull jazzikParser.ReturnIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#ReturnInt}.
	 * @param ctx the parse tree
	 */
	void exitReturnInt(@NotNull jazzikParser.ReturnIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#AssignInt}.
	 * @param ctx the parse tree
	 */
	void enterAssignInt(@NotNull jazzikParser.AssignIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#AssignInt}.
	 * @param ctx the parse tree
	 */
	void exitAssignInt(@NotNull jazzikParser.AssignIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVardecl(@NotNull jazzikParser.VardeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVardecl(@NotNull jazzikParser.VardeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link jazzikParser#Unless}.
	 * @param ctx the parse tree
	 */
	void enterUnless(@NotNull jazzikParser.UnlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link jazzikParser#Unless}.
	 * @param ctx the parse tree
	 */
	void exitUnless(@NotNull jazzikParser.UnlessContext ctx);
}