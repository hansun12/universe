/*
 * This example demonstrates two different ways of computing a value
 * to be printed as output using a function.
 *
 * (1) square1 computes when called the square of the number passed
 *     in and RETURNs the computed value.  See the return type of this
 *     function - it is 'int' as expected (Line 0).  It is up to the
 *     'caller' (main in this case) of the function to do whatever it needs
 *     to do, e.g., storing it into another variable, printing the
 *     computed value as output, or even use it for further computation.
 *     In this example it stores the returned value (Line 4) and prints it
 *     in the next line (Line 5).  We could have eliminated Line 4
 *     altogether and just embed the call to square1 in Line 5 directly
 *     to achieve the same result.
 *
 * (2) square2 computes when called the square of the number passed
 *     in AND PRINTS the value computed WITHOUT RETURNing anything as
 *     the return type ('void') indicates (Line 2).  The caller (main
 *     in this case) expecting nothing to be returned just calls the
 *     function (Line 6).
 *
 * So, when you want to COMPUTE something using an auxiliary function
 * (square1 and square2 would be considered auxiliary in this case) and
 * PRINT the result as output, there are two different ways to do it as
 * I demonstrated them above.
 *
 * In general, you introduce an auxiliary function to separate computation
 * into multiple logical units (square1 and main together are one such
 * example).  Often you compute something using an auxiliary function but
 * do not generate any output, but just use the computed value when it
 * is returned by the auxiliary function.  In the examples that you will
 * see in the next few lectures and in the next few problem sets you will
 * often use an auxiliary function to compute a value and print it as
 * output, but that is not always the case when you are using an auxiliary
 * function.  The notion of a function is more general than that.
 * That is, a function can be used to do whatever you want to do in that
 * function as long as it makes sense to isolate a piece of computation
 * into that function such as:
 *  (a) compute a value and print it as output
 *  (b) compute a value and return it
 *  (c) compute a value and print it and return it as well
 *  (d) compute a value and stores it in some other data structure (which
 *      we will not see for a while)
 *  (e) etc. etc. etc.  As I mentioned, anything you want to do, but let's
 *  not get carried away too far yet and focus on what we have studied so
 * far, which is the concept of a function.
 *     
 */

public class Func6 {

    public static int square1 (int n) {    // Line 0
	return n * n;                      // Line 1
    }


    public static void square2 (int n) {   // Line 2
	int sq = n * n;
	System.out.println("square of " + n + " is " + sq);  // Line 3

	// Equivalently, I could have written it in one line like this:
	// System.out.println("square of " + n + " is " + (n * n));
    }


    public static void main (String[] args) {

	int i = 22;

	int sq = square1(i);    // Line 4
	System.out.println("square of " + i + " is " + sq);  // Line 5

	square2(i);  // Line 6
    }

}
