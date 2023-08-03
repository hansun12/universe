/*

Parameters: we have seen some of them.

Local variables: we have seen many of them also.  Any variable that
  is declared within a method is called a local variable, local to
  the method.

Non-local variables: we have not used them yet and won't be using them
  for a while.


Memory diagrams (stack diagrams): we have been drawing a box (cell)
  to represent a variable as a location in computer memory.  Each
  local variable as well as each parameter is represented as a box
  when we draw memory diagrams.  We will draw them as we examine
  this program in action.

  That is, we will see how memory locations are used to represent
  the variables in each method as we run this program from the
  beginning of the main to the end of the main while making function
  calls along the way if needed.  As you will see, the boxes will
  come and go as you execute the program.  Watch them carefully as I
  do them in class.

 */

public class StackExample {

    public static int square (int n) {
        return n * n;
    }


    public static int sumOfSquares (int n) {
        return square(n) + square(n);
    }

    public static int sumOfSumOfSquares (int x, int y) {
        int sos = sumOfSquares(x);
        int sos1 = sumOfSquares(y);
        return sos + sos1;
    }

    public static void main (String[] args) {
        int n = 1;
        int result = sumOfSumOfSquares(n, 2);
        System.out.println("result is " + result);
    }

}
