import java.io.FileInputStream;
import java.io.InputStream;

import ExpressionTest.ExpressionTest;

public class App {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];

        // create input stream from file
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        // test
        ExpressionTest et = new ExpressionTest();
        et.test(is);
    }
}
