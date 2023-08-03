package withoutInheritance;

public class Manager {

    private String name;
    private int ssn;
    private int age;
    private int salary;
    private String dept;
    private int size;

    public Manager (int ssn, String name, int age,
                    int salary, String dept, int size) {
        this.ssn = ssn;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
        this.size = size;
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

    public int getSize() {
        return size;
    }
    
    // I did not add setters. Add them yourself.
    
    public boolean equals (Object o) {
        System.out.println("equals in Manager.");
        return ((name.equals(((Manager)o).name)) &&
                (dept.equals(((Manager)o).dept)));
    }

    public String toString () {
        return name + ", " + dept + ", " + size;
    }

    public boolean isABigBoss () {
        return (size > 50);
    }


    public static void main (String[] args) {
        /*
        Person p1 = new Manager(529, "Sara Johnson",
                                1997, 80001, "HR", 10);
        Person p2 = new Manager(529, "Sara Johnson",
                                1998, 80001, "IDP", 60);
        */
        Manager p1 = new Manager(529, "Sara Johnson",
                                1997, 80001, "HR", 10);
        Manager p2 = new Manager(529, "Sara Johnson",
                                1998, 80001, "IDP", 60);

        if (p1.isABigBoss()) {  // to make compiler happy
            System.out.println(p1.getName() + " is a big shot.");
        }
        else {
            System.out.println(p1.getName() + " is not a big shot.");
        }

        System.out.println(p1 + " and " + p2 +
                           " are same: True or False? "
                           + p1.equals(p2));
    }
}

