package homework.arrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        int array[] = {10, 13, 99, 6, 54, 71, 33, 21, 69, 126};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }



        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];


        }
        System.out.print(max);



        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];


        }
        System.out.print(min);



        for (int i = 0; i < array.length; i++) {
            int x = array[i] % 2;
            if (x == 0)
                System.out.print(array[i] + " ");
        }



        for (int i = 0; i < array.length; i++) {
            int x = array[i] % 2;
            if (x != 0)
                System.out.print(array[i] + " ");

        }



        int k = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0)
                k++;


        }
        System.out.println(k);



        int z = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                z++;
        }
        System.out.println(z);



        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);



        double sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        double j = sum2 / array.length;
        System.out.print(j);


    }
}


