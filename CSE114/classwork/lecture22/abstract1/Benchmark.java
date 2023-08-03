/* Since there is at least one abstract method (benchmark) in
 * the class Benchmark, the class is called an abstract class.
 * To signify that fact, we also add abstract in front of the
 * keyword class.
 * 
 * A subclass that extends this class with the intention of creating
 * an instance MUST implement the abstract method.  It is possible
 * that an abstract class inherits this abstract class, in which case
 * one of the classes in the (sub)class hierarchy chain will have to
 * implement it if it wants to create an instance of that class.
 */
public abstract class Benchmark {

    public abstract void benchmark();

    public final long repeat (int count) {

        // long start = System.currentTimeMillis();
	long start = System.nanoTime();

	for (int i = 0; i < count; i++) {
	    benchmark();
	}

	return (System.nanoTime() - start);
    }

}

/* We can't make an instance of an abstract class, but does it allow
 * constructors to be included in an abstract class?
 *
 * Yes, because one of its subclasses in the subclass hierarchy may
 * need to call super(...) and the abstract class may need to deal
 * with some of its fields and methods or whatever else it might need
 * to do.
 */
