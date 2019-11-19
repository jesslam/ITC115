package Ch8Points;

public class Point {

	// fields
	int x;
	int y;

	// Constructs a new point with the given (x,y) location.
	// Special constructor method always matches the class
	public Point(int initialX, int initialY) {
		x = initialX;
		y = initialY;

	}

	// Returns the distance between this point and (0,0).
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}

	// Shifts this point's location by the given amount.
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}

}
