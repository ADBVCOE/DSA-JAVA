package LECTURE04;

public class ppquestion {
    public static void main(String[] args) {
        System.out.println("Print Square");
        int n=4;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                } 
                System.out.println();
        }
    }
    
}
