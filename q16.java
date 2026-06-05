import java.util.Scanner;
public class q16 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter lower bound: ");
        int lower = scanner.nextInt();
        
        System.out.print("Enter upper bound: ");
        int upper = scanner.nextInt();
        
        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        
        
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }

    
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        
       
        int digits = String.valueOf(num).length();
        
       
        while (num > 0) {
            int remainder = num % 10;
            sum += Math.pow(remainder, digits);
            num = num / 10;
        }
        
        return sum == originalNum;
    }
}

    

