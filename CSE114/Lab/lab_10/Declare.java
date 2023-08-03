public class Declare {

    public static int mul(int n, int factor) {
        int i = n;
        int j = factor;
        n = i + j;
        factor = n + n;
        return n + factor;
    }

    public static void main (String[] args) {

        int i;
        i = 2;

        int j = 3;

        int k;
        k = i * j;

        System.out.println("sum is: " + i + j + k);

        int s = 2;
        i = mul(i, s + k);
        j = mul(s, s);
        System.out.println("sum is: " + i + j + s);
    }

}
