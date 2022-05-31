package chapters.chapter5.whileFor;

public class IsPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 13;
        if (num < 2) {
            isPrime = false;
        } else isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Պարզ Թիվ");
        else System.out.println("Բարդ թիվ");

    }
}
