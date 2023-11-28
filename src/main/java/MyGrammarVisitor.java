//import gen.GrammarParser;
//import gen.GrammarVisitor;
//import model.OutputJava;
//import model.Variables;
//import model.Result;
//import model.WrittenVariables;
//import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
//
//import java.io.IOException;
//
//public class MyGrammarVisitor<T> extends AbstractParseTreeVisitor<Result> implements GrammarVisitor<Result> {
//
//    public Variables variables = new Variables();
//    public Result result = new Result();
//    public WrittenVariables writtenVariables = new WrittenVariables();
//    public OutputJava outputJava = new OutputJava();
//
//    @Override
//    public Result visitProgram(GrammarParser.ProgramContext ctx) {
//        try {
//            outputJava.startClass();
//            ctx.statement().forEach(this::visitStatement);
//            outputJava.endClass();
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    @Override
//    public Result visitStatement(GrammarParser.StatementContext ctx)  {
//        try{
//            if (ctx.assignment() != null) {
//                return visitAssignment(ctx.assignment());
//            }else if (ctx.variableAssignment() != null) {
//                return visitVariableAssignment(ctx.variableAssignment());
//            } else if (ctx.ifStatement() != null) {
//                return visitIfStatement(ctx.ifStatement());
//            } else if (ctx.printStatement() != null) {
//                return visitPrintStatement(ctx.printStatement());
//            }else if (ctx.writeStatement() != null) {
//                return visitWriteStatement(ctx.writeStatement());
//            } else if (ctx.whileLoop() != null) {
//                return visitWhileLoop(ctx.whileLoop());
//            } else if (ctx.doWhileLoop() != null) {
//                return visitDoWhileLoop(ctx.doWhileLoop());
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    @Override
//    public Result visitVar(GrammarParser.VarContext ctx) {
//        if (ctx == null)
//            return null;
//
//        String type = writtenVariables.findWrittenType(ctx);
//        String value = ctx.getText();
//        writtenVariables.addWrittenType(value, type);
//        return null;
//    }
//
//    @Override
//    public Result visitOperators(GrammarParser.OperatorsContext ctx) {
//        result.setExpressionOperator(ctx.getText());
//        return null;
//    }
//
//    @Override
//    public Result visitCompare(GrammarParser.CompareContext ctx) {
//        return null;
//    }
//
//    @Override
//    public Result visitIfBlock(GrammarParser.IfBlockContext ctx) {
//        return null;
//    }
//
//    @Override
//    public Result visitElseBlock(GrammarParser.ElseBlockContext ctx) {
//        return null;
//    }
//
//    @Override
//    public Result visitStatementEnd(GrammarParser.StatementEndContext ctx) {
//        return null;
//    }
//
//    @Override
//    public Result visitAssignment(GrammarParser.AssignmentContext ctx) throws IOException {
//        String type = ctx.TYPE().getText();
//        String varName = ctx.ID().getText();
//        variables.verifyDoesExist(varName);
//        visitExpression(ctx.expression());
//        variables.addType(varName, type);
//        variables.addVariable(varName, result.getExpressionResult());
//        outputJava.declareVariable(variables, varName, ctx.expression());
//        return null;
//    }
//
//    @Override
//    public Result visitVariableAssignment(GrammarParser.VariableAssignmentContext ctx) throws IOException {
//        visitExpression(ctx.expression());
//        variables.verifyDoesNotExist(ctx.ID().getText());
//        variables.addVariable(ctx.ID().getText(), result.getExpressionResult());
//        outputJava.updateVariable(ctx.ID().getText(), ctx.expression());
//        return null;
//    }
//
//    @Override
//    public Result visitExpression(GrammarParser.ExpressionContext ctx) {
//        ctx.var().forEach(this::visitVar);
//        if (ctx.var().size() > 1 || ctx.ID().size() > 1){
//            visitOperators(ctx.operators().get(0));
//            if (!ctx.var().isEmpty()){
//                result.getValueFromExpression(ctx.var(), writtenVariables);
//            }else {
//                result.getValueFromExpression(ctx.ID(), variables);
//            }
//        } else {
//            result.getValueFromExpression(ctx, ctx.getStart().getLine(), writtenVariables, variables);
//        }
//
//        return null;
//    }
//
//    @Override
//    public Result visitCondition(GrammarParser.ConditionContext ctx) {
//        String compare = ctx.compare().getText();
//
//        if (ctx.ID().isEmpty()){
//            ctx.var().forEach(this::visitVar);
//            writtenVariables.compareVariables(ctx, compare, result);
//        } else {
//            variables.compareVariables(ctx, compare, result);
//        }
//
//        return null;
//    }
//
//    @Override
//    public Result visitPrintStatement(GrammarParser.PrintStatementContext ctx) {
//        visitExpression(ctx.expression());
//        System.out.println(String.valueOf(result.getExpressionResult()).replace("\"", ""));
//        return null;
//    }
//
//    @Override
//    public Result visitWriteStatement(GrammarParser.WriteStatementContext ctx) {
//        return null;
//    }
//
//    @Override
//    public Result visitIfStatement(GrammarParser.IfStatementContext ctx) throws IOException {
////        visitCondition(ctx.ifBlock().condition());
////        outputJava.openIfMethod(ctx);
////        if (result.isIfCondition(ctx.ifBlock().statement(0), outputJava, false)){
////
////            visitStatement(ctx.statement(0));
////        }
////        outputJava.closeIfMethod(ctx);
////        if (ctx.ELSE() != null){
////            outputJava.openElseMethod(ctx);
////            if (!result.isIfCondition(ctx.statement(1), outputJava, true))
////                visitStatement(ctx.statement(1));
////            outputJava.closeElseMethod(ctx);
////        }
//
//        return null;
//    }
//
//    @Override
//    public Result visitWhileLoop(GrammarParser.WhileLoopContext ctx) throws IOException {
////        visitCondition(ctx.condition());
////        while (result.isIfCondition(ctx.statement(), outputJava, false)){
////            visitStatement(ctx.statement());
////            visitCondition(ctx.condition());
////        }
//        return null;
//    }
//
//    @Override
//    public Result visitDoWhileLoop(GrammarParser.DoWhileLoopContext ctx) throws IOException {
////        do {
////            visitStatement(ctx.statement());
////            visitCondition(ctx.condition());
////        } while (result.isIfCondition(ctx.statement(), outputJava, false));
//        return null;
//    }
//}
