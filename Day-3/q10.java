import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int n = a; n <= b; n++) {

            if (n <= 1) {
                continue;
            }

            boolean Prime = true;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    Prime = false;
                    break;
                }
            }

            if (Prime) {
                System.out.println(n);
            }
        }
    }
}
