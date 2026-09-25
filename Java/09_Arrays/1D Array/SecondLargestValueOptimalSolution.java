public class SecondLargestValueOptimalSolution {

    public static void main(String args[]) {

        int arr[] = {23, 45, 26, 22, 5};

        // Find Largest and Second Largest

        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

       
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {

                slargest = largest;
                largest = arr[i];

            } else if (arr[i] < largest && arr[i] > slargest) {

                slargest = arr[i];
            }
        }

        System.out.println("The largest element is: " + largest);
        System.out.println("The Second largest element is: " + slargest);
    }
}