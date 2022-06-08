package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {

        String text = "H[el(lo (from) [java}";

        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }
}
