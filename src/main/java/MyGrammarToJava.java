import Utils.Utils;
import gen.GrammarParser;
import gen.GrammarVisitor;
import model.OutputJava;
import model.Result;
import model.Variables;
import model.WrittenVariables;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MyGrammarToJava extends AbstractParseTreeVisitor<Result> implements GrammarVisitor<Result> {
    public Variables variables = new Variables();
    public Result result = new Result();
    public WrittenVariables writtenVariables = new WrittenVariables();
    public OutputJava outputJava = new OutputJava();

    @Override
    public Result visitProgram(GrammarParser.ProgramContext ctx) {
        try {
            outputJava.startClass();
            boolean hasWrite = ctx.statement().stream().anyMatch(statementContext -> statementContext.writeStatement() != null);
            if (hasWrite)
                outputJava.openWrite();
            ctx.statement().forEach(this::visitStatement);
            if (hasWrite)
                outputJava.closeWrite();
            outputJava.endClass();
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Result visitStatement(GrammarParser.StatementContext ctx)  {
        try{
            if (ctx.assignment() != null) {
                return visitAssignment(ctx.assignment());
            }else if (ctx.variableAssignment() != null) {
                return visitVariableAssignment(ctx.variableAssignment());
            } else if (ctx.ifStatement() != null) {
                return visitIfStatement(ctx.ifStatement());
            } else if (ctx.printStatement() != null) {
                return visitPrintStatement(ctx.printStatement());
            }else if (ctx.writeStatement() != null) {
                return visitWriteStatement(ctx.writeStatement());
            } else if (ctx.whileLoop() != null) {
                return visitWhileLoop(ctx.whileLoop());
            } else if (ctx.doWhileLoop() != null) {
                return visitDoWhileLoop(ctx.doWhileLoop());
            } else if (ctx.caculatorStatement() != null) {
                return visitCaculatorStatement(ctx.caculatorStatement());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Result visitVar(GrammarParser.VarContext ctx) {
        if (ctx == null)
            return null;

        String type = writtenVariables.findWrittenType(ctx);
        String value = ctx.getText();
        writtenVariables.addWrittenType(value, type);
        return null;
    }

    @Override
    public Result visitOperators(GrammarParser.OperatorsContext ctx) {
        result.setExpressionOperator(ctx.getText());
        return null;
    }

    @Override
    public Result visitCompare(GrammarParser.CompareContext ctx) {
        return null;
    }

    @Override
    public Result visitIfBlock(GrammarParser.IfBlockContext ctx) {
        return null;
    }

    @Override
    public Result visitElseBlock(GrammarParser.ElseBlockContext ctx) {
        return null;
    }

    @Override
    public Result visitStatementEnd(GrammarParser.StatementEndContext ctx) {
        return null;
    }

    @Override
    public Result visitAssignment(GrammarParser.AssignmentContext ctx) throws IOException {
        String type = ctx.TYPE().getText();
        String varName = ctx.ID().getText();
        variables.verifyDoesExist(varName, ctx.getStart().getLine());
        visitExpression(ctx.expression());
        variables.verifyExpression(type, ctx.expression().var(), writtenVariables);
        variables.addType(varName, type);
        variables.addVariable(varName, result.getExpressionResult());
        outputJava.declareVariable(variables, varName, ctx.expression());
        return null;
    }

    @Override
    public Result visitVariableAssignment(GrammarParser.VariableAssignmentContext ctx) throws IOException {
        visitExpression(ctx.expression());
        variables.verifyDoesNotExist(ctx.ID().getText(), ctx.getStart().getLine());
        variables.addVariable(ctx.ID().getText(), result.getExpressionResult());
        outputJava.updateVariable(ctx.ID().getText(), ctx.expression());
        return null;
    }

    @Override
    public Result visitExpression(GrammarParser.ExpressionContext ctx) {
        ctx.var().forEach(this::visitVar);
        if (ctx.var().size() > 1 || ctx.ID().size() > 1){
            visitOperators(ctx.operators().get(0));
            if (!ctx.var().isEmpty()){
                result.getValueFromExpression(ctx.var(), writtenVariables);
            }else {
                result.getValueFromExpression(ctx.ID(), variables, ctx.getStart().getLine());
            }
        } else {
            result.getValueFromExpression(ctx, ctx.getStart().getLine(), writtenVariables, variables);
        }

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
    public Result visitPrintStatement(GrammarParser.PrintStatementContext ctx) throws IOException {
        visitExpression(ctx.expression());
        outputJava.print(ctx.expression());
        return null;
    }

    @Override
    public Result visitWriteStatement(GrammarParser.WriteStatementContext ctx) throws IOException {
        variables.verifyDoesExist(ctx.ID().getText(), ctx.getStart().getLine());
        outputJava.receiveScan(ctx, ctx.TYPE().getText());
        return null;
    }

    @Override
    public Result visitIfStatement(GrammarParser.IfStatementContext ctx) throws IOException {
        visitCondition(ctx.ifBlock().condition());

        outputJava.openIfMethod(ctx);
        outputJava.addTab();
        ctx.ifBlock().statement().forEach(this::visitStatement);
        outputJava.subtractTab();
        outputJava.closeIfMethod(ctx);

        if (ctx.elseBlock().ELSE() != null){
            outputJava.openElseMethod(ctx);
            outputJava.addTab();
            ctx.elseBlock().statement().forEach(this::visitStatement);
            outputJava.subtractTab();
            outputJava.closeMethod();
        }

        return null;
    }

    @Override
    public Result visitWhileLoop(GrammarParser.WhileLoopContext ctx) throws IOException {
        visitCondition(ctx.condition());
        outputJava.openWhileloop(ctx);
        outputJava.addTab();
        ctx.statement().forEach(this::visitStatement);
        outputJava.subtractTab();
        outputJava.closeMethod();

        return null;
    }

    @Override
    public Result visitDoWhileLoop(GrammarParser.DoWhileLoopContext ctx) throws IOException {
        outputJava.openDoWhileLoop();
        outputJava.addTab();
        ctx.statement().forEach(this::visitStatement);
        visitCondition(ctx.condition());
        outputJava.subtractTab();
        outputJava.closeDoWhileLoop(ctx);
        return null;
    }

    @Override
    public Result visitCaculatorStatement(GrammarParser.CaculatorStatementContext ctx) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String exit = "";

        System.out.println("Calculator, please follow the next steps!!");
        do {

            System.out.println("Write the first value: ");
            double var1 = scanner.nextDouble();

            System.out.println("\nWrite the desired operator ('+', '-', '*', '/'): ");
            String operator = scanner.next();

            System.out.println("\nWrite the second value: ");
            double var2 = scanner.nextDouble();

            if (!Arrays.asList("+", "-", "*", "/").contains(operator)){
                throw new RuntimeException("Only the following operators are allowed: '+', '-', '*', '/' ");
            }

            Utils.calculateDouble(Arrays.asList(var1, var2), operator, result);

            System.out.println("\n\nResult: " + result.getExpressionResult());

            System.out.println("Do you want to continue? (y/n)");
            exit = scanner.next();
            System.out.println("\n======================================\n");
        } while (!exit.equals("n"));

        scanner.close();
        return null;
    }
}
