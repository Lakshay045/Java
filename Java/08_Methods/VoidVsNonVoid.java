public class VoidVsNonVoid {

    // VOID METHOD
    // Does not return any value
    static void operations(int a, int b) {

        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
    }


    // NON-VOID METHOD
    // Returns an int value
    static int add(int a, int b) {

        int sum = a + b;

        return sum;
    }


    public static void main(String args[]) {

        // Calling void method
        operations(10, 5);


        // Calling non-void method
        int result = add(10, 5);

        System.out.println("Returned Value : " + result);
    }
}