import Calculator.Calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            // Take file name from args
            String inputFile = null;
            if (args.length > 0) {
                inputFile = args[0];
            }

            if (inputFile != null) {
                calculator.calc(inputFile);
            } else {
                System.out.println("No input file specified");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
