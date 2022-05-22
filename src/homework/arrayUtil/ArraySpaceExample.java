package homework.arrayUtil;

public class ArraySpaceExample {
    public static void main(String[] args) {

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int x = 0;
        int y = 0;
        for (int i = 0; i < spaceArray.length; i++) {

            if (spaceArray[i] == ' ') {
                x++;
            } else break;
        }

        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] == ' ') {
                y++;
            } else break;

        }
        int k = x + y;
        char[] result = new char[spaceArray.length - k];
        for (int i = 0; i < result.length; i++) {
            result[i] = spaceArray[i + x];
            System.out.print(result[i]);

        }


    }

}



