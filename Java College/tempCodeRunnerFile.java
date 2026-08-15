public class typeCasting {

    public static void main(String[] args) {

        // Implicit Type Casting
        
        int price = 100;
        double amount = price;

        System.out.println("Implicit: " + amount);

        // Explicit Type Casting

        double marks = 50.75;
        int result = (int) marks;

        System.out.println("Explicit: " + result);
    }
}