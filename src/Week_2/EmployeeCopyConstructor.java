
package Week_2;

import java.util.*;

class Employee {
    String eid;
    String ename;
    String cprojects[];

    public Employee(String id, String name, String[] projects) {
        this.eid = id;
        this.ename = name;
        this.cprojects = projects.clone();
    }

    public Employee(Employee c) {
        this.eid = c.eid;
        this.ename = c.ename;
        this.cprojects = c.cprojects.clone();
    }

    public void display() {
        String pform = String.join(":", cprojects);

        System.out.println("id:" + eid);
        System.out.println("name:" + ename);
        System.out.println("projects:\n" + pform + ":");
    }

    public void mutator() {
        this.ename = "Mr " + this.ename;
        this.cprojects[0] = null;
    }
}

public class EmployeeCopyConstructor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String project[] = {"P001", "P002", "P003"};

        System.out.print("Enter employee ID: ");
        String id = s.nextLine();

        System.out.print("Enter employee name: ");
        String name = s.nextLine();

        Employee e1 = new Employee(id, name, project);
        Employee e2 = new Employee(e1);

        e1.mutator();

        e2.display();

        s.close();
    }
}
