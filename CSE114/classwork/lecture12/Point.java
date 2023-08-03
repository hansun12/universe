
public class Point {

    private int x;
    private int y;

    /* Constructors
     *
     * This one taking no argument.
     * This is the default constructor.
     */
    public Point() {
        x = 0;
        y = 0;
    }

    // This constructor takes two arguments.
    public Point(int initX, int initY) {
        x = initX;
        y = initY;
    }

    /*
     * getters (aka readers)
     */
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /*
     * setters (aka writers)
     */
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    /*
     * some other method(s)
     */

    // Computes the distance of the current point object from the origin
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Computes the distance between the current point object and
    // another point object p.
    public double distance(Point p) {
        return Math.sqrt((x - p.getX()) * (x - p.getX()) + (y - p.getY()) * (y - p.getY()));
    }

}
