public class Equality {

    public static void main(String[] args) {

        /*
         * Equality testing with integers
         */
        int i = 200;
        int j = 200;
        System.out.println("\n i == j: " + (i == j));  // obvious!


        Integer oi = new Integer(200);  // oi is an Integer object
        Integer oj = new Integer(200);
        

        // == compares if two objects oi and oj are located at the
        // same memory location.  Since each 'new' call creates an
        // object in a new place in memory, oi and oj would certainly
        // be in different locations.
        //
        System.out.println("\n oi == oj: " + (oi == oj));


        // equals tests if the objects referenced by oi and oj are
        // equal or not using their contents, not their locations in
        // memory.  Since they both reference an object containing
        // 200 in it, the test would result in true.
        //
        System.out.println("\n oi.equals(oj): " + oi.equals(oj));

    }

}
