import gen.GrammarParser;
import gen.GrammarVisitor;
import model.Variables;
import model.Result;
import model.WrittenVariables;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.List;

public class MyGrammarVisitor<T> extends AbstractParseTreeVisitor<Result> implements GrammarVisitor<Result> {

    public Variables variables = new Variables();
    public Result result = new Result();
    public WrittenVariables writtenVariables = new WrittenVariables();

    @Override
    public Result visitProgram(GrammarParser.ProgramContext ctx) {
        ctx.statement().forEach(this::visitStatement);
        return null;
    }

    @Override
    public Result visitStatement(GrammarParser.StatementContext ctx) {
        if (ctx.assignment() != null) {
            return visitAssignment(ctx.assignment());
        } else if (ctx.ifStatement() != null) {
            return visitIfStatement(ctx.ifStatement());
        } else if (ctx.printStatement() != null) {
            return visitPrintStatement(ctx.printStatement());
        }

        return null;
    }

    @Override
    public Result visitVar(GrammarParser.VarContext ctx) {
        String type = writtenVariables.findWrittenType(ctx);
        String value = ctx.getText().replace("\"", "");
        writtenVariables.addWrittenType(value, type);
        return null;
    }

    @Override
    public Result visitCompare(GrammarParser.CompareContext ctx) {
        return null;
    }

    @Override
    public Result visitStatementEnd(GrammarParser.StatementEndContext ctx) {
        return null;
    }

    @Override
    public Result visitAssignment(GrammarParser.AssignmentContext ctx) {
        String type = ctx.TYPE().getText();
        String varName = ctx.ID().getText();
        variables.addType(varName, type);
        variables.addVariable(varName, variables.getValueFromExpression(ctx.expression().getText(), type, ctx.getStart().getLine()));
        return null;
    }
    @Override
    public Result visitExpression(GrammarParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Result visitCondition(GrammarParser.ConditionContext ctx) {
        String compare = ctx.compare().getText();

        if (ctx.ID().isEmpty()){
            ctx.var().forEach(this::visitVar);
            writtenVariables.compareVariables(ctx, compare, result);
        } else {
            variables.compareVariables(ctx, compare, result);
        }

        return null;
    }

    @Override
    public Result visitPrintStatement(GrammarParser.PrintStatementContext ctx) {
        System.out.println(ctx.expression().getText().replace("\"", ""));
        return null;
    }

    @Override
    public Result visitIfStatement(GrammarParser.IfStatementContext ctx) {
        visitCondition(ctx.condition());
        if (result.isIfCondition()){
            visitStatement(ctx.statement(0));
        }
        if (!result.isIfCondition() && ctx.statement(1) != null){
            visitStatement(ctx.statement(1));
        }

        return null;
    }
}
