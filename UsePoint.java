package Ch8Points;
public class UsePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p = new Point(5, 2);
		//p.x = 3;
		//p.y = 8;
		p.translate(2, -1);
		System.out.println("(" + p.x + ", " + p.y + ")");
		System.out.print(p.distanceFromOrigin());

	}

}
