package Translate;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import antlr.ArrayInitLexer;
import antlr.ArrayInitParser;

public class Translate {
    public void translate() throws Exception {
        // create a CharStream that reads from standard input
        // CharStream input = CharStreams.fromFileName("../ArrayInit.txt");
        CharStream input = CharStreams.fromStream(System.in);

        // create a lexer that feeds off of input CharStream
        ArrayInitLexer lexer = new ArrayInitLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        ArrayInitParser parser = new ArrayInitParser(tokens);

        // begin parsing at init rule
        ParseTree tree = parser.init();

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();

        ShortToUnicodeString listener = new ShortToUnicodeString();

        // Walk the tree created during the parse, trigger callbacks
        walker.walk(listener, tree);
        System.out.println();
    }
}
