/* Shape as an abstract class, not an interface!!!
 *
 * You would want to define it as an interface instead in this case.
 *
 * This is an example of what NOT TO DO!!!
 */

public abstract class Shape {

    public abstract void translate (double dx, double dy);
    public abstract void scale (double factor);
    public abstract Box boundingBox ();

}
