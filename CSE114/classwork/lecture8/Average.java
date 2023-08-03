/*

- Arrays

  I will explain the basic ideas on arrays on the board in class rather
  than describing them here.

  The example in this file will show you how arrays are created and
  used in a Java program.

  Array is an example of a data structure much like an int is a data
  structure.  Int is a very simple one, whereas array is more
  complex.  When we encounter a new data structure, try to understand
  the following about the data structure:

     1. How to create an instance of the data structure

     2. How to use the instance created in two ways
        2.1. How do you write a value into the data structure?
             It is called 'write access'.
        2.2. How do you read a value out of the data structure?
             It is called 'read access'.

     3. How to destroy it when you are done using it (as you will see
        we don't need to worry about step 3 in Java unlike in some
        other languages like C++).

  One useful piece of information about arrays is: if array name is
  aaa, then aaa.length will give you the length of the array, i.e.,
  the number of elements that you could put into the array.  Note that
  it is not aaa.length(), but aaa.length.  That is, length is not a
  function.
 */

import java.util.Random;

public class Average {

    // Doing it with what we already know (i.e., without using an array).
    // You will see why this would be a terrible way to do it.
    public static void ave () {
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;
        int n4 = 40;
        int n5 = 50;
        int n6 = 60;

        double average = (n1 + n2 + n3 + n4 + n5 + n6) / 6.0;

        System.out.println("The average of those six integers is: " + average);
    }


    /* Using an array - case 1
     *
     * Creating an array with initial values in one step.
     *
     * This is useful when you already know exactly what elements you
     *   will include in the array at the time the array is created.
     *   Sometimes, you may not know the exact elements at the time
     *   an array is created.  We will see such cases below later.
     */
    public static void ave2 () {
        // Here we are creating an array of int's, i.e., the element type
        // of the array named aa is int.  The array aa contains the numbers
        // 10, 20, 30, 40, 50, and 60 in that order.
        // In this case we know not only the size of the array but also
        // each element of the array at compile-time, i.e., at the time
        // you write the program.
        // Pictorially, it would look like this in memory:
        //
        //           +----+----+----+----+----+----+
        //      aa : | 10 | 20 | 30 | 40 | 50 | 60 | (elements)
        //           +----+----+----+----+----+----+
        //             0    1    2    3    4    5    (index)
        //
        int[] aa = {10, 20, 30, 40, 50, 60};

        // You can access the individual elements using the notation used
        // below.
        double ave = (aa[0] + aa[1] + aa[2] + aa[3] + aa[4] + aa[5]) / 6.0;

        System.out.println("The average of those six integers is: " + ave);
    }

    /* Using an array - case 2
     * Creating an array without initial values, then assigning values
     * afterwards.
     * In this case we know both the size and elements of the array,
     * but creates the array with only size initially and add elements
     * afterwards.
     */
    public static void ave3 () {
        final int SIZE = 6;
        int[] aa = new int[SIZE];  // SIZE is the size of the array named aa

        aa[0] = 10;
        aa[1] = 20;
        aa[2] = 30;
        aa[3] = 40;
        aa[4] = 50;
        aa[5] = 60;

        double ave = (aa[0] + aa[1] + aa[2] + aa[3] + aa[4] + aa[5]) / 6.0;

        System.out.println("The average of those six integers is: " + ave);
    }


    /* Using an array - case 3
     * In this case we don't even know the size of the array that we create
     * at compile-time.
     * Neither the elements that will be included in the array at compile-time.
     * We get the size of the array being created at run-time when the
     * function is called.
     */
    public static void ave4 (int size) {

        int[] numbers = new int[size];  // size is not known until run-time

        /* Loops are very useful when dealing with arrays.
         * Let's use a 'while' loop first.
         */
        int i = 0;
        while (i < numbers.length) {  // Note that it's not numbers.length(),
            numbers[i] = i * i;       // i.e., length is not a function!
            i = i + 1;                // What is it then? It is an attribute
        }                             // named length of the array.  We will
                                      // talk more about it when we study
                                      // objects later.

        /* Let's now use a 'for' loop this time.
         * See which loop is more convenient between 'while' and 'for'.
         */
        int sum = 0;
        for (int j = 0; j < numbers.length; j = j + 1) {
            sum = sum + numbers[j];
        }

        System.out.println("The average of those " + size + " integers is: "
                           + (double)sum/size);

        /* Is it okay to declare j again although we already declared it once
         * in the for loop above?
         */
        int product = 1;
        for (int j = 0; j < numbers.length; j = j + 1) {
            product = product * (numbers[j] + 1); // adding 1 to avoid 0
        }

        /* What would happen if we changed the loop control variable j
         * to i in the next for loop, like this?

        for (int i = 0; i < numbers.length; i = i + 1) {
            product = product * numbers[i];
        }
	*/

        /* How about using i again as below without declaring it with int?

        for (i = 0; i < numbers.length; i = i + 1) {
            product = product * (numbers[i] + 1);
        }
        */
        System.out.println("The product of those " + size + " integers is: "
                           + product);
    }


    public static void main (String[] args) {

        ave();

        System.out.println();
        ave2();

        System.out.println();
        ave3();

        System.out.println();
        ave4(10);
    }
}
