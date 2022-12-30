import TranslateToInterface.TranslateToInterface;

public class App {
    public static void main(String[] args) throws Exception {
        TranslateToInterface translator = new TranslateToInterface();

        String fileName = null;
        if (args.length > 0) {
            fileName = args[0];
        }

        translator.translate(fileName);
    }
}