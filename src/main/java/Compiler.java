
import gen.GrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.Arrays;

public class Compiler extends BaseErrorListener {
    public static void main(String[] args) throws Exception {
        // Create an ANTLR lexer and parser
        gen.GrammarLexer lexer = new gen.GrammarLexer(CharStreams.fromFileName("src/main/java/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        gen.GrammarParser parser = new gen.GrammarParser(tokens);


        // Attach custom parser listener if needed
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener());

        GrammarParser.ProgramContext tree = parser.program();
        MyGrammarToJava myGrammarToJava = new MyGrammarToJava();
        myGrammarToJava.visitProgram(tree);
        //System.out.println(tree.toStringTree(parser));

        System.out.println("Compilation successful");
    }

static class MyErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            System.err.println("Syntax error at line " + line + ", position " + charPositionInLine + ": " + msg);
        }
}
}

