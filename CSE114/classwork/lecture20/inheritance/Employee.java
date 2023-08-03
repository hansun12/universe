package inheritance;
/*        Object
 *          ^
 *          |
 *        Person
 *          ^
 *          |
 *       Employee
 *
 * Employee inherits Person using the keyword 'extends'
 *
 * Note that you use the key word 'implements' when you inherit an
 * interface; and 'extends' when you inherit a class.
 *
 * Here, Person is a superclass of Employee and Employee is a subclass
 * of Person.  A class in Java can inherit only one class although it
 * can inherit any number of interfaces.
 *
 * When you are inheriting a class, you are inheriting the super class'
 * fields and methods.  When you are inheriting an interface, you are
 * inheriting only the design of the super interface's methods.
 *
 * You can overwrite the definition of a method defined in a superclass
 * in a subclass.  Below you can see that equals and toString are
 * redefining those definitions given in the superclass Person and Object.
 * The actual type of an object decides which method to execute as we saw
 * in Subtype.java in our last lecture.
 *
 * Also be sure to read the comments I added at the end of this file!!!
 */

/*
 * Remember the lines that I deleted in my lecture?
 * The following make up for the deleted lines:
 *   1. Two words ('extends' and 'Person')
 *   2. the 'super(...)' call in the constructor
 *   3. changing private to protected for the fields in Person
 */
public class Employee extends Person {

    protected int salary;
    protected String dept;

    public Employee (int ssn, String name, int age,
                     int salary, String dept) {
        super(ssn, name, age);
        this.salary = salary;
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    // I did not add setters. Add them yourself.

    public boolean equals (Object o) {
        System.out.println("equals in Employee.");
        return ((name.equals(((Employee)o).name)) &&
                (dept.equals(((Employee)o).dept)));

        /* What if we did the following?
         * In general, this would not be a good thing to do if super
         * eventually refers to Object, right?  Because Object tests
         * if two are in the same memory location.
        return ((super.equals(o)) &&
                (dept.equals(((Employee)o).dept)));
        */
    }

    public String toString () {
        System.out.println("toString in Employee.");
        //        return name + ", " + dept;
        return super.toString() + ", " + dept;
    }

    public boolean isYuppie () {
        return (age() < 30 && salary > 100000);
    }

    public static void main (String[] args) {
        // This code would not compile until Person is made the superclass
        // of Employee
        Person p1 = new Employee(529, "Sara Johnson",
                                 2000, 80001, "HR");
        Person p2 = new Employee(528, "Sara Johnson",
                                 2001, 80001, "HR");
        Person p3 = new Person(527, "Sara Johnson", 2001);

        // Below think about which definition of toString is being
        // executed when you try to print p1.
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p1 + " " + p1.age() + " years old.");

        if (((Employee)p1).isYuppie()) {  // Line A
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

/*

Note that I have 

        if (((Employee)p1).isYuppie()) {  // Line A

above.  Why did I typecast p1 to Employee?  Well, p1 is declared to be
of type Person.  Compiler would complain if you left out the
typecasting code, i.e., ((Employee)p1), because compiler only looks at
the declared type and fails to find isYuppie in Person.  So, we need
to typecast it to Employee as I did so that the compiler will try to look
for isYuppie() in Employee rather than in Person.  If you are calling
p1.equals(...), we don't need to typecast since equals is defined in
Person as well - if not in Person, it is defined in Object which is
Person's superclass.  All this to make the Java compiler happy.

Dynamic dispatching is what happens at run time as a method on an object
is called, at which time the dispatching scheme uses the actual type
rather than the declared type to decide which method to execute. 
Remember you have to worry about what happens at compile time and also
what happens at run time?  That is exactly what is going on here in
the context of subtyping relationship between supertype (superclass,
Person in this case) and subtype (subclass, Employee in this case).

At run time, to decide which toString to execute on an object, it
looks at the actual type of the object and tries to find toString on
that object.  If it finds a definition of toString in the object's class,
it will execute that method.  If not, it will try to find it in its
superclass.  It will continue all the way to the root class which is
Object if necessary.  So, try to understand what we need to do to make
the compiler happy and what happens at run time on a method call on an
object.

One more thing - it has to do with operator precedence:

   (Employee)p1.isYuppie()

is equivalent to

   (Employee)(p1.isYuppie())

not

   ((Employee)p1).isYuppie()

What we want is 

   ((Employee)p1).isYuppie()

thus the extra set of parentheses in this form.

*/
