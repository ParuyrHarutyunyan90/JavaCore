package chapters.chapter7.staticUse;

public class StaticByName {
    public static void main(String[] args) {
        StaticDemo.callMe();
        System.out.println("b = " + StaticDemo.b);
    }
}
