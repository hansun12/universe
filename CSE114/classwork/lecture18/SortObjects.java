package sort;

public class SortObjects {

    // Sorts the array of Points using selection sort algorithm.
    // If you want to make it so that it works with an array of
    // Objects, any kind of objects, this would not work.
    // We will see a way to do it later after we talk about interfaces,
    // Comparable interface in particular.
    public static void ssort (Point[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i]).compareTo(arr[j]) > 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(Point x[], int i, int j) {
        Point temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

    // returns the index of the array where p is found.
    //
    public static int search (Point[] arr, Point p) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]).compareTo(p) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    // Search all the points in arr that are 'greater than' p
    // and return them in an array.
    public static Point[] find (Point[] arr, Point p) {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]).compareTo(p) > 0) {
                size++;
            }
        }
        if (size == 0) {
            return null;
        }
        Point[] results = new Point[size];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]).compareTo(p) > 0) {
                results[index] = arr[i];
                index++;
            }
        }
        
        return results;
    }
    
    public static void main (String[] args) {

        final int SIZE = 5;
        Point[] points = new Point[SIZE];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(rand.nextInt(100), rand.nextInt(100));
        }

        ArrayTools.printArray(points, "\n\nBefore sorted:");
        
        ssort(points);

        ArrayTools.printArray(points, "\nAfter sorted:");
        
        // Now we can do searches as well . . .
        //
        System.out.println("\nIndex found: " + search(points, points[3]));

        Point[] points2 = find(points, points[0]);
        // if (!(points2 == null)) {
        if (points2 != null) {
            ArrayTools.printArray(points2, "\nAfter find:");
        }
        else {
            System.out.println("points2 array is empty. . . ");
        }
    }

}
