// Write a program to determine loan eligibility of a person based on following conditions: 
// 1. Salary greater than 50k and credit score greater than 500 or salary greater than 60k and 5 years of work experience .
// 2. Application must not have any loan default.

import java.util.*;

public class Loan {

    public static void main(String args[]){

        Scanner loan = new Scanner (System.in);

        System.out.println("Enter The Salary : ");
        int salary = loan.nextInt();

        System.out.println("Enter The Credit Score : ");
        int credit_score = loan.nextInt();

        System.out.println("Enter The Work Of Experience : ");
        int experience = loan.nextInt();

        System.out.println("Do you have any loan default : ");
        String loan_default = loan.next();

        if (loan_default.equalsIgnoreCase("no")) {

            if ((salary > 50000 && credit_score > 500) || 
                (salary > 60000 && experience >= 5)) {

                System.out.println("You are Eligible For Loan.");
            } 
            else {
                System.out.println("You are Not Eligible For Loan.");
            }

        } 
        else {
            System.out.println("You are Not Eligible For Loan.");
        }

        loan.close();
    }
}