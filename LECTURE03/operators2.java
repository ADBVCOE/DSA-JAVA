package LECTURE03;

public class operators2 {
    public static void main(String[] args) {
        int a=13;
        int b=12;
        if (a>=b) {
            System.out.println("a is gretaer than b");
        };
        if (a<=b) {
            System.out.println("b is gretaer than b");
        };
        //Bitwise operators
        System.out.println(a|b);  //or
        System.out.println(a&b);  //and
        System.out.println(a^b);  //xor
        System.out.println(~a);  //complimentry-(n+1)
        System.out.println(a<<5);  //left shift by 5   
        System.out.println(a>>5); //right shift by 5  
        

    }
    


    
}
