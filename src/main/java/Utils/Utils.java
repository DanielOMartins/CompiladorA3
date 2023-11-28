package Utils;

import gen.GrammarParser;
import model.Result;

import java.util.List;

public class Utils {
    public static String replaceStringValue(GrammarParser.VarContext var){
        return var.getText().replace("\"", "");
    }

    public static String replaceStringValue(String var){
        return var.replace("\"", "");
    }

    public static void calculateString(List<Object> values, String expressionOperator, Result result) {
        if (expressionOperator.equals("+"))
            result.setExpressionResult( replaceStringValue((String) values.get(0)) + replaceStringValue((String) values.get(1)));
        else
            throw new RuntimeException("Is only possible to concatenate String with '+'");
    }

    public static void calculateInt(List<Object> values, String expressionOperator, Result result) {
        if (expressionOperator.equals("+"))
            result.setExpressionResult((Integer)(values.get(0)) + (Integer)(values.get(1)));
        if (expressionOperator.equals("-"))
            result.setExpressionResult((Integer)(values.get(0)) - (Integer)(values.get(1)));
        if (expressionOperator.equals("*"))
            result.setExpressionResult((Integer)(values.get(0)) * (Integer)(values.get(1)));
        if (expressionOperator.equals("/")){
            if (values.get(1).equals("0"))
                throw new RuntimeException("Is not possible to divide by 0");
            else
                result.setExpressionResult((Integer)(values.get(0)) / (Integer)(values.get(1)));
        }
    }

    public static void calculateDouble(List<Object> values, String expressionOperator, Result result) {
        if (expressionOperator.equals("+"))
            result.setExpressionResult((Double)(values.get(0)) + (Double)(values.get(1)));
        if (expressionOperator.equals("-"))
            result.setExpressionResult((Double)(values.get(0)) - (Double)(values.get(1)));
        if (expressionOperator.equals("*"))
            result.setExpressionResult((Double)(values.get(0)) * (Double)(values.get(1)));
        if (expressionOperator.equals("/")){
            if (values.get(1).equals("0"))
                throw new RuntimeException("Is not possible to divide by 0");
            else
                result.setExpressionResult((Double)(values.get(0)) / (Double)(values.get(1)));
        }
    }


    //Written
    public static void calculateString(List<String> values, String expressionOperator, Result result, int i) {
        if (expressionOperator.equals("+"))
            result.setExpressionResult( values.get(0) + values.get(1));
        else
            throw new RuntimeException("Is only possible to concatenate String with '+'");
    }

    public static void calculateInt(List<String> values, String expressionOperator, Result result, int i) {
        if (expressionOperator.equals("+"))
            result.setExpressionResult(Integer.parseInt(values.get(0)) + Integer.parseInt(values.get(1)));
        if (expressionOperator.equals("-"))
            result.setExpressionResult(Integer.parseInt(values.get(0)) - Integer.parseInt(values.get(1)));
        if (expressionOperator.equals("*"))
            result.setExpressionResult(Integer.parseInt(values.get(0)) * Integer.parseInt(values.get(1)));
        if (expressionOperator.equals("/")){
            if (values.get(1).equals("0"))
                throw new RuntimeException("Is not possible to divide by 0");
            else
                result.setExpressionResult(Integer.parseInt(values.get(0)) / Integer.parseInt(values.get(1)));
        }
    }

    public static void calculateDouble(List<String> values, String expressionOperator, Result result, int i) {
        if (expressionOperator.equals("+"))
            result.setExpressionResult(Double.parseDouble(values.get(0)) + Double.parseDouble(values.get(1)));
        if (expressionOperator.equals("-"))
            result.setExpressionResult(Double.parseDouble(values.get(0)) - Double.parseDouble(values.get(1)));
        if (expressionOperator.equals("*"))
            result.setExpressionResult(Double.parseDouble(values.get(0)) * Double.parseDouble(values.get(1)));
        if (expressionOperator.equals("/")){
            if (values.get(1).equals("0"))
                throw new RuntimeException("Is not possible to divide by 0");
            else
                result.setExpressionResult(Double.parseDouble(values.get(0)) / Double.parseDouble(values.get(1)));
        }
    }
}
