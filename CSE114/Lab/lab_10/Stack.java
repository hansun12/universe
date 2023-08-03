public class Stack {

    public static int foo (int n) {
        int j = n;
        n = n + 2;
        j = j + 3;
        return j + n;
    }


    public static int bar (int n) {
        int i = n * n;
        i = i * n;
        n = i;
        return n + n;
    }

    public static int sumFooBar (int x, int y) {
        int f = foo(x);
        int b = bar(y);
        return f + b;
    }

    public static void main (String[] args) {
        int n = 1;
        int m = 2;
        int result = sumFooBar(n, m);
        System.out.println(n + ", " + m + ", " + result);
    }

}
