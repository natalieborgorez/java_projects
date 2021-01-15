// code by Natalie Borgorez

package point2d;

class Point2DA {
	private double x,y;
	
	public Point2DA() {
		
	}
	
	public Point2DA(double x, double y) {
		this.x = x; 
		this.y = y;
	}
	
	public Point2DA(Point2DA p) {
		this(p.x, p.y);
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}

	public double distance(double x, double y)
	{
		double dis = (this.x-x) * (this.x-x) + Math.pow(y-this.y, 2);
		return Math.sqrt(dis);
	}
	
	public double distance(Point2DA p) {
		return this.distance(p.x, p.y);
	}
	
	public double distance(Point2DA p1, Point2DA p2) {
		return p1.distance(p2);
	}
	
	public double distance() {
		return this.distance(0.0, 0.0);
	}
	
	public void ShowPoint() {
		System.out.println("("+x+","+y+")");
	}
	
	@Override
	public int hashCode() {
		int hash = 3;
		return hash;
	}
	
    @Override
	public boolean equals (Object obj) {
		if (obj == null)
			return false;
		else if (obj instanceof Point2DA) {
			Point2DA p = (Point2DA)obj;
			return (x == p.x) && (y == p.y);
		}
		return false;
	}

//public class TestPoint2DA {
	//public static void main(String args[]) {
		//Point2DA p1 = new Point2DA(2.0, 3.0);
		//Point2DA p2 = new Point2DA(10, 30);
		//Point2DA p3 = new Point2DA (4.0, 5.0);
		//Point2DA p4 = new Point2DA (20, 50);
		//System.out.println("The distance is "+p1.distance(p2));
		//System.out.println("The distance is "+p3.distance(p4));
	}
//}

//code by Natalie Borgorez
