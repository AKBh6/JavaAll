
package Week_5;

import java.util.Scanner;

class ArrayExample<T> {

    T[] a;

    public ArrayExample(T[] a) {
        this.a = a;
    }

    public int elementCount(T x) {
        int count = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i].equals(x)) {
                count++;
            }
        }

        return count;
    }

    public void display() {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
}

public class ArrayObject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== INTEGER ARRAY =====");

        System.out.print("Enter length of Integer array: ");
        int len = sc.nextInt();

        Integer[] x = new Integer[len];

        for(int i = 0; i < len; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }

        ArrayExample<Integer> obj = new ArrayExample<>(x);

        System.out.print("Enter Integer value to count: ");
        int s1 = sc.nextInt();

        System.out.println("\n===== STRING ARRAY =====");

        String[] y = new String[len];

        for(int i = 0; i < len; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            y[i] = sc.next();
        }

        ArrayExample<String> obj1 = new ArrayExample<>(y);

        System.out.print("Enter String value to count: ");
        String s2 = sc.next();

        System.out.println("\n===== INTEGER ARRAY RESULTS =====");
        System.out.print("Elements: ");
        obj.display();

        System.out.println("Occurrences of " + s1 + ": "
                + obj.elementCount(s1));

        System.out.println("\n===== STRING ARRAY RESULTS =====");
        System.out.print("Elements: ");
        obj1.display();

        System.out.println("Occurrences of " + s2 + ": "
                + obj1.elementCount(s2));

        sc.close();
    }
}
