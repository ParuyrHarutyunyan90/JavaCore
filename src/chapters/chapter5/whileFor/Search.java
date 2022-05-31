package chapters.chapter5.whileFor;

public class Search {
    public static void main(String[] args) {
        int[] nums = {4, 16, 5, 21, 7, 36, 8, 14};
        int val = 5;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Գտնված է ");
        }
    }
}
