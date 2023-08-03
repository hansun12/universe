import java.util.Random;
import java.util.Scanner;


public class Assert3 {
    public static int mystery(Scanner console) {
	int prev = 0;
	int count = 0;
	System.out.print("Enter an integer: ");
	int next = console.nextInt();

	// Point A
	while (next != 0) {
	    // Point B
	    if (next == prev) {
		// Point C
		count++;
	    }
	    prev = next;
	    System.out.print("Enter an integer: ");
	    next = console.nextInt();
	    // Point D
	}

	// Point E
	return count;
    }

    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);

	int count = mystery(console);
	System.out.println("Count=" + count);
    }

}


// Again, study the code. Start to work out what values
// are possible based on:
//    1. arithmetic expresions
//    2. a conditional that is directly above a Point
//    3. a condition that must exist to exit a loop
//
//
// All of these 'analysis' techniques help understand the characteristics
// of the code and what values a variable may take on at different points
// in the code. What we are trying to figure out is with what certainty
// a variable may be in a certain range of values (as you can see, the assertions
// are simply conditionals that contstrain a variable to some value or range.)
//
// Look at each point in the code and consider these relationships.
// See if you can 'reason' out and determine if the assertion (relationship)
// is 'ALWAYS' true, 'SOMETIMES' true, or 'NEVER' true.
//
// We will fill in this table during class so follow carefully and make
// sure you understand the thought process involved.
//
//              next == 0    prev == 0     next == prev
//
// Point A         S             A               S
//
// Point B         N             S               S
//
// Point C		   N             N               A
//
// Point D         S             N               S
// 
// Point E         A             S               S
//

//

