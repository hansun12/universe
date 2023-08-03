// A statement consisting of multiple statements is called
// a compound statement.

public class Compound {

    public static void main (String[] args) {

	int count = 10;  // A statement with compound meaning

        /*  We can split it into two statements like this:
	int count;  // A declaration statement 
        count = 10; // An assignment statement
        */

	// We have seen one like this before
	if (count > 0) {
	    System.out.println("count is positive.");
	}
	else {
	    System.out.println("count is negative or equal to 0");
	}


	// When there is only one statement in a branch of an
	// if...else, you may skip the curly braces.
        // Here is the deal: the syntax of if...else requires that
        // each branch must be a statement.  System.out.println("...");
        // is a statement without the curly braces.  So, that would
        // satisfy the syntax requirement.
        //
        // A sequence of zero or more statements enclosed in a pair of
        // curly braces is also a statement.  We call it a compound 
        // statement.  So, that would also satisfy the syntax
        // requirement.
        //
        // Why did I use a compound statemene even when there is only
        // one statement in a branch?  Well... to reduce the chance of
        // making a hard to find mistake later.  Here is a possible
        // scinario: You start with a single statement branch without
        // the curly braces.  Later you will just add another statement
        // because you later find out that it is needed.  Because of
        // the indentation that we used, without thinking much about it
        // you will add another statement and forget to also add a pair
        // of curly braces.  It could happen if you are not using a
        // fancy programming tool such as Eclipse.  Once it happens,
        // it is really hard to spot that mistake because your program
        // will run without crashing except the result will be wrong.
        // If it breaks, it is much easier to spot the error.  If it
        // runs successfully but with the wrong result, it is much
        // harder to find.  To prevent that from happening, why not
        // make it a habit to enclose each branch with a pair of
        // curly braces?  I do!  We call that "defensive programming"!
        
	if (count > 0)
	    System.out.println("count is positive.");
	else
	    System.out.println("count is negative or equal to 0");


	// What would happen if you remove curly braces here
	// like this?
	if (count > 0)
	    System.out.println("count is positive.");
	else
	    System.out.println("count is negative");
            System.out.println("or equal to zero.");

        // This is probably what you meant to do.
	if (count > 0) 
	    System.out.println("count is positive.");
	else {
	    System.out.println("count is negative");
	    System.out.println("or equal to zero.");
	}

    }

}


/*

 Expression vs. statement

 An expression evaluates to a value, e.g.,

    - count, 345, (count > 3), true, "apple", 'A', etc. are all expressions.

 So, the following would make sense:

    System.out.println(345);
    System.out.println(count > 3);  // assuming count is a number
 

 A statement does not have a value.  It is is like a command.
 Examples:

    int i, j, k;

    System.out.println(...);

    if (...) { ... } else { ... };

 A statement does NOT evaluate to a value.  So, the following would
 not make sense:

    System.out.println(int x);
    System.out.println(System.out.println(23));

 */
