public class InvertedPyramid {
    



    public static void main(String args[]) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            // Spaces
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }

            // Stars
            for (int col = 1; col <= 2*n - row -(row- 1); col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}