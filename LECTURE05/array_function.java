package LECTURE05;

public class array_function {
    static void display(int[]arr){
        int k=arr.length;
        for(int i=0;i<k;i++)
        System.out.print(" "+arr[i]);

    }
    public static void main(String[] args) {
        int[] n={1,2,3,4,5};
        display(n);
    }
}
