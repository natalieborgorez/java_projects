// code by Natalie Borgorez

package point2d;

class Circle 
{
	public static final double PI=3.14;
	private double radius;
	private Point2DA p;
	
	public Circle(){
		this(1, new Point2DA(0.0, 0.0));
	}
	
	public Circle(double radius, Point2DA p) {
		super();
		this.radius = radius;
		this.p = p;
	}
	
	public Circle(double radius, double x, double y) {
		this.radius = radius;
		this.p = new Point2DA(x,y);
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}
	
	public Point2DA getCenter() {
		return p;
	}
	
	public void setCenter(Point2DA p) {
		this.p = p;
	}
	
	public double getArea()
	{
		double area;
		area = Math.pow(this.radius, 2) * Math.PI;
		return area;
	}

	public double getPerimeter()
	{
		double perimeter;
		perimeter = 2 * Math.PI * this.radius;
		return perimeter;
	}
	
	@Override
	public String toString() {
		return "Test_Circle [radius =" +radius+ ", center =" + p.toString() + "]";
	}
	
	@Override	
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		else if (obj instanceof Circle) {
			Circle c = (Circle)obj;
			return (c.p.equals(this.p)) && (c.radius == this.radius);
		}
		return false;
	}
	
	public boolean isContain(double x, double y) {
		if (Math.sqrt(Math.pow(p.getX()-x, 2)+Math.pow(p.getY()-y, 2)) <this.radius)
			return true;
		else
			return false;
	}
	
	public boolean contains(Point2DA p) {
		double dis = this.p.distance(p);
		return dis < this.radius;
	}
	
	public boolean contains(Circle circle) {
		double dis = circle.p.distance(this.p);
		return (dis + circle.radius) < this.radius;
	}
	
	public boolean overlaps(Circle circle) {
		double dis = this.p.distance(circle.p);
		return (dis < (this.radius + circle.radius)) && dis + this.radius > circle.radius && dis + circle.radius > this.radius;
	}
	
//}

//public class TestCircle
//{
	//public static void main(String[] args) {
		//Circle myCircle = new Circle();
		//myCircle.setRadius(5);
		//System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		//myCircle.setRadius(myCircle.getRadius()*1.1);
		//System.out.println("The area of the circle of radius "+myCircle.getRadius()+" is "+myCircle.getArea());
		
	//}
}

//code by Natalie Borgorez
