
package Week_3;

import java.util.Scanner;

class Person {
    private String name;
    private long aadharno;

    public Person(String name, long aadharno) {
        this.name = name;
        this.aadharno = aadharno;
    }

    public void print() {
        System.out.println("name : " + name);
        System.out.println("aadharno : " + aadharno);
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, long aadharno, double salary) {
        super(name, aadharno);
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("salary : " + salary);
    }
}

class ContactEmployee extends Employee {
    private static final double hourlyPay = 100.00;
    private int contactHour;

    public ContactEmployee(String name, long aadharno, int contactHour) {
        super(name, aadharno, contactHour * hourlyPay);
        this.contactHour = contactHour;
    }

    @Override
    public void print() {
        super.print();
    }
}

public class EmployeeInheritanceDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Regular Employee Details");

        System.out.print("Name: ");
        String m1 = sc.nextLine();

        System.out.print("Aadhar Number: ");
        long ad1 = sc.nextLong();

        System.out.print("Salary: ");
        double sal = sc.nextDouble();

        sc.nextLine();

        System.out.println("\nEnter Contract Employee Details");

        System.out.print("Name: ");
        String m2 = sc.nextLine();

        System.out.print("Aadhar Number: ");
        long ad2 = sc.nextLong();

        System.out.print("Contract Hours: ");
        int cont = sc.nextInt();

        Employee[] eArr = new Employee[2];

        eArr[0] = new Employee(m1, ad1, sal);
        eArr[1] = new ContactEmployee(m2, ad2, cont);

        System.out.println("\n===== EMPLOYEE DETAILS =====");

        for (Employee e : eArr) {
            e.print();
            System.out.println();
        }

        sc.close();
    }
}

