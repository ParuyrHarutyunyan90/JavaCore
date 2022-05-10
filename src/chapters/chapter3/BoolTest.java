package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = true;
        System.out.println("b ն հավասար է " + b);
        b = false;
        System.out.println("b ն հավասար է  " + b);
        if (b) {
            System.out.println("Gugushik");
        }
        b = true;
        if (b) {
            System.out.println("կաշխատի");
        }
        System.out.println("10>9 արտահայտությունը " + (10 > 9) + " Է");

    }
}
