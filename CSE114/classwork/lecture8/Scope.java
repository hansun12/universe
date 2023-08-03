// There is a region of a program where a variable is visible.
// That is, the variable has a recognized meaning in that region.
// For example, the scope of the variable i in Line 1 below is
// entire main, whereas the scope of the variable j in Line 2
// is only within the while loop.
//
// So, when you DECLARE a variable, be sure to declare it in the
// right place/context worrying about the scope of the variable.

public class Scope {

    public static void main (String[] args) {

        int i = 1;        // Line 1

        for (i = 0; i < 3; i++) {
            // int i = 1;  // Add this line and see what happens.
            System.out.println("inside for i = " + i);
        }

        System.out.println("after for i = " + i);

        while (i < 7) {
            // int i = 1;  // Add this line and see what happens.
            System.out.println("inside while i = " + i);
            i = i + 1;

            int j = 0;    // Line 2
            System.out.println("inside while   j = " + j);
            j = j + 1;
        }

        System.out.println("after while i = " + i);
        // System.out.println("after while j = " + j);  // Uncomment this line and see what happens.

        double i = 2.3;  // not allowed in Java
    }

}
