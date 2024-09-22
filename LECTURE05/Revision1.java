package LECTURE05;
import java.util.Scanner;
public class Revision1 {
    static boolean armstrong(int n){
        
        int len =0;
        int temp=n;

        while(temp!=0){
            temp/=10;
            len++;
        }
        int sum=0;
        temp=n;
        while(temp!=0){
            sum+=(int)Math.pow(temp%10,len);
            temp/=10;
        }
        System.out.println("The given no. is armstrong");
        return(sum==n);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. you want to check wheather armstrong or not:");
        int n=sc.nextInt();
        System.out.println(armstrong(n));
    }

}
