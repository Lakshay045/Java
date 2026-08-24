// WAP to create a class rectangle with area and parameter function to find area and parameter of rectangle .

public class Rectangle
{
    int length, breadth;

    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    void area()
    {
        System.out.println("Area of Rectangle : " + (length * breadth));
    }

    void perimeter()
    {
        System.out.println("Perimeter of Rectangle : " + (2 * (length + breadth)));
    }

    public static void main(String args[])
    {
        Rectangle r = new Rectangle(10, 5);

        r.area();
        r.perimeter();
    }
}