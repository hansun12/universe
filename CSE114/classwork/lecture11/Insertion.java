public class Insertion {

  public static void insertionSort (int[] a) {

    System.out.println("\nInsertion sort:");

    for (int i = 1; i < a.length; i++) {
      int key = a[i];
      int p = i;

      //  Shift the values larger than key to the right
      while ((p > 0) && (key < a[p - 1])) {
        a[p] = a[p - 1];
        p--;
      }
      a[p] = key;
    }

  }

  // Run this program like this:
  //
  //    prompt> java Insertion 20
  //
  public static void main (String[] args) {
    java.util.Random r = new java.util.Random();
    int size = Integer.parseInt(args[0]);
    int[] ints = ArrayTools.randomArray(size, 1000);

    ArrayTools.printArray(ints, "\n\nBefore sorted:");

    long startSortTime = System.currentTimeMillis();
    Selection.selectionSort(ints);  // selection sort
    // insertionSort(ints);  // insertion sort
    // java.util.Arrays.sort(ints);  // quick sort
    System.out.println("\n\nSorting Time: "
    + (System.currentTimeMillis() - startSortTime)
    + " milliseconds");

    ArrayTools.printArray(ints, "\nAfter sorted:");

  }

}
/*

Insertion sort performance:

  alee$ java Insertion 2000
  Sorting Time: 15 milliseconds

  alee$ java Insertion 20000
  Sorting Time: 64 milliseconds

  alee$ java Insertion 200000
  Sorting Time: 5730 milliseconds

  alee$ java Insertion 2000000
  Sorting Time: 627790 milliseconds

Quick sort performance:

  java Insertion 2000000     // used java.util.Arrays.sort(ints) in Insertion
  Sorting Time: 73 milliseconds

*/
