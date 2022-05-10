package chapters.chapter3;

public class TwoDArray {
    public static void main(String[] args) {

        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
               k= k+4;

            }
        for (i = 0; i < twoD.length; i++) {
            for (j = 0; j < 5; j++)
            System.out.print(twoD[i][j] + " ");
            System.out.println();


        }
        System.out.println(twoD[2].length);
    }

}

