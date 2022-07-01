package chapters.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {

        try {
            int a = args.length;
            int d = 42 / a;
            int[] c = {1};
            c[42] = 99;


        } catch (ArithmeticException e) {
            System.out.println("թիվը չի բաժանվում 0 -ի" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("սղալ ինդեքս " + e);
        }
        System.out.println("catch -ից հետո");
    }
}
