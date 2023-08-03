// There is one serious problem in this program.
// Fix it and run the program successfully.

public class Problem4 {

  public static void main (String[] args) {

    int x = 11;
    int y = 12;

    int c = foo(x, y);
    System.out.println(c);
  }

  public static int foo (int x, int y) {
    x = x + 1;
    y = y * 2;
    System.out.println(x+","+y);
    return x + y;
  }


}
