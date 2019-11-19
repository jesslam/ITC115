package Ch8Points;

public class Point2 {
	private int x; //private is an access modifier
	private int y;
	
	//Constructs a new point at the origin (0,0).
	public Point2() {
		this(0, 0); //calls Point(int,int) constructor
	}
	
	//Constructs a new point with the given (x, y) location.
	//pre: x >= 0 && y >= 0
	public Point2(int x, int y) {
		if (x < 0 || y < 0) {
			throw new IllegalArgumentException();
		}
		this.x = x;
		this.y = y;
	}
	
	//right click > source > Generate Getters and Setters
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//Returns the distance between this Point and (0, 0).
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	//Returns whether o refers to a point with the same (x, y)
	//coordinates as this point.
	@Override //this implies that we are overwriting a method
	//from the superclass
	public boolean equals(Object o) {
		if (o instanceof Point2) {
			Point2 other = (Point2) o;
			return x == other.x && y ==other.y;
			
		} else {  //not a Point object
			return false;
		}
	}
	
	@Override
	//returns a String representation of this point.
	public String toString() {
		return ("Point coordinates: (" + x + ", " + y + ")");
	}
	


}
