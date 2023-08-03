import java.util.Random;
import java.util.Scanner;


public class Assert2 {
    public static int mystery(int n) {
	
	Random r = new Random();
	int a = r.nextInt(3) + 1;
	int b = 2;

	// Point A
	while (n > b) {
	    // Point B 
	    b = b + a;

	    if (a > 1) {
			n--;

			// Point C
			a = r.nextInt(b) + 1;
	    } else {
			a = b + 1;
			// Point D
	    }
	}

	// Point E
	return n;
    }

    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int x = console.nextInt();
	int result = mystery(x);
	System.out.println("Result=" + result);
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
//              n > b         a > 1          b > a
//
// Point A       S              S              S
//
// Point B		 A              S              S
//
// Point C .     S              A.             A
// 
// Point D .     S              N .            N      
//
// Point E .     N .            S .            S

//



