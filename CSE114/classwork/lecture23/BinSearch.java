public class BinSearch {

    // Binary search using a loop
    //
    public static int bsearch(int item, int[] array) {
        return bsearchAux(item, array, 0, array.length - 1);
    }

    // Finding x in a between the indices lo and hi
    //
    private static int bsearchAux(int x, int[] a, int lo, int hi) {

        int mid = (lo + hi) / 2;
        while (lo <= hi) {
            //            System.out.println(lo + " " + hi + " " + mid);
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }

            mid = (lo + hi) / 2;
        }
        return -1;
    }


    // Binary search using recursion
    //
    public static int bsearchRec(int item, int[] array) {
        return bsearchRecAux(item, array, 0, array.length - 1);
    }

    // Finding item in a between the indices low and high
    private static int bsearchRecAux(int item, int[] a,
                                     int low, int high) {
        if (low > high) {
            return -1;
        } else {
            int mid = (low + high) / 2;
            if (item < a[mid]) {
                return bsearchRecAux(item, a, low, mid - 1);
            } else if (item > a[mid]) {
                return bsearchRecAux(item, a, mid + 1, high);
            } else {
                return mid;
            }
        }
    }

    // To run this program do the following on the command line:
    //      > java Search size range
    // For example:
    //      > java BinSearch 20 100
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        int size = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);
        int[] ints = ArrayTools.randomArray(size, range);

        ArrayTools.printArray(ints, "\n\nBefore sorted:");

        long startSortTime = System.currentTimeMillis();
        // Selection.ssort(ints);  // selection sort
        // Insertion.isort(ints);  // insertion sort
        java.util.Arrays.sort(ints);  // quick sort from Java
        System.out.println("\n\nSorting Time: "
                + (System.currentTimeMillis() - startSortTime)
                + " milliseconds");
        ArrayTools.printArray(ints, "\nAfter sorted:");

        // Let's run bsearch before search2 so that we can abort if search2
        // takes too long - still with the measurements for bsearch...
        //
        long startBSearchTime = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            //bsearch(r.nextInt(range), ints);
	    int item = r.nextInt(range);
	    int res = bsearchRec(item, ints);  // Try this one too
	    if (res >= 0) {
		System.out.println("Found " + item + " at " + res);
	    } else {
		System.out.println("Did not find " + item );
	    }

        }
        System.out.println("\n\nBinary Search Time: "
                + (System.currentTimeMillis() - startBSearchTime)
                + " milliseconds");

        long startSearch2Time = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Search.search2(r.nextInt(range), ints);
        }
        System.out.println("\n\nSearch2 Time: "
                + (System.currentTimeMillis() - startSearch2Time)
                + " milliseconds");

    }

}


/*

 size = 100,000
 range = 10,000
 # of searches = 100,000
 
 Selection Sort took: 16,704 milliseconds
 Quick Sort took:         45 milliseconds

 search2 took          7,798 milliseconds
 bsearch took             32 milliseconds


 So, quick sort followed by binary search would be a good combination!

 
 Running time complexity:
 
 Selection sort and Insertion sort: O(n^2) running time complexity
 Quick sort: O(n log_2 n) running time complexity

 Linear search: O(n) running time complexity
 Binary search: O(log_2 n) running time complexity
 
*/
