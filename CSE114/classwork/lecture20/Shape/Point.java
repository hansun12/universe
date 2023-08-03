public class Point {

    private double x;
    private double y;


    public Point () {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }
    
    public void translate (double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    public String toString () {
        return "(" + x + ", " + y + ")";
    }

}
