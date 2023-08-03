public class Selection {

    // This method is declared to be public since the designer of this
    // class intented that selectionSort will be available outside this class.
    // That is, selectionSort can be called from a method in a different class.
    public static void selectionSort (int[] a) {
      System.out.println("\nSelection sort:");

      // A simpler version
      for (int i = 0; i < a.length; i++) {
        // find the smallest and swap
        for (int j = i + 1; j < a.length; j++) {
          if (a[j] < a[i]) {
            swap(a, i, j);
          }
        }
      }

        /*
        // A slightly better (more efficient) version
	int min;
	for (int i = 0; i < a.length; i++) {
	    min = i;
	    // find the smallest
	    for (int j = i + 1; j < a.length; j++) {
		if (a[j] < a[min]) {
		    min = j;
		}
	    }
	    if (!(i == min)) {
                swap(a, i, min);
            }
	}
        */

    }

    // This method is declared to be private since it is intended to be
    // used only inside this class.  In fact, it is being used by selectionSort
    // which itself is a public method, which is okay.  The only imposed
    // meaning for private is that it is not visible outside this class.
    // Any method inside this class can call this.
    private static void swap(int x[], int i, int j) {
	int temp = x[i];
	x[i] = x[j];
	x[j] = temp;
    }

    // Run this program like this:
    //
    //    prompt> java Selection 20
    //
    public static void main (String[] args) {

	int limit = Integer.parseInt(args[0]);
	int[] ints = ArrayTools.randomArray(limit, 100);

	ArrayTools.printArray(ints, "\n\nBefore sorted:");

	long startSortTime = System.currentTimeMillis();
	selectionSort(ints);  // selection sort
	// isort(ints);        // insertion sort
        // java.util.Arrays.sort(ints);  // quick sort
	System.out.println("\n\nSorting Time: "
			   + (System.currentTimeMillis()
			      - startSortTime)
			   + " milliseconds");
	ArrayTools.printArray(ints, "\nAfter sorted:");

    }

}

/* Note that I am using printArray method defined in ArrayTools class
   like this: ArrayTools.printArray(...).

   This is analogous to using Math.sin(...).

   Note that I used 'private' in front of swap because I wanted to limit
   accesses to swap only to the methods in this class.  That is, if you
   try Selection.swap(...) from another class, it will be illegal, i.e.,
   Java compiler will complain.

   However, Selection.selectionSort(...) would be legal from another class as
   we will see from Search.java a little later because selectionSort is declared
   to be public.

   I will say more about public and private later, but this much should
   be understandable for now.
*/


/* Note that when you put multiple class definitions in a single file,
   the name of one of the classes must match the name of the file that
   contains the classes.  That one class must have the keyword 'public'
   in the line the class is defined, e.g., Selection has 'public'.
   All the other classes will NOT have the keyword 'public', e.g.,
   ArrayTools class definition does not start with the keyword 'public'.
 */
 class ArrayTools {

   // Returns an array of n random integers.  The integers are
   // chosen from the interval [0..range)
   public static int[] randomArray (int size, int range) {
     int[] a = new int[size];
     java.util.Random r = new java.util.Random();
     for (int i = 0; i < a.length; i++) {
       a[i] = r.nextInt(range);
     }
     return a;
   }

   public static void printArray(int[] a, String msg) {
     System.out.println(msg);
     for (int i = 0; i < a.length; i++) {
       System.out.print(a[i] + " ");
     }
     System.out.println();
   }

 }
