/* Let's write some use code for Shape and see how Shape acts as
 * a supertype of both Circle and Rectangle.
 *
 * As you read the code below, note that the only time we use the
 * classes Circle and Rectangle is to 'construct' objects.  Everywhere
 * else, we use the common type Shape.
 *
 * Also note that Line A below typechecks only because of the special
 * rule in Java that Object is a supertype of any interface such as Shape.
 * That is, Object is a supertype of any class as well as any interface
 * in Java
 */

public class UseShape {

    public static void main (String[] args) {
        // Circle s1 = new Circle(0.0, 0.0, 1.0);
        Shape s1 = new Circle(0.0, 0.0, 1.0);
        s1.translate(10.0, 10.0);
        s1.scale(2.0);
        Box b1 = s1.boundingBox();
        System.out.println(s1); // Line A
        translateAndScale(s1);  // See below

        s1 = new Rectangle(1.0, 1.0);
        s1.translate(10.0, 10.0);
        s1.scale(2.0);
        Box b2 = s1.boundingBox();
        System.out.println(s1);
        translateAndScale(s1);  // See below

        heterogeneousArray();    // See below
        trouble();
    }


    // We can use the interface Shape to write more methods that
    // work equally well on circles and rectangles (or any class
    // that implements Shape.

    public static void translateAndScale (Shape s) {
        System.out.println("\nIn translateAndScale . . .");
        s.translate(1.0, 1.0);
        s.scale(2.0);
        System.out.println(s);
    }

    // How about heterogeneous arrays?
    // We can construct arrays of type Shape and populate them
    // with circles and rectangles.

    public static void heterogeneousArray () {
        System.out.println("\nIn heterogeneousArray . . .");
        Shape[] ha = new Shape[3];
        ha[0] = new Circle(10.5, 11.4, 12.5);
        ha[1] = new Rectangle(20.4, 21.5);
        ha[2] = new Circle(11.5, 12.4, 13.5);

        for (int i = 0; i < 3; i++) {
            System.out.println(ha[i].toString());
        }
        // ha[i].toString(): dynamic method dispatching,
        //                   dynamic binding,
        //                   polymorphism,
        //                   late binding

        /*
        for (int i = 0; i < 3; i++) {     // Using a regular for loop.
            ha[i].translate(1.0, 1.0);
        }
        */
        for (Shape sh : ha) { // Using the 'for-each' loop instead this time.
                              // It is just a 'syntactic sugar' for the
                              // regular for loop.
            sh.translate(1.0, 1.0);  // dynamic method dispatching again
        }

        for (Shape sh : ha) {
            System.out.println(sh);
        }
    }

    public static void trouble () {

        System.out.println("\nIn trouble . . .");

        Shape s1 = new Circle(0.0, 0.0, 1.0);

        // If we have a variable of type Shape whose current value is
        // an object of type Circle, we are NOT allowed to access any fields
        // or methods of the Circle class using this variable unless they
        // are among the ones declared in the Shape interface.  In other
        // words, storing a Circle object in a Shape variable 'forgets' that
        // it is really a circle.  It will give you a compile time error if
        // you try the following.  This seems confusing, isn't it?  Note the
        // distinction between dynamic dispatching/binding that we talked
        // about and what is happening at compile time.
        // Remember that the compiler uses the DECLARED TYPE, whereas method
        // dispatching at runtime uses the ACTUAL TYPE given a variable?

        // System.out.println(s1.circumference());  // would not compile!

        // This would work though since scale is declared to be one of
        // the methods in Shape:

        s1.scale(3.4);  // this works!

        // To make the circumference call compile, however, we can cast
        // the type of s1 to be of type Circle like this because we as the
        // programmer who wrote this code know that s1 is really a Circle
        // and circumference is defined there:

        // System.out.println(s1.circumference());  // this would not compile!
        System.out.println(((Circle)s1).circumference());  // this does!
        
        // So, what is going on here?
        //
        //    SUBTYPING
        //
        // Notice that the statement
        //
        //    Shape s1 = new Circle(1.0, 2.0, 3.4);
        //
        // assigns a value of type Circle (subtype) to a variable of
        // type Shape (supertype).  That is, Shape is a supertype of
        // Circle and Circle is a subtype of Shape.
        //
        // This is an example of a general mechanism called 'subtyping'
        // (or subtype polymorphism).
        //
        // When we declare that a class C implements some interface I,
        // the compiler checks that the body of C really provides ALL
        // of the facilities listed in I.
        //
        // If it does, then C is said to be a subtype of I, and the
        // values of type C may be used in any context where the type
        // I is expected.  That is, a value of type C may be assigned
        // to a variable of type I; a value of type C may be passed to
        // a method that expects an actual argument of type I (this is
        // what I called 'implicit assignment'); and a value of type C
        // may be returned as a return value where the return type is
        // declared to be of type I.  See Subtype.java.
        //
        // Even when C (Circle) correctly implements all of the
        // facilities of I (Shape), if an object of type C is given to
        // a variable of type I, the Shape variable 'forgets' that it
        // really is a Circle object, in which case we as the programmer
        // who is writing the code can advise the compiler that the
        // Shape variable is really holding a Circle object.  You do
        // that by type-casting it.  The compiler then tries to believe
        // the programmer and at least will try to treat it as a Circle
        // object, and it will compile successfully if indeed the
        // programmer advised the compiler correctly.
        //
        // If the body of C does not provide all of the facilities
        // listed in I and the ones attempted with type-casting, however,
        // the C's definition is deemed erroneous and the compiler will
        // complain when a method that is not provided is attempted.
        //
        // Also see Subtype.java for another way of explaining this concept!
    }
}
