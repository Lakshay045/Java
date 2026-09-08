// Wap to read values in 2d array and print them in matrix form.


import java.util.Scanner;

public class Matrix {

    public static void main(String args[]){

        int arr[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 9 Elements :");

        for(int i = 0 ; i < 3 ; i++){
            for( int j = 0 ; j < 3 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");

          for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
        


    
    }


    
}
