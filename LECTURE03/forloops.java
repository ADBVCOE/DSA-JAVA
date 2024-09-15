package LECTURE03;

public class forloops {
    public static void main(String[] args) {
        //wap to print no. between 1 to 10
        for(int i=0;i<=10;i++){
           System.out.println(i);
        }
        //wap to print first n even numbers
        int n=10;
        for(int i=0;i<=n;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        //wap to print sum of first n natural numbers
        int m=10;
        int sum=0;
        for(int i=1;i<=m;i++){
            sum+=i;
        }
        System.out.println(sum);
        //wap to print reverse of n natural no.
        int k=10;
        for(int i=k;i>=1;i--){
            System.out.println(i);
        }
    }
}
