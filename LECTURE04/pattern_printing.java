package LECTURE04;

public class pattern_printing {
    public static void main(String[] args) {
        //printing square
        System.out.println("Print Square");
        int n=4;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print("* ");  
        System.out.println();
        }
        //printing right facing triangle
        System.out.println();
        System.out.println("Print Right facing triangle");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");  
        System.out.println();
         }
         //printing left facing triangle
         System.out.println();
         System.out.println("Print left facing triangle");
         for(int i=1;i<=n;i++){
            //printing space
            for(int k=1;k<=(n-i);k++)
                System.out.print("  ");
            //printing star
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();      

         }
        System.out.println();
        System.out.println("Print inverted Right facing triangle");
        System.out.println();
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");  
        System.out.println();
         }
         //inverted left facing triangle
         System.out.println();
         System.out.println("Print inverted left facing triangle");
         for(int i=n;i>=1;i--){
            //printing space
            for(int k=1;k<=(n-i);k++)
                System.out.print("  ");
            //printing star
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();  
         }
         // question1
         for(int i=n;i>=1;i--){
            //printing space
            for(int k=1;k<=2*(n-i);k++)
                System.out.print("   ");
            //printing star
            for(int j=1;j<=i;j++)
                
                System.out.print("* ");
            System.out.println();  
         }
        }
}