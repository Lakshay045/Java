import java.util.Scanner;

public class Nested {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {

            System.out.print("Enter your citizenship: ");
            String citizen = sc.next();

            if (citizen.equalsIgnoreCase("Indian")) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible: Citizenship required");
            }

        } else {
            System.out.println("Not eligible: Age must be 18 or above");
        }

        sc.close();
    }
}