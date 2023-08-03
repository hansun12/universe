public class Circle {

    private int radius;
    private Point center;  // Line 1
    //    private int x;  instead of these two lines we used Line 1
    //    private int y;

    public Circle (int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    // We could have written the previous constructor this way
    // instead, but this one is not as good as the previous one
    // from the standpoint of abstraction.
    public Circle (int radius, int x, int y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    public int getRadius () {
        return this.radius;
    }

    public Point getCenter () {
        return this.center;
    }

    public void setRaidus (int radius) {
        this.radius = radius;
    }

    public void setCenter (Point center) {
        this.center = center;
    }

    public double area () {
        return Math.PI * this.radius * this.radius;
    }

    public String toString () {
        // The next two lines will do the same. Do you see that?
        return "(" + this.radius + ", " + this.center + ")";
        // return "(" + this.radius + ", " + this.center.toString() + ")";
        // Also note that each object has its own toString doing its share.
    }

    // Note that I decided not to use UseCircle.java
    // Instead, I included main here directly.
    //
    public static void main (String[] args) {
        Circle c = new Circle(10, new Point(2, 3));

        // See how toString is invoked indirectly in the println call here.
        // toString used in two classes: Circle and Point.
        System.out.println(c);

        System.out.println(c.radius); // This would not have been possible
                                      // if main was in UseCircle.java.
                                      // So, try not to do things that would
                                      // not be possible if you used a main
                                      // in UseX.java.
                                      // Of course, it is okay to access a
                                      // field directly without using a getter
                                      // from a method (dynamic and static)
                                      // intended to be in Circle.
        
        System.out.println(c.getRadius()); // This is better!
                                           // That is, you should do only
                                           // the kind of things that you
                                           // would be able to do if
                                           // main was in UseCircle.java.
    }

}
