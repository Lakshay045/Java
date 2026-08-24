// Create a Class name with data members enrollment number , Student name , Semester , Member Function and display student details



import java.util.Scanner;

public class Student {

    double EnrollNo ;
    String Name ;
    int Sem ;


    Student(double enrollNo , String name , int sem ){
        EnrollNo = enrollNo ;
        Name = name ;
        Sem = sem ;

    }

    void display(){
        System.out.println("Your Enrollment Number is : " + EnrollNo);
        System.out.println("Your Name is : " + Name );
        System.out.println("Your Sem is : " + Sem );
    }


    public static void main(String args []){

        Scanner sc = new Scanner (System.in);

        System.out.println("What is your Enrollment Number  :  "  );
        double a = sc.nextDouble();
        
        System.out.println("What is your Name  : "  );
        String b = sc.next();

        System.out.println("What is your Semester  : "  );
        int c = sc.nextInt();

        Student a1 = new Student(a , b , c);

        a1.display();

        sc.close();

    }


    
}
