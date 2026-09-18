// WAP to program in which studentMarks stored as string value and convert them into integer objects. Also calculate the total and average, and determine whether the student has passed or not.

public class WrapperClass
{
    public static void main(String args[])
    {
        String marks1 = "75";
        String marks2 = "65";
        String marks3 = "80";

        Integer m1 = Integer.valueOf(marks1);
        Integer m2 = Integer.valueOf(marks2);
        Integer m3 = Integer.valueOf(marks3);

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        if(average >= 40)
        {
            System.out.println("Student has Passed.");
        }
        else
        {
            System.out.println("Student has Failed.");
        }
    }
}