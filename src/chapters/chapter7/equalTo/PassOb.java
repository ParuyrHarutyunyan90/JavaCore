package chapters.chapter7.equalTo;

public class PassOb {
    public static void main(String[] args) {
        Test ob = new Test(100, 50);
        Test ob2 = new Test(100, 50);
        Test ob3 = new Test(-1, -1);
        System.out.println("ob == ob2: " + ob.equalTo(ob2));
        System.out.print("ob == ob3: " + ob.equalTo(ob3));
    }
}
