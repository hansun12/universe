
// Note that we are using static methods in this file, which is a file
// that uses the definition of Student.  Using static methods in UseX is
// not unusual, right?  main is a static method.  I am trying to illustrate
// parameter passing mechanism with objects and it is simpler to show
// with static methods.
//
// If you take a look inside the class Student, everything there is
// dynamic (non-static).
//
// So, you see how classes are defined using dynamic fields and methods.
//
// Once a class is defined that way, it is used in a class like this
// (UseStudent) using static methods.  Of course a class definition
// could use another class much like Customer was used in Account3,
// but this example shows how classes are defined and used.
//

public class UseStudent {

    public static void foo(Student a) {
        // Will changing a's state have any effect on the actual
        // object in the caller's (main's in this case) environment,
        // i.e., in the caller's (main's) activation record (stack frame)?
        a.setName("Jack James");   // Line A

        // Replace Line A above with the next two lines
        // and see what differences you see.
        // a = new Student("Mary Jones", 12, 3.79);
        // a.setName("Jack Smith");
    }

    public static void bar(Student a) {
        // Will setting a (the parameter) to null have any effect on the
        // actual object in the caller's stack frame, i.e., main's?
        // That is, on the object reference itself, which is john in main?
        // Note that in foo above, we were changing the state information
        // inside the object (which is happening in the heap), whereas here
        // we are changing a reference itself to the object (the reference
        // is on the stack, not in the heap).
        // Be sure to see the differences!!!
        // See what gets printed in main after it returns to main from bar.
        a = null;
    }

    // This one method shows several things:
    //
    // 1. It shows how to pass an object as a parameter to a method.
    // 2. It shows how to return an object as a return value from a method.
    // 3. It shows how an object is shared by multiple object references.
    //    In this case at some point an object is shared by 'a' and 'toReturn'
    //    of higherGPA as well as 'john' in main; or, 'b' and 'toReturn'
    //    of higherGPA as well as 'mary' in main, depending on which
    //    branch of the if_else it takes.
    // 4. It also shows that if you change the state of an object in the
    //    called method (i.e., higherGPA here), the changes made to the object
    //    persists even after the called method exits.  That is, the
    //    changes made to the object's state in the callee is visible in the
    //    caller's environment.
    //
    public static Student higherGPA (Student a, Student b) {

        Student toReturn = null;
        if (a.getGPA() > b.getGPA()) {
            toReturn = a;
        }
        else {
            toReturn = b;
        }

        // give a bonus to the one with higher GPA
        toReturn.setName(toReturn.getName() + ", !!.");

        return toReturn;
    }

    public static void main (String[] args) {

        Student john = new Student("John James", 11, 3.72);
        Student mary = new Student("Mary Jones", 12, 3.79);

        /* This section demonstrates equality testing with objects.
         *
         * Both lines below will be true as expected
         */
        System.out.println("john == john      (T/F) " + (john == john));
        System.out.println("john.equals(john) (T/F) " + john.equals(john));
        
        /* Now, try the next line with 'equals' in Student commented out
         */
        System.out.println("john.equals(mary) (T/F) " + john.equals(mary));

        // This time, try the previous line with 'equals' added in Student.



        /*
         * This section demonstrates parameter passing with objects.
         *
         * If you pass an object to a function, and change the state of
         * of that object in the called function, the change made there
         * will survive the function call.  That is, the change will be
         * visible after you return from the function call.  The changes
         * that you make when you change the state of an object are made
         * in the heap, not on the stack.  If you draw the kind of memory
         * diagrams that I have been drawing, it will be obvious.
         * A similar situation has been explained with arrays.  After all,
         * arrays are objects too.
         */
        System.out.println("Before calling foo: " + john.getName());

        foo(john);
        System.out.println("After returning from foo: " + john.getName());

        bar(john);
        System.out.println("After returning from bar: " + john.getName());

        Student higher = higherGPA(john, mary);
        System.out.println("john.getGPA(): " + john.getGPA());
        System.out.println("mary.getGPA(): " + mary.getGPA());
        System.out.println("After returning from higherGPA: " + john.getName());
        System.out.println("After returning from higherGPA: " + mary.getName());
        System.out.println("After returning from higherGPA: " + higher.getName());
    }

}

