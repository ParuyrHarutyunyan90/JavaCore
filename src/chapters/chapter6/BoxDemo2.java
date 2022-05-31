package chapters.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        mybox1.width = 10;
        mybox1.heigth = 15;
        mybox1.depth = 20;
        mybox2.depth = 5;
        mybox2.width = 10;
        mybox2.heigth = 15;
        vol = mybox1.depth * mybox1.heigth * mybox1.width;
        System.out.println("mybox1 ի ծավալը հավասար է " + vol);
        vol = mybox2.depth * mybox2.width * mybox2.heigth;
        System.out.println("mybox2 ի ծավալը հավասար է "+ vol);
    }
}
