import java.util.Scanner;
public class q5{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int a=0;
        if(n==0){
            a=0;
        }
        else{ 
            while(n!=0){
            a+=n%10;
            n=n/10;
            }
        }
        System.out.printf("the sum of the digits is : %d",a);
        scanner.close();
    }
}