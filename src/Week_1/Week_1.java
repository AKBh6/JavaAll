package Week_1;
import java.util.Scanner;
public class Week_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA WEEK 1 =====");

        // Variables and Data Types

        String name;
        int age;
        double marks;
        char grade;
        boolean passed;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter your marks: ");
        marks = sc.nextDouble();

        // Operators

        int bonus = 5;
        double total = marks + bonus;

        // Conditional Statements

        if (total >= 90) {
            grade = 'A';
        }
        else if (total >= 75) {
            grade = 'B';
        }
        else if (total >= 50) {
            grade = 'C';
        }
        else {
            grade = 'F';
        }

        passed = total >= 40;

        // Type Casting

        int roundedMarks = (int) total;

        // Display Information

        System.out.println("\n===== STUDENT DETAILS =====");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Original Marks: " + marks);
        System.out.println("Bonus Marks: " + bonus);
        System.out.println("Total Marks: " + total);
        System.out.println("Rounded Marks: " + roundedMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);

        // For Loop

        System.out.println("\n===== FOR LOOP =====");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop

        System.out.println("\n===== WHILE LOOP =====");

        int count = 1;

        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Arithmetic Operators

        System.out.println("\n===== ARITHMETIC =====");

        int a = 20;
        int b = 6;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        sc.close();
    }
}

