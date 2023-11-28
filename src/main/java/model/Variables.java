package model;

import gen.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class Variables {
    private Map<String,String> types = new HashMap<>();
    private Map<String, Object> variables = new HashMap<>();
    private List<String> allowedStringCompares = Arrays.asList("==", "!=");

    public Map<String,String> getTypes() {
        return types;
    }
    public String getType(String key){
        return types.get(key);
    }

    public void addType(String key, String type) {
        this.types.put(key, type);
    }

    public Map<String, Object> getVariables() {
        return variables;
    }
    public Object getVariable(String key){
        return variables.get(key);
    }

    public void addVariable(String key, Object value) {
        this.variables.put(key, value);
    }

    public void compareVariables(GrammarParser.ConditionContext ctx, String compare, Result result) {
        List<String> compareTypes = shouldCompare(ctx.ID());

        if (compareTypes.get(0).equals("String"))
            compareWithString(ctx.ID(), compare, result);
        if (compareTypes.get(0).equals("int"))
            compareWithInt(ctx.ID(), compare, result );
        if (compareTypes.get(0).equals("double"))
            compareWithDouble(ctx.ID(), compare, result);
    }

    private void compareWithDouble(List<TerminalNode> id, String compare, Result result) {
        double firstValue = (Double) getVariable(id.get(0).getText());
        double secondValue = (Double) getVariable(id.get(1).getText());

        if (compare.equals("==")) {
            result.setIfCondition(firstValue == secondValue);
        }
        if (compare.equals("!=")) {
            result.setIfCondition(firstValue != secondValue);
        }
        if (compare.equals("<")) {
            result.setIfCondition(firstValue < secondValue);
        }
        if (compare.equals("<=")) {
            result.setIfCondition(firstValue <= secondValue);
        }
        if (compare.equals(">")) {
            result.setIfCondition(firstValue > secondValue);
        }
        if (compare.equals(">=")) {
            result.setIfCondition(firstValue >= secondValue);
        }
    }

    private void compareWithInt(List<TerminalNode> id, String compare, Result result) {
        int firstValue = (Integer) getVariable(id.get(0).getText());
        int secondValue = (Integer) getVariable(id.get(1).getText());

        if (compare.equals("==")) {
            result.setIfCondition(firstValue == secondValue);
        }
        if (compare.equals("!=")) {
            result.setIfCondition(firstValue != secondValue);
        }
        if (compare.equals("<")) {
            result.setIfCondition(firstValue < secondValue);
        }
        if (compare.equals("<=")) {
            result.setIfCondition(firstValue <= secondValue);
        }
        if (compare.equals(">")) {
            result.setIfCondition(firstValue > secondValue);
        }
        if (compare.equals(">=")) {
            result.setIfCondition(firstValue >= secondValue);
        }
    }

    private void compareWithString(List<TerminalNode> id, String compare, Result result) {
        String firstValue = (String) getVariable(id.get(0).getText());
        String secondValue = (String) getVariable(id.get(1).getText());

        if (!allowedStringCompares.contains(compare))
            throw new RuntimeException("Is only possible to compare String with '==' or '!='");

        if (compare.equals("=="))
            result.setIfCondition(firstValue.equals(secondValue));
        else
            result.setIfCondition(!firstValue.equals(secondValue));
    }

    public List<String> shouldCompare(List<TerminalNode> id) {
        String firstType = getType(id.get(0).getText());
        String secondType = getType(id.get(1).getText());

        if (!firstType.equals(secondType))
            throw new RuntimeException("Is not possible to compare " + firstType + " and " + secondType);

        return Arrays.asList(firstType, secondType);
    }

    public List<String> shouldStatement(List<TerminalNode> id) {
        String firstType = getType(id.get(0).getText());
        String secondType = getType(id.get(1).getText());

        if (!firstType.equals(secondType))
            throw new RuntimeException("Is not possible to realize operation with " + firstType + " and " + secondType);

        return Arrays.asList(firstType, secondType);
    }

    public void verifyDoesExist(String varName) {
        if (getVariables().containsKey(varName))
            throw new RuntimeException("Variable " + varName + " is already declared.");
    }

    public void verifyDoesNotExist(String varName) {
        if (!getVariables().containsKey(varName))
            throw new RuntimeException("Variable " + varName + " has not been declared yet.");
    }

    public Object getExistentVariable(String varName) {
        if (getVariables().containsKey(varName))
            return getVariable(varName);
        else
            throw new RuntimeException("Variable has not been declared yet.");
    }
}
