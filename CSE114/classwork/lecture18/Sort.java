public class Sort {

    // This method is declared to be public since the designer of this
    // class intented that ssort will be available outside this class.
    // That is, ssort can be called from a method in a different class.
    public static void ssort (int[] a) {
        System.out.println("\nSelection sort:");

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    swap(a, i, j);
                }
            }
        }

        /* A slightly better (more efficient) version
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
    // used only inside this class.  Here, it is being used by ssort
    // which itself is a public method, which is okay.  The only imposed
    // meaning for private is that it is not visible outside this class.
    // Any method inside this class can call this.
    private static void swap(int x[], int i, int j) {
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

    public static void isort (int[] a) {
        System.out.println("\nInsertion sort:");
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int p = i;

            //  Shift the values larger than key to the right
            while ((p > 0) && (a[p - 1] > key)) {
                a[p] = a[p - 1];
                p--;
            }
            a[p] = key;
        }
    }

    // Run this program like this:
    //
    //    prompt> java Sort 20
    //
    public static void main (String[] args) {

        int size = Integer.parseInt(args[0]);
        int[] ints = ArrayTools.randomArray(size, 100);

        ArrayTools.printArray(ints, "\n\nBefore sorted:");
        
        long startSortTime = System.currentTimeMillis();
        // ssort(ints);  // selection sort
        isort(ints);        // insertion sort
        // java.util.Arrays.sort(ints);  // quick sort
        System.out.println("\n\nSorting Time: "
                           + (System.currentTimeMillis()
                              - startSortTime)
                           + " milliseconds");

        ArrayTools.printArray(ints, "\nAfter sorted:");
    }

}


