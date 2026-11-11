
package Week_4;

import java.util.Scanner;

interface Iterator {
    public boolean has_next();
    public Object get_next();
}

class Sequence {

    private final int maxLimit = 80;
    int[] iArr;
    int size;

    public Sequence(int maxLimit) {
        iArr = new int[maxLimit];
        size = 0;
    }

    public void addTo(int elem) {
        if (size < iArr.length) {
            iArr[size] = elem;
            size++;
        }
    }

    public Iterator get_iterator() {
        return new SeqIterator(size);
    }

    private class SeqIterator implements Iterator {

        int index;

        public SeqIterator(int size) {
            index = -1;
        }

        @Override
        public boolean has_next() {
            return index < size - 1;
        }

        @Override
        public Object get_next() {
            index++;
            return iArr[index];
        }
    }
}

public class SequenceIteratorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (1-80): ");
        int n = sc.nextInt();

        if (n < 1 || n > 80) {
            System.out.println("Invalid size! Enter a value between 1 and 80.");
            sc.close();
            return;
        }

        Sequence sObj = new Sequence(n);

        System.out.println("\nEnter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            sObj.addTo(sc.nextInt());
        }

        Iterator it = sObj.get_iterator();

        System.out.println("\n===== SEQUENCE ELEMENTS =====");

        while (it.has_next()) {
            System.out.print(it.get_next() + " ");
        }

        System.out.println();

        sc.close();
    }
}
