package ExpressionTest;

import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExpressionLexer;
import antlr.ExpressionParser;

public class ExpressionTest {

    public void test(InputStream is) throws Exception {

        // ANTLR input stream
        CharStream charStream = CharStreams.fromStream(is);

        // ANTLR token stream
        ExpressionLexer lexer = new ExpressionLexer(charStream);

        // ANTLR parser
        ExpressionParser parser = new ExpressionParser(new CommonTokenStream(lexer));

        // parse
        ParseTree tree = parser.program();

        // print tree
        System.out.println(tree.toStringTree(parser));
    }
}
