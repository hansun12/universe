/*               Object 
 *                 ^    ^
 *                 |     \
 *                 |      \
 *                 |       Comparable[I]
 *                 |       ^
 *                 |      /
 *                 |     /
 *                 Point
 *
 * We have not talked about generics (parameterized types)
 * and we won't.  An example of that is Comparable<Point>
 * here.  When you create a class that implements Comparable,
 * do it like we do here in Point.  When you take CSE 214, you
 * will learn more about generics.
 */

// public class Point implements Comparable {     // see compareTo below
public class Point implements Comparable<Point> { // to see the difference

    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }
    public int getY () {
        return y;
    }

    public void setX (int x) {
        this.x = x;
    }
    public void setY (int y) {
        this.y = y;
    }


    public boolean equals (Object p) {
        /*
        if (!(p instanceof Point)) {
            System.out.println("Wrong object passed into equals in Point");
            return false;
        }
        */
        return (x == ((Point)p).x) && (y == ((Point)p).y);
    }


    public String toString () {
        return "(" + x + "," + y + ", " + (int)distanceToOrigin() + ")";
    }


    public double distanceToOrigin () {
        return Math.sqrt(x * x + y * y);
    }

    // Can use this if you say Comparable<Point> in the header of this class.
    //
    public int compareTo (Point p) {
        if (Math.abs(this.distanceToOrigin() -
                     p.distanceToOrigin()) < 0.000001) {
            return 0;
        }
        else if (this.distanceToOrigin() < p.distanceToOrigin()) {
            return -1;
        }
        else {
            return 1;
        }
    }

    /*
     * Can use this if you say Comparable instead of Comparable<Point>
     * in the header of this class.
     *
     * You might ask why not the same applies to equals method?
     * Well, if you see the equals in Object, the signature of equals
     * shows the same that I am using above.
     * If you see the signature of compareTo in Comparable, however,
     * it shows the following:
     *      int compareTo (T o) { . . .}
     * You may not get the subtle differences between these two cases
     * for now, which is ok for now.
     * So, use it the way I did it here in Point.java.  That is, the one
     * I used above.  Not this one that is commented out.
     */
    /*
    public int compareTo (Object p) {
        if (Math.abs(this.distanceToOrigin() -
                     ((Point)p).distanceToOrigin()) < 0.000001) {
            return 0;
        }
        else if (this.distanceToOrigin() < ((Point)p).distanceToOrigin()) {
            return -1;
        }
        else {
            return 1;
        }
    }
    */
}
