public class Search {

    // linear seach
    public static boolean search1 (int item, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (item == a[i]) {
                return true;
            }
        }
        return false;
    }

    // Still linear search, but a is assumed to be sorted in
    // ascending order, and we can take advantage of the fact
    // that it is sorted.
    // Precondition: a is sorted
    public static boolean search2 (int item, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == item) {
                return true;
            }
            else if (a[i] > item) {
                return false;
            }
            //      else {
            //        ;
            //      }
        }
        return false;
    }

    // prompt> java Search size range
    // prompt> java Search 100 50
    public static void main (String[] args) {
        java.util.Random r = new java.util.Random();
        int size = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);
        int[] ints = ArrayTools.randomArray(size, range);

        //        ArrayTools.printArray(ints, "\n\nBefore sorted:");

        long startSortTime = System.currentTimeMillis();
        //      Selection.ssort(ints);  // selection sort
        //        Insertion.isort(ints);  // insertion sort
        java.util.Arrays.sort(ints);  // quick sort from Java
        System.out.println("\n\nSorting Time: "
                           + (System.currentTimeMillis() - startSortTime)
                           + " milliseconds");
        //        ArrayTools.printArray(ints, "\nAfter sorted:");

        long startSearch2Time = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            search1(r.nextInt(range), ints);
            //            search2(r.nextInt(range), ints);
        }
        System.out.println("\n\nSearch2 Time: "
                           + (System.currentTimeMillis() - startSearch2Time)
                           + " milliseconds");

    }

}
