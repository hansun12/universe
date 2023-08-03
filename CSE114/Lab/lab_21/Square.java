public class Square implements Shape {
	double sideLength;
	Point upperLeft;
	
	// Constructor. We only need x,y (upper left corner) and 1 side length.
	public Square(double x, double y, double sideLength) {
		this.sideLength = sideLength;
		this.upperLeft = new Point();
		this.upperLeft.translate(x, y);
	}

	// The following methods implement the required methods
	// for the Shape interface
	
	// Compute the area. 
	@Override
	public double area() {
		return sideLength * sideLength;
	}
	
	@Override
	public void translate(double dx, double dy) {
		upperLeft.translate(dx, dy);
	}

	@Override
	public void scale(double factor) {
		sideLength *= factor;
	}

	@Override
	public Box boundingBox() {
		return new Box(upperLeft.getX(), upperLeft.getY(), sideLength, sideLength);
	}
}
