package homework.arrayUtilNew;

public class ArrayUtil {
    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void evenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i] % 2;
            if (x == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void oddNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int x = array[i] % 2;
            if (x != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    int oddSum(int[] array) {
        int oddSum = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                oddSum++;
            }

        }
        return oddSum;
    }

    int evenSum(int[] array) {
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenSum++;
            }
        }
        return evenSum;
    }

    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }

    int[] arraySort(int[] numbers) {
        int a;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] < numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }

        }
        return numbers;
    }
}