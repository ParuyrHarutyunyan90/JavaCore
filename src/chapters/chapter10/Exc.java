package chapters.chapter10;

public class Exc {

    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
        } catch (ArithmeticException e) {
            System.out.println("թիվը չի բաժանվում 0 -ի");
        }
        System.out.println("catch -ից հետո");
    }
}
