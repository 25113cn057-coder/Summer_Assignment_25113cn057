import java.util.Scanner;
public class q9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=2;
        boolean prime = true;
        if(n<=1){
            prime = false;
        }
        while(a<n){
            if (n%a==0){
            prime=false;
            break;     
            }
                a++;
        }
        if (prime){
            System.out.println("n is a prime number ");
        }
        else{
            System.out.println("n is not a prime number ");
        }

    }
    
}
