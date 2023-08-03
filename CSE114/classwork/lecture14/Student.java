// This example illustrates how objects are compared for equality testing

// Comparing objects
//
//  . '==' can be used to see if two objects are the same identical object
//    or not.  That is, it checks if two object references are the same.
//    In other words, it checks if two objects are located in the same
//    memory location.
//
//  . 'equals' has the same meaning as '==' unless you redefine the meaning
//    of 'equals' in the class that you create.  The meaning of 'equals' is
//    inherited from the class called Object just like toString we saw in
//    Loan.java was inherited from Object.  In most situations the inherited
//    meaning would not be what we want.  That is, comparing two student
//    objects by comparing their memory locations would not be very
//    meaningful in almost any situation.
//
//    So, what do we have to do if we want to compare two objects for
//    equality, say two Student objects, by comparing the information within
//    those objects, e.g., student ids or student names or even both?
//    We do that by defining an 'equals' method of our own in the class
//    we design, e.g., Student.  The equals method that we define in
//    Student would overwrite the definition of equals that we are
//    inheriting from Object.  For them to work that way, the signature of
//    equals that we introduce in Student must match the signature of equals
//    defined in Object.  Below you will see two definitions of equals: one
//    matching the signature of equals in Object and the other that does not.
//    Read my description there for the differences.
//
//    See the definition of equals below to see how this is done.

public class Student {

    private double gpa;
    private int ssn;
    private String name;

    public Student (String n, int sn, double g) {
        name = n;
        ssn = sn;
        gpa = g;
    }

    public String getName () {
        return name;
    }

    public void setName (String newName) {
       name = newName;
    }

    public double getGPA () {
        return gpa;
    }

    public int getSSN () {
        return ssn;
    }

    public String toString () {
        return "(" + name + ", " + ssn + ")";
    }

    // The default meaning of 'equals' given by the 'equals' implementation
    // in Object is identical to that of '=='.
    // If we want 'equals' to have a different meaning than '==', we
    // can redefine 'equals' to have whatever meaning we want it to have.
    // In this example, I decided to compare two student objects
    // by comparing the length of the string obtained by concatenating
    // ssn (as string) and name - a very strange way to compare
    // them, but I chose to show you it this way so that you will know
    // that you can compare WHATEVER you choose to compare when you are
    // defining an equality test of two objects of the same kind!
    //
    //  We will write it this way FOR NOW, but we will write it using
    //  Object in the future as I explain it below.
    //

    public boolean equals (Student s) {
        return ((ssn + name).length() == (s.ssn + s.name).length());
    }

    
    // You see some type casting from Object type to Student type below.
    // Object is a class which is a more general class than Student.
    // In fact, Object is the most general class of all Java classes.
    // Here I elected to use Object as the type of the parameter rather
    // than using Student.  As we will see when we study the subject of
    // object inheritance later, using Object is more general than
    // using Student.  If type A is more general than the type B,
    // then you can assign an object of type B to a variable of type A.
    // Since passing a value to a parameter is similar to assigning a
    // value to a variable, it would work here.  In fact, I
    // mentioned when we talked about parameter passing some time ago
    // that parameter passing is an 'implicit' assignment.
    // I will explain this in more detail when we discuss inheritance.
    // For now, if we want to use this general way, we will use Object
    // every time we redefine an 'equals' method for any class that you
    // create and use the sort of typecasting that I am using below.
    // 'Cut-and-paste' will do FOR NOW for the signature of 'equals' every
    // time we want to define an 'equals' method this way until we talk
    // about inheritance.
    /*
    public boolean equals (Object obj) {
        if (!(obj instanceof Student)) {
            System.out.println("Wrong object passed into equals in Student");
            return false;
        }
        return (ssn + name).length() == (((Student)obj).ssn +
                                         ((Student)obj).name).length();
    }
    */
}
