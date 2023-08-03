
public class Sig {

    public static double sumOf3 (double x, double y, double z) {
        return x + y + z;
    }

    public static int sumOf3 (int x, int y, int z) {
        return x + y + z;
    }

    public static double sumOf3 (int x, double y, double z) {
        return x + y + z;
    }

    public static String sumOf3 (String x, String y, String z) {
        return x + y + z;
    }

    public static void main (String[] args) {

        System.out.println(sumOf3(11, 22, 33));     // Line 1

        System.out.println(sumOf3(11.11, 22.22, 33.33));

        System.out.println(sumOf3(11, 22.22, 33.33));

        System.out.println(sumOf3("11 ", "22.22 ", "33.33"));
    }

}

/*
 Things to note:

 How does Java know which sumOf3 it is calling in Line 1?

 Is the signature of each of the sumOf3 definitions unique enough
 to be distinguishable from the others?

 Does it matter if we rename x, y, and z in each of the functions
 to something else, for example, k, m, and n respectively or even
 all differently in each function as long as they are unique within
 each function?  Of course assuming that consistent changes are made
 in the body of each function with the new names used for parameters?

 We use the term "function name overloading" in situations like this.
 That is, the name sumOf3 has been overloaded with several different
 meanings and the signature tells which one is which.

 When we say the 'signature' of a function, it includes all of the
 following collectively:

   - name
   - return type
   - parameter list
     . the number of parameters
     . the type of each parameter

*/

