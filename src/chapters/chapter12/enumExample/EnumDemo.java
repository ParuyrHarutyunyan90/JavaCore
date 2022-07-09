package chapters.chapter12.enumExample;

import static chapters.chapter12.enumExample.Apple.Jonathan;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("ap : " + ap);
        System.out.println();
        ap = Apple.GoldDel;
        if (ap == Apple.GoldDel) {
            System.out.println("ap պարունակում է " + ap);
        }
        System.out.println();
        switch (ap) {
            case Jonathan :
                System.out.println("Jonathan is red ");
                break;
            case GoldDel:
                System.out.println("Golden Delicious is yellow ");
                break;
            case RedDel:
                System.out.println("Red Delicious is red ");
                break;

        }


    }
}
