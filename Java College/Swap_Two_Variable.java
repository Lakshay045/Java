// WAP to swap two number without using third variable in the java 

public class Swap_Two_Variable {

    public static void main(String args []){

        int a = 2 ;
        int b = 3 ;

        a = a + b ;
        b = a - b ; 
        a = a - b ;

        System.out.println(a);
        System.out.println(b);
    }
}