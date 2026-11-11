
package Week_3;

import java.util.Scanner;

class Shape {
    public int area() {
        return 0;
    }

    public int volume() {
        return 0;
    }
}

class Rectangle extends Shape {
    private int w, h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int area() {
        return w * h;
    }
}

class Cube extends Shape {
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public int volume() {
        return a * a * a;
    }
}

public class ShapeDemo {

    private static void caller(Shape s) {

        if (s instanceof Rectangle) {
            System.out.println("Rectangle Area: " + s.area());
        }

        if (s instanceof Cube) {
            System.out.println("Cube Volume: " + s.volume());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rectangle width: ");
        int w = sc.nextInt();

        System.out.print("Enter rectangle height: ");
        int h = sc.nextInt();

        System.out.print("Enter cube side: ");
        int a = sc.nextInt();

        Rectangle r = new Rectangle(w, h);
        Cube c = new Cube(a);

        System.out.println("\n===== RESULTS =====");

        caller(r);
        caller(c);

        sc.close();
    }
}
