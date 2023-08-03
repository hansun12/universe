package inheritance;
/*        Object
 *          ^
 *          |
 *        Person
 *          ^
 *          |
 *       Employee
 *          ^
 *          |
 *       Manager
 *
 * You can add Comparable at any of the classes that we defined to add the
 * compareTo capability as well.
 *
 */

public class Manager extends Employee {

    private int size;

    public Manager (int ssn, String name, int age,
                    int salary, String dept, int size) {
        super(ssn, name, age, salary, dept);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    
    public String toString () {
        System.out.println("toString in Manager.");
        return super.toString() + ", " + size;
    }

    public boolean isABigBoss () {
        return (size > 50);
    }

    public static void main (String[] args) {
        // This code won't compile until we set the superclass correctly
        Person p1 = new Manager(529, "Sara Johnson",
                                2001, 80001, "HR", 10);
        Person p2 = new Manager(528, "Sara Johnson",
                                2000, 80001, "IDP", 60);

        if (((Manager)p1).isABigBoss()) {  // to make the compiler happy
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

