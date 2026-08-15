import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double b = sc.nextDouble();

        System.out.print("Enter a float number: ");
        float c = sc.nextFloat();

        System.out.print("Enter a long number: ");
        long d = sc.nextLong();

        System.out.print("Enter true or false: ");
        boolean e = sc.nextBoolean();

        System.out.print("Enter one word: ");
        String word = sc.next();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter a complete sentence: ");
        String sentence = sc.nextLine();

        System.out.println("\n----- INPUT VALUES -----");
        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Float: " + c);
        System.out.println("Long: " + d);
        System.out.println("Boolean: " + e);
        System.out.println("Word: " + word);
        System.out.println("Sentence: " + sentence);

        sc.close();    // For Closing the Scanner
    }
}