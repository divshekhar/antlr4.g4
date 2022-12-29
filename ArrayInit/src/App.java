import Translate.Translate;

public class App {
    public static void main(String[] args) {
        Translate translate = new Translate();
        try {
            translate.translate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
