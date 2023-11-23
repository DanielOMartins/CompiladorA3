import gen.GrammarParser;
import gen.GrammarVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MyGrammarVisitor<T> extends AbstractParseTreeVisitor<T> implements GrammarVisitor<T> {
    @Override
    public T visitProgram(GrammarParser.ProgramContext ctx) {
        ctx.statement().forEach(this::visitStatement);
        return null;
    }

    @Override
    public T visitStatement(GrammarParser.StatementContext ctx) {
        if (ctx.assignment() != null) {
            return visitAssignment(ctx.assignment());
        } else if (ctx.ifStatement() != null) {
            return visitIfStatement(ctx.ifStatement());
        }

        return null;
    }

    @Override
    public T visitVar(GrammarParser.VarContext ctx) {
        return null;
    }

    @Override
    public T visitStatementEnd(GrammarParser.StatementEndContext ctx) {
        return null;
    }

    @Override
    public T visitAssignment(GrammarParser.AssignmentContext ctx) {
        ctx.TYPE();
        return null;
    }

    @Override
    public T visitExpression(GrammarParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public T visitCondition(GrammarParser.ConditionContext ctx) {
        return null;
    }

    @Override
    public T visitPrintStatement(GrammarParser.PrintStatementContext ctx) {
        return null;
    }

    @Override
    public T visitIfStatement(GrammarParser.IfStatementContext ctx) {
        return null;
    }
}
