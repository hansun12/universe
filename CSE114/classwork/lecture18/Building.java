/*
 * Let's introduce compareTo to compare two building objects
 * for greater than, less than, or equal to comparisons.
 * We will see a better way of handling compareTo after we introduce
 * inheritance later, but for now this is good enough.
 */

// public class Building implements Comparable<Building> { // later

public class Building {   // for now

    private String name;
    private String addr;
    private int squarefoot;
    private int height;

    public Building (String name, String addr, int squarefoot, int height) {
        this.name = name;
        this.addr = addr;
        this.squarefoot = squarefoot;
        this.height = height;
    }

    public int getSquarefoot () {
        return this.squarefoot;
    }

    public int getHeight () {
        return this.height;
    }

    public String getName () {
        return name;
    }

    public String getAddress () {
        return addr;
    }

    public void setHeight (int height) {
        this.height = height;
    }

    public String toString () {
        return this.name + ", " + this.addr + ", " +
               this.squarefoot + ", " + this.height;
    }

    // Let's say that two buildings are equal if they have the same name
    // and address.
    public boolean equals (Building b) {
        return ((name.equals(b.name)) &&
                (addr.equals(b.addr)));
    }
    /* Later... after we discuss inheritance
    public boolean equals (Object o) {
        return ((o instanceof Building) &&
                (name.equals(((Building)o).name)) &&
                (addr.equals(((Building)o).addr)));
    }
    */
    
    // To compare objects being 'less than', 'equal to', or 'greater than',
    // we are introducing compareTo
    //
    // Let's choose to compare height when we want to see if one is
    // greater than the other in comparing two building objects.  You as
    // the designer of the class can choose to compare whatever you want
    // to compare.
    //
    // compareTo returns
    // a negative number if 'this' object is less than b2;
    // 0 if 'this' object is equal to b2;
    // a positive number if 'this' object is greater than b2.
    //
    public int compareTo (Building b2) {
        if (this.height < b2.height) {
            System.out.println("..............returning -1");
            return -1;
        }
        else if (this.height == b2.height) {
            System.out.println("..............returning 0");
            return 0;
        }
        else {
            System.out.println("..............returning 1");
            return 1;
        }
        // If we are using integers to compare, we can use a simpler
        // form like this:
        // return this.height - b2.height;
        // Since height in this example is an int, this would have
        // worked equally well.
    }

}
