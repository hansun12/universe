// Object is a superclass of any and every class that you define.
// So, Object is a superclass of Point if you define a class named
// Point.  Point is said to be a subclass of Object in that situation.
//
// We also say that Object is a supertype of Point.
// Equivalently, we also say that Point is a subtype of Object.
// The notion of type is more general than the notion of class in the
// sense that this relationship holds even for non-object types.
//
// A variable of supertype can hold a value of a subtype object.
// A variable of subtype canNOT hold a value of a supertype object.
//
// Object is a supertype of any and all classes in Java as mentioned
// above.  So, Object is a supertype of Point type.
//
// In general you can substitute a subtype object for any variable
// that is declared to be of a supertype of the subtype.
// This is called the substitution rule and subtyping is the
// theoretical basis that makes this rule possible.
//
// For example, foo below expects an object o of type Object as an
// argument in Line 1.  Since Object is a supertype of Point,
// we can pass an object of Point as an actual argument to foo.
// Actually, any object of any other type in fact can be passed to
// foo since Object is a supertype of any and all object types
// in Java.  I say object type since a primitive data type would be
// excluded from this claim.

// The reverse is not possible.  That is, if there a function declared
// to take an argument of type Point, for example, you can NOT pass an
// object of type Object to it.  That would cause a compile time error.
// We will see why this is using an example in class.

public class Subtype {


    public static void foo (Object o) {       // Line 1
        System.out.println("in foo: " + o);   // Line 2
    }

    public static Object bar () {  // Line 3
        return new Point(10, 20);
    }

    public static void main(String[] args) {

        Object o = null;
        o = new Object();

        foo(o);      // Line A


        // (1) Assigning an object of type Point
        //     to an object reference of type Object is OK:
        o = new Point(1, 2);

        // (2) Passing an object of type Point to a parameter
        //     of type Object is OK:
        foo(o);  // Line B

        // (3) Using a method that returns an object of type Point
        //     where the return type is declared to be of type Object:
        o = bar();  // Line C

        // Below, which toString will be used: toString of Object or Point?
        // Try this twice: once without toString in Point
        //   and once more with toString added in.
        //   Will it print Point@dflkjadfl
        //              or Object@dflkjadfl?
        //   when tried without?
        System.out.println("xxxx = " + o);
        System.out.println();
    }
}

/*
 The output that you get (java.lang.Object@16f0472) when you call
 foo in Line A is expected.

 The output that you get, (1,2, 2), when you call foo in Line B seems
 counterintuitive.  Here is why it prints (1,2, 2).  In Line 1
 the declared type of o is Object.  That is, o is declared to be of
 type Object.  When foo is called in Line B, the object that is passed
 to o in Line 1 is actually a Point object.  That is, the DECLARED TYPE
 of o in Line 1 is Object although the ACTUAL TYPE of o in Line 1 at run
 time is Point.  When o in Line 2 is printed, the Java language system
 implicitly calls the toString method on o, right?  Well, the
 question is then whether it calls the toString defined in Object or
 the toString defined in Point.  The rule in Java is that the method
 that actually gets called at run time is determined at run time
 (dynamically) using the ACTUAL TYPE of the object.  In this case,
 the actual type of o is Point so it will call toString of Point - thus
 the output that you saw.  Of course, I am assuming that toString is
 defined in Point.  This is called dynamic dispatching (aka dynamic
 binding, late binding).  That is, the name toString is bound to the
 body of toString, but which body (the one in Object or the one in Point)
 it gets bound to isn't determined until run time by examining the actual
 type of the object.  Since it is being done at run time, we also call it
 dynamic binding.  When I said dispatching, it means that the method name
 (toString in this case) is dispatched to the right piece of code to
 execute, i.e., the right body of the toString method.

 Whew... that is interesting!!!

 See bar in Line 3.  The return type of bar is Object, but it is
 actually returning a Point object.  This is of course allowed since
 Point is a subtype of Object.

 This subtyping relationship is useful when we build a container object
 such as an array.  We would build an array of element type, say Object,
 something very general.  We could then add objects of any type since
 any object type is a subtype of Object.  We will see this kind of thing
 a lot when we deal with collection classes next semester such as ArrayList,
 LinkedList, TreeSet, TreeMap, HashMap, HashSet, etc.  We may see some of
 them later this semester too.  Yes, of course, it is also possible to
 do with arrays.

 */
