import gen.GrammarParser;
import gen.GrammarVisitor;
import model.Variables;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class MyGrammarVisitor<T> extends AbstractParseTreeVisitor<T> implements GrammarVisitor<T> {

    public Variables variables = new Variables();
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
        String type = ctx.TYPE().getText();
        variables.addType(type);
        variables.addVariable(ctx.ID().getText(), getValueFromExpression(ctx.expression().getText(), type));
        return null;
    }
    private Object getValueFromExpression(String value, String type){
        if (type.equals("String")){
            if(!value.contains("\"")){
                throw new RuntimeException();
            }
            return value.replace("\"", "");
        }

        if (type.equals("int"))
            return Integer.valueOf(value);

        return Float.valueOf(value);
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
