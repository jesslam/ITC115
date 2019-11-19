package Ch8Points;

public class UsePoint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2 p = new Point2();
		
		Point2 p2 = new Point2(7, 5);
		
		Point2[] points =  new Point2[2];
		
		points[0] = new Point2(2,3);
		points[1] = new Point2(4,3);
		
		for (Point2 point2 : points) {
			System.out.println(point2.toString());
		}
		
		//p.setX(19);
		//p.setY(25);
		
		System.out.println(p.distanceFromOrigin());
		System.out.println(p.getX());
		System.out.println(p.equals(p2));
		System.out.println(p2.toString());
	}

}
