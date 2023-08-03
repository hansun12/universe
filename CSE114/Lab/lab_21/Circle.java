/* We saw a version of Circle before, but this version is different.
 * This version 'implements' the Shape interface.
 * Does it match the Shape's 'signature'?  That is, does it implement
 * ALL the methods that are declared in Shape?
 * Yes, indeed (plus more, which is what you would expect)
 * as you can see below!
 *
 * If this class (Circle) did not implement all the methods declared
 * in Shape (i.e., if this class does not match the signature
 * of Shape; or differently put: if this class does meet the 'shapeness'
 * properties) what would the Java compiler do?  Well, it will complain.
 */

public class Circle implements Shape {

    public Point center;
    public double radius;

    public Circle (Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle (double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }
    
    public double area() {
    	return radius * radius * Math.PI;
    }
    
    public void translate (double dx, double dy) {
        center.translate(dx, dy);
    }

    public void scale (double factor) {
        radius = radius * factor;
    }

    public double circumference () {
        return 2 * Math.PI * radius;
    }

    public Box boundingBox () {
        return (new Box(center.getX() - radius,
                        center.getY() - radius,
                        2.0 * radius,
                        2.0 * radius));
    }

    public String toString () {
        return
            "Circle:\n radius:   " + radius +
            "\n center: " + center +
            "\n " + boundingBox();
    }

    // Use code (test code)
    //
    public static void main (String[] args) {

        Circle c1 = new Circle(0.0, 0.0, 10.0);
        System.out.println(c1);
        c1.translate(5.5, 7.5);
        c1.scale(3.0);
        System.out.println(c1);
        System.out.println("Circumference is: " + c1.circumference());
    }
}
