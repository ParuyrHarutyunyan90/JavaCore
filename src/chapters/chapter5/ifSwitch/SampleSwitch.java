package chapters.chapter5.ifSwitch;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("I Հավասար է 0-ի");
                    break;
                case 1:
                    System.out.println("I Հավասար է 1-ի");
                    break;
                case 2:
                    System.out.println("I Հավասար է 2-ի");
                    break;
                case 3:
                    System.out.println("I Հավասար է 3-ի");
                    break;
                default:
                    System.out.println("I մեծ է 3-ից");

            }

        }
    }
}
