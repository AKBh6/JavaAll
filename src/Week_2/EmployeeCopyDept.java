package Week_2;

import java.util.Scanner;

class DeptEmployee {
    String ename;
    String eid;
    String edept;

    public DeptEmployee() {
        ename = "guest";
    }

    public DeptEmployee(String name, String id, String dept) {
        ename = name;
        eid = id;
        edept = dept;
    }

    public void copyDept(DeptEmployee e) {
        this.edept = e.edept;
    }

    public void displayDetails() {
        System.out.println("ename : " + ename);
        System.out.println("eid : " + eid);
        System.out.println("edept : " + edept);
    }
}

public class EmployeeCopyDept {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        DeptEmployee e1 = new DeptEmployee();
        System.out.println("Name of Employee : ");
        String name = s.nextLine();
        System.out.println("ID of Employee : ");
        String id = s.nextLine();
        System.out.println("Department of Employee : ");
        String dept = s.nextLine();

        DeptEmployee e2 = new DeptEmployee(name, id, dept);

        e1.copyDept(e2);

        e1.displayDetails();

        s.close();
    }
}

