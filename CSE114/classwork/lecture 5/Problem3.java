// There is one serious problem in this program.
// Fix it and run the program successfully.

public class Problem3 {

  public static void main (String[] args) {

    int a = 11;
    int y = 12;

    int b = foo(a,y);
    System.out.println(b);
  }

  public static int foo (int x, int y) {
    return x * y;
  }
  
}
