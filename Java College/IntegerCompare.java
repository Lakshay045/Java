public class IntegerCompare {
    public static void main(String[] args) {

        Integer a = 20;
        Integer b = 20;
        Integer c = 30;

        System.out.println("Using equals():");
        System.out.println("a equals b: " + a.equals(b));
        System.out.println("a equals c: " + a.equals(c));

        System.out.println("\nUsing compareTo():");
        System.out.println("a compareTo b: " + a.compareTo(b));
        System.out.println("a compareTo c: " + a.compareTo(c));
        System.out.println("c compareTo a: " + c.compareTo(a));
    }
}