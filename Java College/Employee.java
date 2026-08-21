// Create a Class named Employee with Data Members Employee ID , Name , Age, Salary (Basic Salary).
// Write a Function to Calculate Gross Salary and Display Employee Details. Create Two Objects. 

import java.util.Scanner;

public class Employee {

    int employeeID;
    String name;
    int age;
    double salary;

    Employee(int id, String n, int a, double s) {

        employeeID = id;
        name = n;
        age = a;
        salary = s;
    }

    double calculateGrossSalary() {

        double HRA = 0.20 * salary;
        double DA = 0.10 * salary;

        return salary + HRA + DA;
    }

    void display() {

        System.out.println("Employee ID : " + employeeID);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Basic Salary : " + salary);
        System.out.println("Gross Salary : " + calculateGrossSalary());
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Details of First Employee:");

        System.out.print("Enter Employee ID: ");
        int id1 = input.nextInt();

        System.out.print("Enter Name: ");
        String name1 = input.next();

        System.out.print("Enter Age: ");
        int age1 = input.nextInt();

        System.out.print("Enter Basic Salary: ");
        double salary1 = input.nextDouble();

        Employee e1 = new Employee(id1, name1, age1, salary1);


        System.out.println("\nEnter Details of Second Employee:");

        System.out.print("Enter Employee ID: ");
        int id2 = input.nextInt();

        System.out.print("Enter Name: ");
        String name2 = input.next();

        System.out.print("Enter Age: ");
        int age2 = input.nextInt();

        System.out.print("Enter Basic Salary: ");
        double salary2 = input.nextDouble();

        Employee e2 = new Employee(id2, name2, age2, salary2);


        System.out.println("\n--- First Employee ---");
        e1.display();

        System.out.println("\n--- Second Employee ---");
        e2.display();

        input.close();
    }
}