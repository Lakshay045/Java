// Wap to accept n numbers in an array now enter a number and search whether the number is present or not in the list of array elements by linear search .



import java.util.Scanner;

public class LinSearch
{
    public static void main(String args[])
    {
        boolean found = false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number of Elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " Elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element to Search: ");
        int search = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == search)
            {
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println("Number is present in the array.");
        }
        else
        {
            System.out.println("Number is not present in the array.");
        }

        sc.close();
    }
}







    


