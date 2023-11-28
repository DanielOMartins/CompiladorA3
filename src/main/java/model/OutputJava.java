package model;

import gen.GrammarParser;
import model.Variables;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputJava {
    private BufferedWriter writer;
    private int count = 0;

    public String getTab() {
        String tab = "";
        for (int i = 0; i < count; i++) {
            tab = tab.concat("    ");
        }
        return tab;
    }

    public void addTab(){
        this.count++;
    }

    public void subtractTab(){
        this.count--;
    }

    public OutputJava(){
        try {
            this.writer = new BufferedWriter(new FileWriter("src/main/java/Output.java"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startClass() throws IOException {
        writer.write("public class Output {\n");
        writer.write("    public static void main(String[] args) {\n");
    }

    public void endClass() throws IOException{
        writer.write("    }\n");
        writer.write("}\n");
        writer.close();
    }

    public void declareVariable(Variables variables, String varName, GrammarParser.ExpressionContext expression) throws IOException {
        writer.write(getTab() + "         " + variables.getType(varName) + " " + varName + " = " + expression.getText() + ";\n");
    }

    public void updateVariable(String varName, GrammarParser.ExpressionContext expression) throws IOException {
        writer.write(getTab() + "         " + varName + " = " + expression.getText() + ";\n");
    }

    public void openIfMethod(GrammarParser.IfStatementContext ctx) throws IOException {
        writer.write(getTab() + "         if(" + ctx.ifBlock().condition().getText() + "){\n");
    }

    public void closeIfMethod(GrammarParser.IfStatementContext ctx) throws IOException {
        writer.write(getTab() + "         }\n");
    }

    public void openElseMethod(GrammarParser.IfStatementContext ctx) throws IOException {
        writer.write(getTab() + "         else{\n");
    }

    public void closeMethod() throws IOException {
        writer.write(getTab() + "         }\n");
    }

    public void inside(GrammarParser.StatementContext statement) throws IOException {
        writer.write(getTab() + "             " + statement.getText() + "\n");
    }

    public void print(GrammarParser.ExpressionContext expression) throws IOException {
        writer.write(getTab() + "         System.out.println(" + expression.getText() + ");\n");
    }

    public void openWhileloop(GrammarParser.WhileLoopContext ctx) throws IOException {
        writer.write(getTab() + "         while(" + ctx.condition().getText() + "){\n");
    }

    public void openDoWhileLoop() throws IOException {
        writer.write(getTab() + "          do{\n");
    }

    public void closeDoWhileLoop(GrammarParser.DoWhileLoopContext ctx) throws IOException {
        writer.write(getTab() + "          } while(" + ctx.condition().getText() + ");\n");
    }

    public void receiveScan(GrammarParser.WriteStatementContext ctx, String type) throws IOException {
        if (type.equals("String")){
            writer.write(getTab() + "          " + ctx.TYPE().getText() + " " + ctx.ID().getText() + " = scanner.next();\n");
        }
        if (type.equals("int")){
            writer.write(getTab() + "          " + ctx.TYPE().getText() + " " + ctx.ID().getText() + " = scanner.nextInt();\n");
        }
        if (type.equals("double")){
            writer.write(getTab() + "          " + ctx.TYPE().getText() + " " + ctx.ID().getText() + " = scanner.nextDouble();\n");
        }
    }

    public void openWrite() throws IOException {
        writer.write("         java.util.Scanner scanner = new java.util.Scanner(System.in);\n\n");
    }

    public void closeWrite() throws IOException {
        writer.write("          scanner.close();\n");
    }
}
