// Shape interface

// Design (not implementation) common to both Rectangle
//    and Circle and any other shape-like things is included 
//    in the interface Shape.
//    It is much like a class except it only has declarations
//    of its methods, i.e., its design, but not implementation.
//    Some constants are allowed in it, but not fields.
// 
// Note that diagonal from Rectangle and circumference
// from Circle are not included because they are specific
// to Rectangle and Circle respectively, but not to Shape
// in general.

// An interface is really a new TYPE that we are defining, much
// like the types that get created when you define classes.
// That is, we can use the interface name, Shape here, as
// the type of some variable later.  This also means that
// if a class 'implements' this interface, the class MUST
// implement ALL of the methods that are declared in the
// interface to be able to act as a complete class.  That is,
// you will not be able to create an instance of that class
// unless the class implements ALL of its inherited abstract
// methods.  The methods declared in an interface are declared
// to be abstract.  These abstract methods become concrete when
// they are implemented in a class that inherit the interface.

public interface Shape {

    // Any method in an interface is public by default.
    // I made them public explicitly here.
    //
    // Any method in an interface is abstract by default.
    // I made them abstract explicitly here.

    // Move by dx in x-direction and dy in y-direction
    public abstract void translate (double dx, double dy);

    // Scale (enlarge or shrink) by a scale factor
    public abstract void scale (double factor);

    // Compute the bounding box
    public abstract Box boundingBox ();

}

// Question: If we see the need to include Comparable in the type
// hierarchy, how would you add it?  (1) As a super interface to Shape?
// or (2) as another superinterface to the classes that implement Shape?
// Think about which way you would do and why?
