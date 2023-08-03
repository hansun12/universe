package CSE114.classwork.lecture21;

public class Point {

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
        if (!(p instanceof Point)) {
            System.out.println("Wrong object passed into equals in Point");
            return false;
        }
        return
            (x == ((Point)p).x) &&
            (y == ((Point)p).y);
    }

    public String toString () {
        return "(" + x + "," + y + ", " + (int)distanceToOrigin() + ")";
    }
    
    public double distanceToOrigin () {
        return Math.sqrt(x * x + y * y);
    }

    // After we talk about Comparable interface, the heading of this
    // class will change for compareTo to work in a general way.
    // For an example of such, see Point.java in
    // sorting_objects_2/Point.java
    public int compareTo (Point p) {
        return ((int)(this.distanceToOrigin()) - (int)p.distanceToOrigin());
    }

}
