public class BinSearch {

  // Binary search using a loop
  // Precondition: array is sorted
  public static int bsearch (int item, int[] array) {
    return bsearchAux(item, array, 0, array.length - 1);
  }

  // finding x in a between the indices lo and hi
  private static int bsearchAux(int x, int[] a, int lo, int hi) {

    int mid = (lo + hi) / 2;
    while (lo <= hi) {
      //            System.out.println(lo + " " + hi + " " + mid);
      if (a[mid] == x) {
        return mid;
      }
      else if (a[mid] < x) {
        lo = mid + 1;
      }
      else {
        hi = mid - 1;
      }

      mid = (lo + hi) / 2;
    }
    return -1;
  }

  // > java Search size range
  public static void main (String[] args) {
    java.util.Random r = new java.util.Random();
    int size = Integer.parseInt(args[0]);
    int range = Integer.parseInt(args[1]);
    int[] ints = ArrayTools.randomArray(size, range);

    // ArrayTools.printArray(ints, "\n\nBefore sorted:");

    long startSortTime = System.currentTimeMillis();
    //      Selection.ssort(ints);  // selection sort from last time
    //      Insertion.isort(ints);  // insertion sort
    java.util.Arrays.sort(ints);  // quick sort from Java
    System.out.println("\n\nSorting Time: "
    + (System.currentTimeMillis() - startSortTime)
    + " milliseconds");
    // ArrayTools.printArray(ints, "\nAfter sorted:");

    System.out.println("3 is at: " + bsearch(3, ints));
    System.out.println("4 is at: " + bsearch(4, ints));


    // Let's run bsearch before search2 so that we can abort if search2
    // takes too long - still with the measurements for bsearch...
    //
    long startBSearchTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      bsearch(r.nextInt(range), ints);
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

 Selection Sort took: 17,110 milliseconds
 Quick Sort took:         38 milliseconds

 search2 took          3,725 milliseconds
 bsearch took             21 milliseconds


 Running time complexity:

 Selection sort and Insertion sort: O(n^2) running time complexity
 Quick sort: O(n log_2 n) running time complexity

 Linear search: O(n) running time complexity
 Binary search: O(log_2 n) running time complexity

*/
