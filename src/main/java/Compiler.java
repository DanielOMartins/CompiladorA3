
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Arrays;

public class Compiler extends BaseErrorListener {
    public static void main(String[] args) throws Exception {
        // Create an ANTLR lexer and parser
        gen.GrammarLexer lexer = new gen.GrammarLexer(CharStreams.fromFileName("src/main/java/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        gen.GrammarParser parser = new gen.GrammarParser(tokens);

        // Attach custom error listener if needed
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener());

        // Start the parsing process
        ParseTree tree = parser.program();// 'program' is the top-level rule

        Arrays.stream(parser.getRuleNames()).forEach(System.out::println);


        // Optionally, print the parse tree for debugging
        System.out.println(tree.toStringTree(parser));

        // Perform additional processing, such as semantic analysis and code generation
        // ...

        // Optionally, generate and execute the code
        // ...

        System.out.println("Compilation successful");
    }

static class MyErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            System.err.println("Syntax error at line " + line + ", position " + charPositionInLine + ": " + msg);
        }
    }
}

