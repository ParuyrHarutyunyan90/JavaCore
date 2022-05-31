package chapters.chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.heigth = 5;
        mybox1.depth = 10;
        mybox1.width = 15;
        mybox2.width = 3;
        mybox2.depth = 6;
        mybox2.heigth = 9;
        double vol;
        vol = mybox1.volume2();
        System.out.println("Ծավալը հավասար է " + vol);
        vol = mybox2.volume2();
        System.out.println("Ծավալը հավասար է " + vol);
    }
}
