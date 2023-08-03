
// Refer to the Java Documentation page on java.lang.String
// for the methods used in this example.  There are other methods
// in the class that you will find useful later.  Skim the list to see
// what else is available even if you don't use them right away.

public class StringTest {

    public static void main (String[] args) {

        String fruit = "orangea";
        System.out.println("fruit.length() = " + fruit.length());
        System.out.println("fruit.substring(1,3): " + fruit.substring(1,3));
        System.out.println("fruit.substring(2): " + fruit.substring(2));
        System.out.println("fruit.charAt(6): " + fruit.charAt(6));
        System.out.println("fruit.indexOf(fruit.charAt(6)): " +
                           fruit.indexOf(fruit.charAt(6)));
        
        String tree = "maple";
        System.out.println("tree.concat(fruit): " + tree.concat(fruit));
        System.out.println("tree.toUpperCase(): " + tree.toUpperCase());
        System.out.println("tree: " + tree);

        for (int i = 0; i < tree.length(); i++) {
            System.out.println("tree.charAt(" + i + "): " + tree.charAt(i));
        }
        
        /*
         * Equality testing with strings
         */
        String s1 = "Apple";  // s1 is a String constant
        String s2 = "Apple";  // so is s2
        System.out.println("\n s1 == s2: " + (s1 == s2));          // Line 1
        System.out.println("\n s1.equals(s2): " + s1.equals(s2));  // Line 2

        String s3 = new String("Apple");  // s3 is a String object // Line 3
        String s4 = new String("Apple");  // so is s4              // Line 4
        System.out.println("\n s3 == s4: " + (s3 == s4));          // Line 5
        System.out.println("\n s3.equals(s4): " + s3.equals(s4));  // Line 6
    }

}

/*
 * Comparing two strings using '==' and 'equals' are different.
 *
 * (1) '==' compares them by checking to see if they are actually located
 *     in the same (identical) memory location.
 *
 * (2) 'equals' compares them by checking to see if they have the same
 *     values regardless of where they are located in memory.
 *
 * Constants are considered to be in the same location in memory.  When
 * we consider an int value, say 251, we can view that there is only one
 * copy of 251 represented as an int and stored in one location regardless
 * of how many times we are using the number 251 in our program.
 * String constants are viewed the same way.
 *
 * Objects are different.  Remember that we create an object using the 'new'
 * operation?  When you use 'new', it creates a new object in some location
 * in memory.  So, s3 in Line 3 and s4 in Line 4 are two distinct objects
 * located in two different places in a region of memory named heap. So, the
 * test in Line 5 would return false since s3 and s4 are located in
 * different locations.  The test in Line 6 would however return true since
 * equals tests to see if they have the same value regardless of where they
 * are located.
 */

/* Exercise 1: Write a function that reverses given a string.  For example,
 * reverse("Apple") would return "elppA".
 *
 * Exercise 2: Write a function that counts the number of occurrences of
 * a character given a string and a character.  For example,
 * count("Apple", 'p') would return 2.
 */
