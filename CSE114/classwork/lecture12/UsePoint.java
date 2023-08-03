
public class UsePoint {

    public static void main(String[] args) {

        // Remember how we used java.util.Random?
        //   java.util.Random randgen = new java.util.Random();
        //   randgen.nextInt()

        // We are doing a similar thing here with Point.
        // Create a Point object by calling the constructor
        // with no argument and name it p0
        Point p0 = new Point();
        p0.setX(3);
        p0.setY(4);
        System.out.println(p0.getX());
        System.out.println(p0.getY());
        System.out.println(p0.distanceFromOrigin());

        // Create a Point object by calling the constructor
        // with two arguments and name it p1 this time.
        Point p1 = new Point(30, 40);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.distanceFromOrigin());

        Point p2 = new Point(300, 400);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        System.out.println(p2.distance(p1));
    }

}
