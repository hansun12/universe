/*
 * This class contains some useful methods dealing with arrays.
 * Since we will be using this class in various future programs,
 * we will create it as a separate class.
 * Think of it as a library class that we created much like the
 * system-provided library classes such as Math, String, Random,
 * Scanner, etc.
 */

 public class ArrayTools {

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
