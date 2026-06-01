import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int p=1;
        while(n!=0){
            a=n%10;
            p=p*a;
            n=n/10;
        }
        System.out.printf("the product of digits is : %d",p);
    }
    
}
