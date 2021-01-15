// code by Natalie Borgorez

package geometric_object;

public class Circle extends GeometricObject {
	private double radius;

public Circle() {
	}

public Circle(double radius) {
	this.radius = radius;
	}

public Circle(double radius, String color, boolean filled) {
	super(color, filled);
	this.radius = radius;
	//this.setColor(color);
	//this.setFilled(filled);
}

@Override
public String toString() {
	return "Circle (" + "radius = " + radius + ")" + "\n"+super.toString(); 
}

public void printCircle() {
	System.out.println(this.toString()+"\nradius="+this.radius);
	}
}

//code by Natalie Borgorez
