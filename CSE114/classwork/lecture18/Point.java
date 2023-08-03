
// public class Point implements Comparable<Point> {  // later

public class Point {  // for now

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


    /* Later
    public boolean equals (Object p) {
        if (!(p instanceof Point)) {
            System.out.println("Wrong object passed into equals in Point");
            return false;
        }
        return (x == ((Point)p).x) && (y == ((Point)p).y);
    }
    */

    // For now
    public boolean equals (Point p) {
        return (x == p.x) && (y == p.y);
    }


    public String toString () {
        return "(" + x + "," + y + ", " + (int)distanceToOrigin() + ")";
    }

    
    public double distanceToOrigin () {
        return Math.sqrt(x * x + y * y);
    }

    public int compareTo (Point p) {
        // See how I am comparing floating point numbers for equality
        // test.  Since it is hard to compare two real numbers for
        // exact equality, we usually compare them for equality by testing
        // if they are equal within a certain tolerance value.  So, here
        // we compute the difference between the two and take the absolute
        // value of it and compare it with a tolerance value of 0.000001.
        // Of course, you can decide what tolerarance value you want to
        // use depending on what precision you want.
        if (Math.abs(this.distanceToOrigin() -
                          p.distanceToOrigin()) < 0.000001) {
            return 0;
        }
        /* bad one
        if (this.distanceToOrigin() == p.distanceToOrigin()) {
            return 0;
        }
        */
        else if (this.distanceToOrigin() < p.distanceToOrigin()) {
            return -1;
        }
        else {
            return 1;
        }
    }

}
