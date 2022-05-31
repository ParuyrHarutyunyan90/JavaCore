package chapters.chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();
        mybox1.depth = 10;
        mybox1.heigth = 15;
        mybox1.width = 12.54;
        mybox2.width = 3;
        mybox2.depth = 4.53;
        mybox2.heigth = 6;
        mybox1.volume();
        mybox2.volume();
    }
}
