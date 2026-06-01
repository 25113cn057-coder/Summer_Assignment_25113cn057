import java.util.Scanner;
public class q6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a;
        double b=0;
        
        while(n!=0){
            a=n%10;
            b=b*10+a;
            n=n/10;
        }
        System.out.printf("the reversed digit is : %f",b);
        sc.close();

    }
    
}
