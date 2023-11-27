package model;

import gen.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WrittenVariables {
    private Map<String, String> writtenTypes = new HashMap<>();

    private List<String> allowedStringCompares = Arrays.asList("==", "!=");

    public String getWrittenType(String key){
        return writtenTypes.get(key);
    }

    public void addWrittenType(String key, String type) {
        this.writtenTypes.put(key, type);
    }

    public String findWrittenType(GrammarParser.VarContext ctx) {
        if (ctx.INT() != null)
            return "int";
        if (ctx.FLOAT() != null)
            return "float";
        if (ctx.STRING() != null)
            return "String";
        return "";
    }

    public void compareVariables(GrammarParser.ConditionContext ctx, String compare, Result result) {
        List<String> compareTypes = shouldCompare(ctx.var());

        if (compareTypes.get(0).equals("String"))
            compareWithString(ctx.var(), compare, result);
        if (compareTypes.get(0).equals("int"))
            compareWithInt(ctx.var(), compare, result );
        if (compareTypes.get(0).equals("float"))
            compareWithFloat(ctx.var(), compare, result);
    }

    private void compareWithFloat(List<GrammarParser.VarContext> id, String compare, Result result) {
        float firstValue = Float.parseFloat(replaceStringValue(id.get(0)));
        float secondValue = Float.parseFloat(replaceStringValue(id.get(1)));

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

    private void compareWithInt(List<GrammarParser.VarContext> id, String compare, Result result) {
        int firstValue = Integer.parseInt(replaceStringValue(id.get(0)));
        int secondValue = Integer.parseInt(replaceStringValue(id.get(1)));

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

    private void compareWithString(List<GrammarParser.VarContext> id, String compare, Result result) {
        String firstValue =  replaceStringValue(id.get(0));
        String secondValue =  replaceStringValue(id.get(1));

        if (!allowedStringCompares.contains(compare))
            throw new RuntimeException("Is only possible to compare String with '==' or '!='");

        if (compare.equals("=="))
            result.setIfCondition(firstValue.equals(secondValue));
        else
            result.setIfCondition(!firstValue.equals(secondValue));
    }

    private List<String> shouldCompare(List<GrammarParser.VarContext> id) {
        String firstType = getWrittenType(replaceStringValue(id.get(0)));
        String secondType = getWrittenType(replaceStringValue(id.get(1)));

        if (!firstType.equals(secondType))
            throw new RuntimeException("Is not possible to compare " + firstType + " and " + secondType);

        return Arrays.asList(firstType, secondType);
    }

    private String replaceStringValue(GrammarParser.VarContext var){
        return var.getText().replace("\"", "");
    }
}
