package chapters.chapter8.ExtendsExample;

import chapters.chapter8.ExtendsExample.A;

public class B extends A {
    int k;
    void show () {
        System.out.println("k : " + k);
    }

    void sum () {
        System.out.println("i + j + k : " + (i + j + k));
    }
}
