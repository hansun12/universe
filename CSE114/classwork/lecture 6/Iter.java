/*

There are several ways of expressing iteration in Java, but we will
study the while loop first.
   
- 'while' loops

  The syntax (format, grammar) is of the following form:

        while <test> <body>;

  <test> can be any legal boolean (logical) expression.
  <body> can be any statement, a single statement or a compound
  statement (i.e., a sequence of statements enclosed in a pair of
  curly braces).

  The semantics (meaning) of it is: repeat the <body> as long as
  <test> evaluates to true.  As soon as <test> evaluates to false,
  skip the body and move on to the next line that follows the last
  line of the while body.  That is, you evaluate <test> first.
  If the value is true, then do the <body> and come back to evaluate
  <test> again; otherwise skip the <body> and continue to the line
  following the loop.

  It is important to do something in the <body> part of the while
  loop that affects the <test>.  That is, you would want to change
  something in the <body> so that the <test> evaluates to false at
  some point and the control gets out of the loop.  Otherwise, your
  program will be stuck in an infinite loop.  In fact, here is a
  simple way of creating an infinite loop:

        while (true) {<dosomething>};

  For example,
     
        int i = 2;
        while (i > 0) { System.out.println(i); };

  The pattern of a while loop is as follows:

        <set up a loop control variable with an initial value>

        while (<test with the variable>) {
            <do something>
            <update the control variable so the loop will end
             eventually>
        }
        <whatever follows the loop comes here>

  The following two both creates an infinite loop.
         while (1 == 1) { ... } 
         while (true) { ... } 

*/

public class Iter {

    // This function has a logical error - fix it!
    // Precondition: n > 0
    public static int factorial (int n) {

        int result = 1;

        while (n > 0) {           // test part
                                  // beginning of body
            result = result * n;

        }                         // end of body

        return result;
    }

    // Example of an infinite loop
    // Use of 'break'
    // This function is written in a strange way.  Try to understand
    // the behavior of this function and the caller, i.e., main.  (see
    // what output is generated.)
    public static int infiniteLoop () {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int i;
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            i = scan.nextInt();
            if ((i % 7) == 0) {
                break;
            }
            else {
                sum = sum + i;
            }
        }
        return sum;
    }
    
    public static void main (String[] args) {
        System.out.println("factorial(6) = " + factorial(6));
        System.out.println("infiniteLoop = " + infiniteLoop());
    }

}
