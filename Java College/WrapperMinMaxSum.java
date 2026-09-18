public class WrapperMinMaxSum {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 25;
        Integer c = 15;

        Integer sum = a + b + c;
        Integer min = Math.min(a, Math.min(b, c));
        Integer max = Math.max(a, Math.max(b, c));

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
        System.out.println("Sum = " + sum);
    }
}