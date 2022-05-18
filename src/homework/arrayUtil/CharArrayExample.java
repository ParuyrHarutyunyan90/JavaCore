package homework.arrayUtil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c)
                a++;
        }
        System.out.print("c փոփոխականի քանակը հավասար է " + a);
        System.out.println();

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.print("Մեջտեղի 2 էլեմենտներն են։ " + chars2[chars2.length / 2 - 1] + " " + chars2[chars2.length / 2]);
        System.out.println();


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char ch1, ch2;
        ch1 = 'l';
        ch2 = 'y';
        if (chars3[chars3.length - 2] == ch1 && chars3[chars3.length - 1] == ch2)
            System.out.print("true");
        else System.out.print("false");
        System.out.println();


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a',};
        char b = 'b';
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == b && bobArray[i + 2] == b)
                System.out.println("true");
        }


        char[] text = {' ', 'b', 'a', 'r', 'e', 'v', ' '};

        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ')
                System.out.print(text[i]);
        }


    }
}
