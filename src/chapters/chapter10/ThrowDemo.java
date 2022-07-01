package chapters.chapter10;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw  new NullPointerException("demo");

        }catch (NullPointerException e) {
            System.out.println("Բացառությունը հայտնաբերված է demoproc մեթոդի մեջ");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("կրկնակի հայտնաբերում  " + e);
        }
    }
}
