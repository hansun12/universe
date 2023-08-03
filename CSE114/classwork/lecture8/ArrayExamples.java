package CSE114.classwork.lecture8;
public class ArrayExamples {

    /* Returns an array of n random integers.  The integers are
     * chosen from the interval [0..n)
     *
     * This example demonstrates how to create an array as well
     * as how to return an array from a function.
     *
     * Precondition: n > 0
     */
    public static int[] randomIntArray (int n) {
        int[] aa;
        aa = new int[n];
        // int[] aa = new int[n];  // same thing written in one line
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < n; i++) {
            aa[i] = rand.nextInt(n);
        }
        return aa;
    }


    /* Returns the largest integer in the non-empty array bb.
     *
     * This example demonstrates how to accept an array as a parameter
     * value passed from a caller of this function.
     * Precondition: bb is non-empty.
     */
    public static int largest (int[] bb) {
        int biggest = bb[0];
        for (int i = 1; i < bb.length; i++) {
            if (bb[i] > biggest) {
                biggest = bb[i];
            }
        }
        return biggest;
    }


    /* This example demonstrates how two functions communicate between
     * them using an array as a communication medium.  That is, one
     * function, the caller (main in our example here), passes an array
     * to another function, the callee (scale in our example here).
     * If the callee changes the values inside the array in its
     * body, the changes that were made in the callee are visible
     * (preserved) in the caller as well.  That is, the array is
     * shared between the caller and the callee.
     *
     * Note that the changes you are making to bb are preserved in
     * the array aa in main.  To understand this, try the memory
     * representation diagram we used.
     *
     * While the function scale is executing, there are two references
     * into the array in memory: one is aa from the main 'box' and
     * the other is bb from the scale 'box'.  The array itself is located
     * outside both functions' local memory areas.  That is, the array
     * is located inside a special region of memory called heap, not in
     * main or scale boxes on the run-time stack.
     * As soon as scale finishes its execution, the reference from bb
     * disappears because bb is a local variable inside the scale 'box',
     * but aa remains still pointing to the array object.  We will draw
     * these diagrams in class together.
     *
     * Alternatively, you could design scale so that it returns an
     * array.  And then change the call to scale in main so that it
     * expects an array to be returned from scale and uses the
     * returned value to reset it to aa.  That would be a rather
     * strange way to achieve the same effect.  Try it if you want.
     */
     public static void scale (int[] bb, int factor) {
        for (int i = 0; i < bb.length; i++) {
           bb[i] = bb[i] * factor;
        }
    }

    /*
     main---------------------------------------------------+
     |    +-----+            600:                           |
     | aa | 600 |----------->+----+----+----+----+          |
     |    +-----+    +------>| 10 | 20 | 30 | 40 |          |
     |               |       +----+----+----+----+          |
     |               |                                      |
     |  ...          |                                      |
     +---------------|--------------------------------------+
                     |
     scale-----------|--------------------------------------+
     |               |                                      |
     |    +-----+    |                                      |
     | bb | 600 |----+                                      |
     |    +-----+                                           |
     |                                                      |
     +------------------------------------------------------+

     for loop iter 1:
     main---------------------------------------------------+
     |    +-----+            600:                           |
     | aa | 600 |----------->+----+----+----+----+          |
     |    +-----+    +------>| 20 | 20 | 30 | 40 |          |
     |               |       +----+----+----+----+          |
     |               |                                      |
     |  ...          |                                      |
     +---------------|--------------------------------------+
                     |
     scale-----------|--------------------------------------+
     |               |                                      |
     |    +-----+    |                                      |
     | bb | 600 |----+                                      |
     |    +-----+                                           |
     |                                                      |
     +------------------------------------------------------+

     for loop iter 2:
     main---------------------------------------------------+
     |    +-----+            600:                           |
     | aa | 600 |----------->+----+----+----+----+          |
     |    +-----+    +------>| 20 | 40 | 30 | 40 |          |
     |               |       +----+----+----+----+          |
     |               |                                      |
     |  ...          |                                      |
     +---------------|--------------------------------------+
                     |
     scale-----------|--------------------------------------+
     |               |                                      |
     |    +-----+    |                                      |
     | bb | 600 |----+                                      |
     |    +-----+                                           |
     |                                                      |
     +------------------------------------------------------+


     main---------------------------------------------------+
     |    +-----+            600:                           |
     | aa | 600 |----------->+----+----+----+----+          |
     |    +-----+    +------>| 20 | 40 | 60 | 40 |          |
     |               |       +----+----+----+----+          |
     |               |                                      |
     |  ...          |                                      |
     +---------------|--------------------------------------+
                     |
     scale-----------|--------------------------------------+
     |               |                                      |
     |    +-----+    |                                      |
     | bb | 600 |----+                                      |
     |    +-----+                                           |
     |                                                      |
     +------------------------------------------------------+
    */


    /* Prints the elements in an array
     */
    public static void print (int[] aa) {
        for (int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);
        }
    }


    public static void main (String[] args) {

        int[] aa = randomIntArray(5);    // Line 1

        print(aa);                       // Line 2
        System.out.println();

        System.out.println("Largest:" + largest(aa));  // Line 3
        System.out.println();

        scale(aa, 2);
        print(aa);
    }

}

/*
        int[] aa = randomIntArray(5);    // Line 1

By looking at this line, what can we say about randomIntArray without
even peaking at the definition of randomIntArray?  Well, we know that
it would be expecting an argument of type int.  We also know that it
would be returning an array of int.


        print(aa);                       // Line 2

What can we say about this function print by looking at this line alone?
Well, it would expect to get an array of ints as argument because the type
of aa is an array of ints.  We also know that it would not return anything
useful because the return value of print is not being used here at all.
However, the fact that this caller does not do anything with the return
value does not necessarily mean that print would not return anything
useful.  It is because a return value can be ignored even if the callee
actually returns something useful.


        System.out.println("Largest:" + largest(aa));  // Line 3

What can we say about largest?  Well, it expects an array of int's,
and it would return something the + operator can use as one of its
operands.  That is somewhat unsatisfying because largest could return
almost any type of value: int, double, String, char, etc.  The return
value will be converted into a String value if it isn't already a String
value so that it can be concatenated with the string "Largest:".
You will need to see the definition (signature at least) of the callee to
know exactly what it actually expects and returns.

*/
