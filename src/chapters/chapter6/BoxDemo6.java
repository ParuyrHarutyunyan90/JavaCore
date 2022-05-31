package chapters.chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        vol = mybox1.volume2();
        System.out.println("Ծավալը հավասար է " + vol);
        vol = mybox2.volume2();
        System.out.println("Ծավալը հավասար է " + vol);
    }
}
