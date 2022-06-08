package chapters.chapter7.overloLoad;

public class OverLoadDemo {
    public static void main(String[] args) {
        OverLoad overLoad = new OverLoad();
        overLoad.test();
        overLoad.test(10);
        overLoad.test(10,20);
        double result = overLoad.test(123.25);
        System.out.println( "overload.test մեթոդի կանչ։ " + result);
    }
}
