import java.util.Scanner;

public class cal {
    public static void calculator() {
        boolean exit = false;
        while (exit != true) {
            Scanner s = new Scanner(System.in);
            System.out.println("ENTER YOUR FIRST NUMBER");
            int f = s.nextInt();
            System.out.println("ENTER YOUR OPERATOR");
            System.out.println("PRESS 1 FOR ADD PRESS 2 FOR SUBTRACT PRESS 3 FOR MULTIPLY PRESS 4 DEVIDE  0 for exit");
            int sign = s.nextInt();
            System.out.println("ENTER YOUR SECOND NUMBER ");
            int sec = s.nextInt();
            switch (sign) {
                case 1:
                    float ans = f + sec;
                    System.out.println(ans);
                    break;
                case 2:
                    float an = f - sec;
                    System.out.println(an);

                    break;
                case 3:
                    float a = f * sec;
                    System.out.println(a);
                    break;
                case 4:
                    float ansa = f / sec;
                    System.out.println(ansa);
                    break;
                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("error please enter a valid number");
                    break;
            }
        }
    }

    public static void main(String[] agrs) {
        calculator();

    }
}
