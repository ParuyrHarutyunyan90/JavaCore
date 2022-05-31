package chapters.chapter6;

public class BoxDemo {
    public static void main(String[] args) {

        Box mybox = new Box();
        double vol;
        mybox.depth = 15;
        mybox.heigth = 20;
        mybox.width = 25;
        vol = mybox.depth * mybox.heigth * mybox.width;
        System.out.println("ծավալը հավասար է " + vol);
    }
}
