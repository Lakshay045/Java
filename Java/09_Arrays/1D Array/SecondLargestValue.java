public class SecondLargestValue {

    public static void main(String args[]) {

        int arr[] = {23, 45, 26, 22, 5};

        // First we find Largest one

        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                largest = arr[i];
            }
        }

        // Now We find Second Largest element



        int slargest = Integer.MIN_VALUE;          
        
        // Integer.MIN_VALUE is used because if secondLargest = arr[0] = 5,
        // then 3 can never become secondLargest.
        // MIN_VALUE gives us a value smaller than every int element.
        
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > slargest && arr[i] != largest) {

                slargest = arr[i];
            }
        }

        System.out.println("The largest element is: " + largest);
        System.out.println("The Second largest element is: " + slargest);
    }
}