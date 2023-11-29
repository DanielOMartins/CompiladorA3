package model;

import Utils.Utils;
import gen.GrammarParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Utils.Utils.replaceStringValue;

public class WrittenVariables {
    private Map<String, String> writtenTypes = new HashMap<>();

    private List<String> allowedStringCompares = Arrays.asList("==", "!=");

    public String getWrittenType(String key){
        return writtenTypes.getOrDefault(key, "");
    }

    public void addWrittenType(String key, String type) {
        this.writtenTypes.put(key, type);
    }

    public String findWrittenType(GrammarParser.VarContext ctx) {
        if (ctx.INT() != null)
            return "int";
        if (ctx.DOUBLE() != null)
            return "double";
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
        if (compareTypes.get(0).equals("double"))
            compareWithDouble(ctx.var(), compare, result);
    }

    private void compareWithDouble(List<GrammarParser.VarContext> id, String compare, Result result) {
        double firstValue = Double.parseDouble(replaceStringValue(id.get(0)));
        double secondValue = Double.parseDouble(replaceStringValue(id.get(1)));

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
            throw new RuntimeException("Syntax error at line " + id.get(0).getStart().getLine() + ". Is only possible to compare String with '==' or '!='");

        if (compare.equals("=="))
            result.setIfCondition(firstValue.equals(secondValue));
        else
            result.setIfCondition(!firstValue.equals(secondValue));
    }

    public List<String> shouldCompare(List<GrammarParser.VarContext> id) {
        String firstType = getWrittenType(replaceStringValue(id.get(0)));
        String secondType = getWrittenType(replaceStringValue(id.get(1)));

        if (!firstType.equals(secondType))
            throw new RuntimeException("Syntax error at line " + id.get(0).getStart().getLine() + ". Is not possible to compare " + firstType + " and " + secondType);

        return Arrays.asList(firstType, secondType);
    }


}
