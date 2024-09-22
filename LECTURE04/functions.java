package LECTURE04;

public class functions {
    static void printsquare(int n){
         n=4;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print("*");  
        System.out.println();
    }
    }
    //public static void main(String[] args) {
        //int n=4;
        //printsquare(5);
    //}

    static void printLFT(int n){
        for (int i=1;i<=n;i++) {
            //printing space
            for(int k=1;k<=(n-i);k++)
                System.out.print(" ");
            //printing star
            for(int j=1;j<=i;j++);
                System.out.print(" * ");
             System.out.println(); 
        }
    }
    public static void main(String[] args) {
        int a=4;
        printLFT(a);
        }
     
}
