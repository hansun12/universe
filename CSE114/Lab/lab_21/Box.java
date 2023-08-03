// Bounding box class


// The bounding box of a geometic shape is the smallest rectangle
// that encloses the shape.

public class Box {

    private double xpos;
    private double ypos;
    private double width;
    private double height;

    public Box (double x, double y, double w, double h) {
        xpos = x;
        ypos = y;
        width = w;
        height = h;
    }

    public String toString () {
        return
            "BBox (x: " + xpos +
            ", y: " + ypos +
            ", w: " + width +
            ", h: " + height + ")";
    }

}
