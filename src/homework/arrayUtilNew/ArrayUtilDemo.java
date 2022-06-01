package homework.arrayUtilNew;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,1,9,6};
        ArrayUtil au = new ArrayUtil();
        System.out.println(au.max(numbers));
        System.out.println(au.min(numbers));
        au.evenNumbers(numbers);
        System.out.println();
        au.oddNumbers(numbers);
        System.out.println();
        System.out.println(au.oddSum(numbers));
        System.out.println(au.evenSum(numbers));
        System.out.println(au.sum(numbers));
        System.out.println(au.average(numbers));
        au.arraySort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
}
