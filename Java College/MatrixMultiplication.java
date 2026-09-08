// Wap to read two matrices of size m by n . Perform Multiplication operation.


import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int result[][] = new int[2][2];

        System.out.println("Enter elements of first matrix:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        // Multiplication
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                result[i][j] = 0;

                for(int k = 0; k < 2; k++)
                {
                    result[i][j] = result[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result Matrix:");

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
} 
