package chapters.chapter3;

public class Average2 {
    public static void main(String[] args) {


        int numbers[]=new int[16];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
        numbers[5]=6;
        numbers[6]=7;
        numbers[7]=8;
        int result=0;
        for (int i = 0; i < numbers.length; i++) {
            result=result+numbers[i];

        }
        System.out.println(result/ numbers.length);
    }
}
