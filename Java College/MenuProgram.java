import java.util.*;

public class MenuProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        
        System.out.println("Enter 5 numbers : ");
        for(int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        
        System.out.println("Choose an option:");
        System.out.println("1. Smallest");
        System.out.println("2. Largest");
        System.out.println("3. Sum");
        System.out.println("4. Average");

        int choice = input.nextInt();

        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        
        for(int i = 0; i < 5; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
            sum += arr[i];
        }

       
        switch(choice) {
            case 1:
                System.out.println("Smallest = " + min);
                break;

            case 2:
                System.out.println("Largest = " + max);
                break;

            case 3:
                System.out.println("Sum = " + sum);
                break;

            case 4:
                double avg = (double) sum / 5;
                System.out.println("Average = " + avg);
                break;

            
        }
    }
}