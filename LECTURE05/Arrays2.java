package LECTURE05;

public class Arrays2 {
    public static void main(String[] args) {
        
        int[] arr=new int[4];
        int[] nums={1,2,3};
        arr[0]=1;
        System.out.println(arr);
        arr=nums;
        System.out.println(arr);
        System.out.println(nums);
        for(int i:arr)
        System.out.print(" "+i);

    }
    
}
