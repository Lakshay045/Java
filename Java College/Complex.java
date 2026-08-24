// Define class for complex number with real and imaginary part . Describe its constructor and also define addition method to add two complex objects.



public class Complex {

    int real, imag;

    Complex(int reall, int imaginary) {
        real = reall;
        imag = imaginary;
    }

    void add(Complex c) {
        real = real + c.real;
        imag = imag + c.imag;
    }

    void display() {
        System.out.println("Your Answer is : " + real + " + " + imag + "i");
    }

    public static void main(String args[]) {

        Complex a1 = new Complex(2, 3);
        Complex a2 = new Complex(4, 6);

        a1.display();
        a2.display();

        a1.add(a2);

        a1.display();
    }
}