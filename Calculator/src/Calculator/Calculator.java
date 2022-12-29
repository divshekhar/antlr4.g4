package Calculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.CalculatorLexer;
import antlr.CalculatorParser;

public class Calculator {
    public void calc(String fileName) throws Exception {
        CharStream input = CharStreams.fromFileName(fileName);

        // Create lexer object
        CalculatorLexer lexer = new CalculatorLexer(input);

        // Create parser object
        CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));

        // Parse tree
        ParseTree tree = parser.program();

        // Create visitor object
        EvaluateCalculator eval = new EvaluateCalculator();
        eval.visit(tree);
    }
}
