public class Recur {

    public static int square(int n) {
        return n * n;
    }

    public static int cube(int n) {
        return n * n * n;
    }

    public static boolean isEven(int n) {
        return ((n % 2) == 0);
    }


    // Computes n! = n * (n-1)!
    // 
    // Pre-condition: n >= 0
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    // Which is better between fact and fact2?
    // Better in what sense?
    //   - readability?
    //   - efficiency?
    //
    public static int fact2(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    // Computes 0 + 1 + 2 + ... + n
    // Pre-condition: n >= 0
    public static int sumTo(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumTo(n - 1);
        }
    }


    // Computes 0^2 + 1^2 + 2^2 + ... + n^2
    // Pre-condition: n >= 0
    public static int sumSquareTo(int n) {
        if (n == 0) {
            return 0;
        } else {
            return square(n) + sumSquareTo(n - 1);
        }
    }


    // Computes the square of even numbers and the cube of odd numbers
    // in the range [0..n] and sums them up.
    // Pre-condition: n >= 0
    public static int sumEvenSquareOddCubeTo(int n) {
        if (n == 0) {
            return 0;
        } else if (isEven(n)) {
            return square(n) + sumEvenSquareOddCubeTo(n - 1);
        } else {
            return cube(n) + sumEvenSquareOddCubeTo(n - 1);
        }
    }

    // Concatenates the numbers in reverse order.
    // For example, if n = 9, it returns 9876543210
    // If n = 13, it returns 131211109876543210
    // Pre-condition: n >= 0
    public static String concatReverseTo(int n) {
        if (n == 0) {
            return "0";
        } else {
            return n + concatReverseTo(n - 1);
        }
    }


    // Concatenates the numbers in forward order.
    // For example, if n = 9, it returns 0123456789
    // If n = 13, it returns 012345678910111213
    // Pre-condition: n >= 0
    public static String concatTo(int n) {
        if (n == 0) {
            return "0";
        } else {
            return concatTo(n - 1) + n;
        }
    }


    // Here is another way to write concatTo
    // Concatenates the numbers in forward order.
    // For example, if n = 9, it returns 0123456789
    // If n = 13, it returns 012345678910111213
    public static String concatTo2(int n) {
        return concatTo2Aux(0, n);
    }

    private static String concatTo2Aux(int from, int to) {
        if (from > to) {
            return "";
        } else {
            return from + concatTo2Aux(from + 1, to);
        }
    }

    // Here is yet another way to write concatTo
    // For example, if n = 9, it returns 0123456789
    // If n = 13, it returns 012345678910111213
    public static String concatTo3(int n) {
        return concatTo3Aux(0, n, "");
    }

    // We are accumulating the answer in result as we go.
    // Think about the 'shape' of computation of this function
    // compared with the 'shape' of computation of concatTo2Aux above.
    private static String concatTo3Aux(int from, int to, String result) {
        if (from > to) {
            return result;
        } else {
            return concatTo3Aux(from + 1, to, result + from);
        }
    }

    /* NOTE . . .
     * Have you noticed that there are no local variables in these
     * functions and no reference to non-local variables, either?
     * They only use formal parameters.
     *
     * When we need another local variable, rather than introducing it
     * as a local variable, we call another function with the variable
     * we wanted to create as a parameter into the function.  We then
     * call it with the initial value of the variable as the actual
     * argument for the parameter in the new function.  In concatTo3
     * we introduced three parameters in the new function named
     * concatTo3Aux: from, to, and result with initial values 0, n, ""
     * respectively.
     *
     * This is how you compute in a purely functional style.
     * I will say a little more about this in class.
     */


    // Returns n characters concatenated as a string.
    // getNOfC(5, 'A') -> AAAAA
    public static String getNOfC(int n, char c) {
        if (n == 0) {
            return "";
        } else {
            return c + getNOfC(n - 1, c);
        }
    }


    // Computes the reverse of digits for a given integer.
    // For example, given 123456789 it returns 987654321
    public static String reverseDigits(int n) {
        if (n <= 0) {
            return "";
        } else {
            return (n % 10) + reverseDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("sumTo(10) = " + sumTo(10));
        System.out.println("sumSquareTo(10) = " + sumSquareTo(10));
        System.out.println("sumEvenSquareOddCubeTo(10) = " +
                sumEvenSquareOddCubeTo(10));
        System.out.println("concatReverseTo(13) = " + concatReverseTo(13));
        System.out.println("concatTo(13) = " + concatTo(13));
        System.out.println("concatTo2(13) = " + concatTo2(13));
        System.out.println("concatTo3(13) = " + concatTo3(13));

        System.out.println("getNOfC(10, 'A') = " + getNOfC(10, 'A'));
        System.out.println("reverseDigits(123456789) = " +
                reverseDigits(123456789));

        System.out.println("concatTo2(20) = " + concatTo2(20));
    }

}
