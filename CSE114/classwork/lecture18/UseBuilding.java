public class UseBuilding {

    public static void main (String[] args) {

        // Comparing two strings first.
        String s1 = new String("Apple");
        String s2 = new String("Orange");

        // We can use compareTo with String objects since the String
        // class has compareTo already defined in it.
        //
        int comp = s1.compareTo(s2);
        if (comp < 0) {
            System.out.println(s1 + " comes before " + s2);
        }
        else if (comp == 0) {
            System.out.println(s1 + " and " + s2 + " are equal.");
        }
        else {
            System.out.println(s1 + " follows " + s2);
        }

        // How do you compare two building objects?
        // For that see Building.java.  Remember we defined compareTo
        // in Building?
        //
        Building b1 = new Building("Adams", "850 Columbia", 20000, 300);
        Building b2 = new Building("Roberts", "848 Columbia", 30000, 200);

        // Compare them using compareTo now that we defined compareTo
        // for Building
        //
        System.out.println("\n\nComparing with compareTo:");

        comp = b1.compareTo(b2);
        if (comp == 0) {
            System.out.println("b1 and b2 are the same");
        }
        else if (comp < 0) {
            System.out.println("b1 is smaller than b2");
        }
        else {
            System.out.println("b1 is greater than b2");
        }

        // Change the height for Roberts so that compareTo would
        // return a different value this time.
        //
        System.out.println("\n\nComparing with compareTo once more with 300:");
        b2.setHeight(300);

        comp = b1.compareTo(b2);
        if (comp == 0) {
            System.out.println("b1 and b2 are the same");
        }
        else if (comp < 0) {
            System.out.println("b1 is smaller than b2");
        }
        else {
            System.out.println("b1 is greater than b2");
        }

        System.out.println("\nLet's try something that is not going to work:");
        // I commented out the following line, but am leaving it in
        // for you to see
        //
        // comp = b1.compareTo(s2);

    }

}
