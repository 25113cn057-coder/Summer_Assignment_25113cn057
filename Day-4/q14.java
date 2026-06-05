import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.println("The " + n + "th Fibonacci term is: " + findNthFibonacci(n));
        scanner.close();
    }

    public static long findNthFibonacci(int n) {
        
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long first = 0;
        long second = 1;
        long nthTerm = 0;

        for (int i = 2; i <= n; i++) {
            nthTerm = first + second;
            first = second;
            second = nthTerm;
        }

        return nthTerm;
    }
}

