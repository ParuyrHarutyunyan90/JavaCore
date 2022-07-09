package chapters.chapter12.enumExample;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.print("Apple տիպի հաստատուններն են ։ ");
        Apple allApples[] = Apple.values();
        for (Apple a : allApples) {
            System.out.print(a + ", ");
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println(ap);
    }
}
