import java.util.Scanner;

public class Assert1 {
    public static int mystery(Scanner console, int x) {
	System.out.print("Enter an integer: ");
	int y = console.nextInt();
	int count = 0;

	// Point A
	while (y < x) {
	    // Point B
	    if (y == 0) {
		count++;
		// Point C
	    }

	    System.out.print("Enter an integer: ");
	    y = console.nextInt();
	    // Point D
	}

	// Point E
	return count;

    }

    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	int x = 5;

	int count = mystery(console, x);
	System.out.println("Count=" + count);
    }

}
// Now, I've marked different points in the code with comments.
//
// The goal is to see what we can 'determine' from reading the code
// and asking questions about the values of variables.
//
// Look at each point in the code and consider these relationships.
// See if you can 'reason' out and determine if the assertion (relationship)
// is 'ALWAYS' true, 'SOMETIMES' true, or 'NEVER' true.

//
// Knowing which of these cases hold may not tell us the exact behavior
// of the code but it will help us 'characterize' the code so we can
// better understand it's operation.
//
// We will fill in this table during class so follow carefully and make
// sure you understand the thought process involved.
//
//              y < x         y == 0          count > 0
//
// Point A      S               S                 N
//
// Point B     A(if 통과해서)     S                 S (could be 0 or 1)
//
// Point C     A               A                 A
//
// Point D     S               S                 S
//
// Point E    N(while 안들어감)  S                 S
//

//



