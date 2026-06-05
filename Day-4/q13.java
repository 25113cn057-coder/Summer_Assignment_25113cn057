

import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        
        int first = 0;
        int second = 1;
        
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            
            
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        
        sc.close();
    }
}
