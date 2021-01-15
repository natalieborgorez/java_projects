// code by Natalie Borgorez

package geometric_object_1;

class Circle extends GeometricObject {
	
	private double radius;

public Circle() {
	this.radius = 10.0;
}

public Circle(double radius) {
	this.radius = radius;
}

public Circle(String color, double radius){
	super(color);
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

@Override

public double getPerimeter() {
	return 2 * radius * Math.PI;
}


public String toString() {
	return super.toString() + "The radius of the circle is " + radius + "\n";

}

}