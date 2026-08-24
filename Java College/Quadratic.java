public class Quadratic
{
    public static void main(String args[])
    {
        double a = 1;
        double b = -5;
        double c = 6;

        double d = (b * b) - (4 * a * c);

        double root1 = (-b + Math.sqrt(d)) / (2 * a);
        double root2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println("Root 1 = " + root1);
        System.out.println("Root 2 = " + root2);
    }
}