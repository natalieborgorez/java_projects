// code by Natalie Borgorez

package point2d;

public class TestPoint {
	public static void main(String[] args) {
		Point2DA p1 = new Point2DA(1.0, 2.0);
		Point2DA p2 = new Point2DA(3.0, 4.0);
		Point2DA p3 = new Point2DA(1.0, 2.0);
		Point2DA p4 = new Point2DA(7.0, 8.0);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));

		Circle c1 = new Circle(1, 2, 6);
		Circle c2 = new Circle(1, 2, 5);
		Circle c3 = new Circle(1, 2, 6);
	
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.contains(p4));
		System.out.println(c1.contains(p2));
		System.out.println(c1.contains(c2));
		System.out.println(c1.contains(c2));

	}

}

//code by Natalie Borgorez

//code by Natalie Borgorez
