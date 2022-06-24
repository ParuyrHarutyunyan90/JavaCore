package chapters.chapter8.ExtendsExample;

import chapters.chapter8.ExtendsExample.A;
import chapters.chapter8.ExtendsExample.B;

public class SimpleInheritance {
    public static void main(String[] args) {

        A superOb = new A();
        A subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        subOb.i = 7;
        subOb.j = 8;
       subOb.show();


    }
}
