/*
 A recursive function:

  - makes one or more recursive calls, 
  - has a base case where the recursive call(s) end(s), and
  - the value of at least one of the parameters is moving toward
    the base base, so that recursion can eventually terminate.
  
  In the examples below (both factorial and readAndDo) see:

  Line 1: the base case.  That is, when n is 0, you want to escape
          from the 'loop' (recursion) and finish the loop (recursion).

  Line 2: Recursive call is made.  Also one of the arguments in the
          recursive call is moving towards the base case, i.e., n is
          moving towards 0.

  Note that we are not using any looping constructs such as
  for, while, etc.   Recursion does it!
  
 */

import java.util.Scanner;

public class ReadnRec {

    // A familiar one first.
    //
    // Pre-condition: n >= 0
    public static int factorial(int n) {
        if (n == 0) {       // Line 1
            return 1;
        } else {
            return n * factorial(n - 1);  // Line 2
        }
    }


    public static int f2c(double fah) {
        return (int) ((fah - 32.0) * (5.0 / 9.0));
    }

    // Note that I did not add a pre-condition in this case
    public static void readAndDo(int n, Scanner scan) {
        if (n <= 0) {    // Line 1
            System.out.print("\nDone - Bye...");
        } else {
            System.out.print("\nEnter a Fahrenheit temperature (integer): ");
            int fahr = scan.nextInt();
            System.out.println(fahr + " in F = " + f2c(fahr) + " in C.");

            readAndDo(n - 1, scan);  // Line 2
        }
    }


    public static void main(String[] args) {

        System.out.println("factorial(6) = " + factorial(6));

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many times do you want to repeat? (integer): ");
        int n = scan.nextInt();
        System.out.println("\n n = " + n);
        readAndDo(n, scan);

        System.out.println("\n\nI hope that was enough...");
    }

}

