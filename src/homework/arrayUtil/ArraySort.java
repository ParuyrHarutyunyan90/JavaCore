package homework.arrayUtil;

public class ArraySort {
    public static void main(String[] args) {
        //Նվազող Մասիվ
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int a;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] < numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();

        // Աճող Մասիվ
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;

                }

            }
            System.out.print(numbers[i] + "  ");
        }


    }
}
