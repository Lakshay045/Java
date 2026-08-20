public class PyramidPattern {

    public static void main(String args[]) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Stars
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}