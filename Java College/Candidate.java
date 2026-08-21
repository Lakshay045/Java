// WAP to Create Class Name Candidate with Candidate ID , Candidate Name , Age , Weight , Height Data Members .
// Also create create method get candidate details for input and display Candidate detail. Create main Method to Demonstrate the Candidate Class.
    

import java.util.Scanner;

public class Candidate {

    double ID ;
    String name ;
    int age ;
    int weight ;
    double Height ;

    Candidate(double id , String Name , int Age , int Weight , double height ){
        
        ID = id ;
        name = Name ;
        age = Age ;
        weight = Weight ;
        Height = height ;

    }

    void display (){

        System.out.println("The ID Of The Candidate Is : " + ID);
        System.out.println("The Name Of The Candidate Is : " + name);
        System.out.println("The Age Of The Candidate Is : " + age);
        System.out.println("The Weight Of The Candidate Is : " + weight);
        System.out.println("The Height Of The Candidate Is : " + Height);

    }

    public static void main(String args []){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter The ID :");
        double a = input.nextDouble();

        System.out.println("Enter The Name :");
        String b = input.next();

        System.out.println("Enter The Age :");
        int c = input.nextInt();

        System.out.println("Enter The Weight :");
        int d = input.nextInt();

        System.out.println("Enter The Height :");
        double e = input.nextDouble();

        Candidate a1 = new Candidate (a , b , c , d ,e);
       

        a1.display();


       
        input.close();



    }

    
}
