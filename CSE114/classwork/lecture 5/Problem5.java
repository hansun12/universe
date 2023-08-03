// Answer the questions below and verify your answers by executing the
// program.
//
// Before you run it with a Java compiler, see if there is anything
// wrong with this program.
//
// Also, what gets generated as output by this program?

public class Problem5 {

  public static void main (String[] args) {

    int x = 11;
    int y = 12;

    int c = foo(x, y);

    System.out.println(x);
    System.out.println(y);
    System.out.println(c);

  }

  public static int foo (int x, int y) {
    x = x + 1;
    y = y * 2;
    return x + y;
  }
  
}
