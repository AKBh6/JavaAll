
package Week_5;

import java.util.Scanner;

class ComplexNum<N extends Number> {
    private N number1;
    private N number2;

    public ComplexNum(N number1, N number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public <M extends Number> ComplexNum<Double> add(ComplexNum<M> other) {
        double real = this.number1.doubleValue()
                + other.number1.doubleValue();

        double imaginary = this.number2.doubleValue()
                + other.number2.doubleValue();

        return new ComplexNum<Double>(real, imaginary);
    }

    @Override
    public String toString() {
        return number1 + " + " + number2 + "i";
    }
}

public class ComplexNumDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== COMPLEX NUMBER ADDITION =====");

        System.out.println("\nEnter first complex number (Integer):");
        System.out.print("Real part: ");
        int n1 = sc.nextInt();

        System.out.print("Imaginary part: ");
        int n2 = sc.nextInt();

        System.out.println("\nEnter second complex number (Double):");
        System.out.print("Real part: ");
        double d1 = sc.nextDouble();

        System.out.print("Imaginary part: ");
        double d2 = sc.nextDouble();

        ComplexNum<Integer> c1 = new ComplexNum<>(n1, n2);
        ComplexNum<Double> c2 = new ComplexNum<>(d1, d2);

        ComplexNum<Double> c3 = c1.add(c2);

        System.out.println("\n===== RESULTS =====");
        System.out.println("First Number:  " + c1);
        System.out.println("Second Number: " + c2);
        System.out.println("Sum:           " + c3);

        sc.close();
    }
}
