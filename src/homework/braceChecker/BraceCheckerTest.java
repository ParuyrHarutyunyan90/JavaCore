package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        String text = "({}{}{{{";

        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }
}
