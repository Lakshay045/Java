// WAP to class Name Circle , calculate area of circle  by a method and create two object of the class .


import java.util.Scanner;

public class Circle {

    double radius;

    Circle(double rad) {
        radius = rad;
    }

    void display() {
        System.out.println("Area = " + (3.14 * radius * radius));
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Radius of First Circle: ");
        double r1 = sc.nextDouble();

        System.out.println("Enter The Radius of Second Circle: ");
        double r2 = sc.nextDouble();

        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);

        c1.display();
        c2.display();

        sc.close();
    }
}