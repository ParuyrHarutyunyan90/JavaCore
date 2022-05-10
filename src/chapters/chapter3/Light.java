package chapters.chapter3;

public class Light {
    public static void main(String[] args) {
        int speedml = 18600;
        double speed = 1.67 * speedml;
        long days;
        long seconds;
        double distance;
        speed = 18600;
        days = 1000;
        seconds = days * 60 * 60 * 24;
        distance = speed * seconds;
        System.out.print(days + " օրում");
        System.out.print(" լույսը կանցնի մոտավոր ");
        System.out.println(distance + " կմ");


    }
}
