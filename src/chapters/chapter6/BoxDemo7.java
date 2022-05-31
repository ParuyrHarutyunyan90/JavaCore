package chapters.chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10,12,16);
        Box2 mybox2 = new Box2(3,6,9);
        double vol;
        vol = mybox1.volume();
        System.out.println("Ծավալը հավասար է " + vol);
        vol = mybox2.volume();
        System.out.println("Ծավալը հավասար է " + vol);
        Box2 mybox3 = new Box2();
        System.out.println(mybox3.volume());

    }
}
