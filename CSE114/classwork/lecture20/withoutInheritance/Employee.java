package withoutInheritance;

public class Employee {
    private String name;
    private int ssn;
    private int age;
    private int salary;
    private String dept;

    public Employee (int ssn, String name, int age,
                     int salary, String dept) {
        this.ssn = ssn;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName () {
        return name;
    }

    public int getSSN () {
        return ssn;
    }

    public int age () {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    // I did not add setters. Add them yourself.

    // equals redefined again here
    public boolean equals (Object o) {
        System.out.println("equals in Employee.");
        return ((name.equals(((Employee)o).name)) &&
                (dept.equals(((Employee)o).dept)));
    }

    public String toString () {
        System.out.println("toString in Employee.");
        return name + ", " + dept;
        // What would happen if we did the line below.
        // return super.toString() + ", " + dept;
    }

    public boolean isYuppie () {
        return (age() < 30 && salary > 100000);
    }

    public static void main (String[] args) {
        /* This code would not work until Person is made the superclass
         * of Employee.
         *
        Person p1 = new Employee(529, "Sara Johnson",
                                 2001, 80001, "HR");
        Person p2 = new Employee(528, "Sara Johnson",
                                 2000, 80001, "HR");
        */
        Employee p1 = new Employee(529, "Sara Johnson",
                                 2001, 80001, "HR");
        Employee p2 = new Employee(528, "Sara Johnson",
                                 2000, 80001, "HR");

        // Below think about which definition of toString is being
        // executed when you try to print p1.
        System.out.println(p1);
        System.out.println(p1 + " " + p1.age() + " years old.");

        if (p1.isYuppie()) {  // Line A
            System.out.println(p1.getName() + " is a yuppie.");
        }
        else {
            System.out.println(p1.getName() + " is not a yuppie.");
        }

        // below think about which definition of equals is being
        // executed
        System.out.println(p1 + " and " + p2 +
                           " are same: True or False? "
                           + p1.equals(p2));  // dynamic dispatching
    }

}
