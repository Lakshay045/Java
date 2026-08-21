public class Rhombus {

    public static void main(String args[]) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Stars
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}