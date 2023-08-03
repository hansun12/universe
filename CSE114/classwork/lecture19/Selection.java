// Let's supress some annoying warning messages related to generics
// for now.  We are not familiar with generics yet.
@SuppressWarnings("unchecked")

public class Selection {

    // Sorts the array using selection sort algorithm.
    // Note that if you have an array of objects of type C
    // then you can pass it to an array declared to be of
    // objects of type P where P is a supertype of C.
    // In this example, Comparable is a supertype of Point
    // and we can pass an array of Point objects to an
    // array of Comparable.  An added benefit would be to
    // call ssort with an array of some other type that inherits
    // Comparable as Point did.
    //
    // If we used Point[] in the header of ssort, what limitations would
    // it have? (that's what we did in Lecture 18)
    //
    // If we used Object[] in the header of ssort, what would that mean?
    //
    public static void ssort (Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            // find the smallest
            for (int j = i + 1; j < a.length; j++) {
                int comp = a[i].compareTo(a[j]);
                if (comp < 0) {
                    swap(a, i, j);
                }
            }
        }
    }

    private static void swap(Comparable x[], int i, int j) {
        Comparable temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

    // Returns the index of the array where obj is found.
    //
    public static int search (Comparable[] a, Comparable obj) {
        for (int i = 0; i < a.length; i++) {
            int comp = a[i].compareTo(obj);
            if (comp == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args) {

        final int SIZE = 5;
        Comparable[] points = new Comparable[SIZE];
        // Point[] points = new Point[SIZE];  // This would work as well.
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(rand.nextInt(100), rand.nextInt(100));
        }

        System.out.println(points[0].equals(points[1]));

        ArrayTools.printArray(points, "Before sorted:");

        ssort(points);

        ArrayTools.printArray(points, "After sorted:");

        // Now we can do search as well . . .
        //
        System.out.println("\nIndex found: " + search(points, points[3]));
    }

}
