package chapters.chapter8.figureExtends;

public class FindsArea {
    public static void main(String[] args) {

        Figure f = new Figure(10, 5);
        Rectangle r = new Rectangle(10, 12);
        Triangle t = new Triangle(10, 8);
        Figure figuref;
        figuref = f;
        System.out.println(figuref.area());
        figuref = r;
        System.out.println(figuref.area());
        figuref = t;
        System.out.println(figuref.area());
    }
}
