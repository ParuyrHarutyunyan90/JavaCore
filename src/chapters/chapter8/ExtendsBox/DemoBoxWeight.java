package chapters.chapter8.ExtendsBox;

public class DemoBoxWeight {
    public static void main(String[] args) {

        BoxWeight mybox1 = new BoxWeight(3,4,5,4.5);
        BoxWeight mybox2 = new BoxWeight(2,3,4,1.5);
        double vol;
        vol = mybox1.volume();
        System.out.println("mybox1 ծավալը : " + vol);
        System.out.println("mybox1 քաշը ։ " + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("mybox2 ծավալը : " + vol);
        System.out.println("mybox2 քաշը ։ " + mybox2.weight);
    }
}
