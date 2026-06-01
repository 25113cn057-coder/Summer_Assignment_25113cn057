import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = n;
        int b = 0;

        while (n != 0) {
            int digit = n % 10;
            b = b * 10 + digit;
            n = n / 10;
        }

        if (a == b) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}