import java.util.Scanner;

public class Practice {

    static String name = "";

    static int add2(int a, int b) { return a + b; }
    static double greatestNumber(double a, double b) { return a > b ? a : b; }
    static String addStrings(String a, String b, String c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // 1
        int sum = add2(34, 56);
        System.out.println(sum);

        // 2
        double greatest = greatestNumber(54.6, 106.4);
        System.out.println(greatest);

        // 3
        String s = addStrings("Apple", "Banana", "Carrot");
        System.out.println(s);

        // 4
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        name = sc.nextLine();
        if (name.equals("song")) {
            System.out.println("It matches");
        }
        else {
            System.out.println("Does not match");
        }
        sc.close();
    }    
}
