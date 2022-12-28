import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ExpressionTest {

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];

        // create input stream from file
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

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
