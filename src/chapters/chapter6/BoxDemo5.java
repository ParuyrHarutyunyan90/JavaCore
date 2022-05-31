package chapters.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.setDim(10, 12, 14);
        mybox2.setDim(3, 6, 9);
        vol = mybox1.volume2();
        System.out.println("Ծավալը հավասար է " + vol);
        vol = mybox2.volume2();
        System.out.println("Ծավալը հավասար է " + vol);
    }
}
