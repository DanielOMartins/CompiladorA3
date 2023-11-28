package model;

import gen.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static Utils.Utils.*;

public class Result {
    private boolean ifCondition = false;
    private boolean elseCondition = false;
    private Object expressionResult;
    private String expressionOperator;
    private boolean isVar = false;

    public boolean isIfCondition(GrammarParser.StatementContext statement, OutputJava outputJava, boolean isElse) throws IOException {
        if(!ifCondition){
            outputJava.inside(statement);
        } else if (isElse) {
            outputJava.inside(statement);
        }
        return ifCondition;
    }

    public void setIfCondition(boolean ifCondition) {
        this.ifCondition = ifCondition;
    }

    public boolean isVar() {
        return this.isVar;
    }

    public void setVar(boolean var) {
        this.isVar = var;
    }

    public void setElseCondition(boolean elseCondition) {
        this.elseCondition = elseCondition;
    }

    public Object getExpressionResult() {
        return expressionResult;
    }

    public void setExpressionResult(Object expressionResult) {
        this.expressionResult = expressionResult;
    }

    public String getExpressionOperator() {
        return expressionOperator;
    }

    public void setExpressionOperator(String expressionOperator) {
        this.expressionOperator = expressionOperator;
    }

    public void getValueFromExpression(GrammarParser.ExpressionContext ctx, int line, WrittenVariables writtenVariables, Variables variables) {
        String type = findType(writtenVariables, variables, ctx);
        String value = findValue(writtenVariables, variables, ctx);

        if (type.equals("String")){
            if(!value.contains("\"")){
                throw new RuntimeException("Syntax error at line " + line + ", " + type + " can not recieve this value: " + value);
            }
            setExpressionResult(value);
        }

        if (type.equals("double")){
            if (!value.contains(".")){
                throw new RuntimeException("Syntax error at line " + line + ", " + type + " can not recieve this value: " + value);
            }
            setExpressionResult(Double.valueOf(value));
        }

        if (type.equals("int"))
            setExpressionResult(Integer.valueOf(value));
    }

    private String findValue(WrittenVariables writtenVariables, Variables variables, GrammarParser.ExpressionContext ctx) {
        if (!ctx.var().isEmpty())
            return ctx.getText();
        else
            return String.valueOf(variables.getVariable(ctx.getText()));
    }

    public String findType(WrittenVariables writtenVariables, Variables variables, GrammarParser.ExpressionContext ctx) {
        if (!ctx.var().isEmpty())
            return writtenVariables.getWrittenType(ctx.var(0).getText());
        else
            return variables.getType(ctx.ID().get(0).getText());
    }

    public void getValueFromExpression(List<GrammarParser.VarContext> id, WrittenVariables writtenVariables) {
        writtenVariables.shouldCompare(id);
        List<String> values = Arrays.asList(id.get(0).getText(), id.get(1).getText());

        if (writtenVariables.getWrittenType(values.get(0)).equals("String"))
            calculateString(values, getExpressionOperator(), this, 0);
        if (writtenVariables.getWrittenType(values.get(0)).equals("int"))
            calculateInt(values, getExpressionOperator(), this, 0);
        if (writtenVariables.getWrittenType(values.get(0)).equals("double"))
            calculateDouble(values, getExpressionOperator(), this, 0);
    }

    public void getValueFromExpression(List<TerminalNode> id, Variables variables) {
        variables.shouldStatement(id);
        List<Object> values = Arrays.asList(variables.getExistentVariable(id.get(0).getText()), variables.getExistentVariable(id.get(1).getText()));

        if (variables.getType(id.get(0).getText()).equals("String"))
            calculateString(values, getExpressionOperator(), this);
        if (variables.getType(id.get(0).getText()).equals("int"))
            calculateInt(values, getExpressionOperator(), this);
        if (variables.getType(id.get(0).getText()).equals("double"))
            calculateDouble(values, getExpressionOperator(), this);
    }


}
