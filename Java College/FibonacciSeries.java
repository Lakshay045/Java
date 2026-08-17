public class FibonacciSeries {

    // Non-Recursive Method
    static void nonRecursive(int n) {
        int a = 0, b = 1, c;

        System.out.println("Non-Recursive Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    // Recursive Method
    static int recursive(int n) {
        if (n <= 1)
            return n;

        return recursive(n - 1) + recursive(n - 2);
    }

    public static void main(String[] args) {

        int n = 10;

        nonRecursive(n);

        System.out.println("\n\nRecursive Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(recursive(i) + " ");
        }
    }
}