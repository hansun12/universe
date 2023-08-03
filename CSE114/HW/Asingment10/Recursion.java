package CSE114.HW.Asingment10;

public class Recursion {
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a; 
        }
        return gcd(b, a % b);
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * power(x, -1);
    }

    public static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static String reverseString(String s) {
        if(s.length() == 0) {
            return s;
        }
        return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));

    }

    public static Boolean isPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        else return false;
    }

    public static void main(String[] args) {


    }
}
