
package Week_4;

import java.util.Scanner;

abstract class StringOperations {

    public abstract String reverse(String s);

    public abstract int vowelCount(String s);
}

class UpdatedStrings extends StringOperations {

    @Override
    public String reverse(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return rev;
    }

    @Override
    public int vowelCount(String s) {
        return s.replaceAll("(?i)[^aeiou]", "").length();
    }
}

public class StringOperationsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UpdatedStrings str = new UpdatedStrings();

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("\n===== STRING OPERATIONS =====");

        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + str.reverse(s));
        System.out.println("Vowel Count: " + str.vowelCount(s));

        sc.close();
    }
}
