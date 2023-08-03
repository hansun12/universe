
public class MemoryRep {

    public static void modify (int x) {
        x = 20;
        System.out.println(x);
    }

    public static void modify2 (int[] bb) {
        // Line M
        bb[0] = 20;
    }

    // Swaps the values of x and y inside swap
    public static void swap (int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void swap2 (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void cut (int[] arr) {
        // Reassigning a value to arr is much like cutting
        // off the original value.
        //        arr = new int[200];
        arr = null;
    }

    public static void print (int[] aa) {
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();
    }


    // Talk about memory model here

    public static void main (String[] args) {
        int a = 2;
        modify(a);         // Line 1
        System.out.println("a = " + a);  // Line 2

        int[] aa = {10, 20, 30, 40};
        print(aa);
        modify2(aa);        // Line 3
        print(aa);          // Line 4

        int i = 20;
        int j = 30;
        swap(i, j);
        System.out.println("i = " + i + " j = " + j);
        
        swap(aa[2], aa[3]);
        print(aa);          // Line 5

        swap2(aa, 2, 3);
        print(aa);          // Line 6

        cut(aa);     // Line 7
        print(aa);   // Line 8

        aa = null;
        // print will run into a run-time error when you pass aa with
        // its null value.  Since null.length would not make sense.
        print(aa);

    }
    
}

/*
 Line 1:

   modify passes the VALUE of a in main to be bound to x in the
   function modify.  If the value of a in main was located in memory
   location 340, x in modify has no knowledge whatsoever about the 
   fact that the value of a was/is associated with the memory location
   340.  Whatever location the value of x happens to be located is
   where the value of x will be.  The only thing for sure is that a in
   main has the value 2 in some memory location and that x in modify
   also has the value 2 in some memory location different from the a's
   location.  Note that modify starts out with x having the value 2,
   then immediately changes it to 20.  At that point in time, a in
   main is still 2, x in modify is 20.  We changed the value of x in
   modify to 20, after that the function simply prints it without
   doing anything else.  This example demonstrates how a value is
   passed from one function, e.g., main, to another function, e.g.,
   modify in this case.  Since we are passing the VALUE of a, not
   the location of a, we call this kind of parameter passing mechanism
   "call by value" (as opposed to "call by reference").  If we were to
   pass the location of the variable rather than the value of the
   variable, we would call that kind of parameter passing mechanism
   'call by reference'.  If it was done by call by reference, the value
   of a in main immediately after modify returns would be 20, not 2.
   That is, Line 2 would print 20. But, JAVA does NOT support call by
   reference, so we would never see 20 in Line 2.

   If Java wanted to support call by reference in addition to call by
   value semantics in parameter passing, they would have had to come
   up with a different syntactic notation to distinguish call by
   value from call by reference.  For example, C and C++ use & in
   front of the parameter name to indicate that that parameter has
   the call by reference semantics.  We won't worry about it here.
   I wanted to mention this only because we will have to find a
   workaround in Java when we want to achieve the call by reference
   semantics using a call by value mechanism.  We use objects to do
   that and arrays are objects in Java.  So, using arrays, we can
   achieve it as we will see in another example in this file.

 Line 3:

   With the call to modify2 in Line 2 main passes an array aa
   containing {10, 20, 30, 40} to modify2.  Suppose the array aa in
   main is located in memory location 600 (to be more precise, the
   first element of aa is at memory location 600 and the other elements
   are following the first element in contiguous memory locations).
   Passing aa to modify2 means that main is actually passing the
   location of aa to modify2.  Another way of saying the same thing
   would be it is passing the reference to aa to modify2.  At the
   moment the call is made and when it is at Line M in execution,
   this would be the memory diagram showing only the variables that
   are directly involved in the call.

     main---------------------------------------------------+
     |    +-----+            600:                           |
     | aa | 600 |----------->+----+----+----+----+          |
     |    +-----+    +------>| 10 | 20 | 30 | 40 |          |
     |               |       +----+----+----+----+          |
     |               |                                      |
     |  ...          |                                      |
     +---------------|--------------------------------------+
                     |
     modify2---------|--------------------------------------+
     |               |                                      |
     |    +-----+    |                                      |
     | bb | 600 |----+                                      |
     |    +-----+                                           |
     |                                                      |
     +------------------------------------------------------+

   When you change the value of the array in modify2 and finishes
   the execution of modify2 and returns, the box labeled modify2
   in the above diagram will disappear and the change made will
   persist beyond the function call, thus the print call in Line 4
   would print 20, 20, 30, 40.  Terminology: aa and bb in the diagram
   are both object references into the array object located in
   600.  So, see the value in the box labeled - it is 600, which
   is the memory location where the array starts.  Any time you
   deal with an array, you are actually using a reference into
   the array and there is always this one level of indirection
   from the variable (e.g., aa) to the actual array object.

 Line 5:

   The print call in Line 5 will print 20, 20, 30, 40 for the same
   reason Line 2 printed 2.

 Line 6:

   The print call in Line 6 will print 20, 20, 40, 30 for the same
   reason Line 4 printed 20, 20, 30, 40.

 Line 8:

   The print call in Line 8 will still print 20, 20, 40, 30 because
   setting arr to a new array would not affect the value of aa in main.  

   The call to cut in Line 7 is worth looking into a little more in
   detail.  If setting the value of arr to a new array affected the
   value of aa (not the elements of aa, but the value of aa itself),
   then it would mean that Java supports call by reference.  Since
   the change to arr did not affect the value of aa itself in main,
   it is indeed done by call be value.

   Passing an array to another function means passing a reference 
   into the array to the function.  Since we are passing the reference
   using the call by value semantics of parameter passing mechanism,
   we often say that "Java passes references by value".  Note that 
   it is different from call by reference!  You may feel that we are
   dealing with a technicality here, but it is not.  It is a very
   important distinction that we understand, perhaps not at this level
   of your CS study in this course, but sooner or later if you continue
   to study computer science.  So, I will say this: if you did not
   quite understand the distinction, that is okay.  Just remember that
   Java only supports call by value, and Java achieves the effect of
   call by reference by passing object references in function calls.
   I told you that arrays are objects too.  We will soon talk about
   objects in detail.  One more thing: There is no way to achieve the
   effect of call by reference when you are passing a primitive data
   type value (e.g., int) in Java.  You need to wrap it as an object
   (e.g., array) and pass it if you need to achieve that effect with
   primitive type values.
   
 */
