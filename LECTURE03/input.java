package LECTURE03;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. you want to check wheather prime or not:");
        int n=sc.nextInt();
        boolean b= true;
        for(int i=2;i<n;i++){
        if (n%i==0){
            b= false;
            break;
        } 
        }
        if(b==true){
            System.out.println("number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }

    }
    
}
