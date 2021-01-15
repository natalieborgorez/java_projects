// code by Natalie Borgorez

package geometric_object;

public class Rectangle extends GeometricObject {
		private double width, height;
		
public Rectangle() {
	}

public Rectangle(double width, double height) {
	this.width = width;
	this.height = height;
	}
		
public Rectangle(double width, double height, String color, boolean filled) {
	super(color, filled);
	this.width = width;
	this.height = height;
	}

public double getWidth() {
	return width;
	}

public double getHeight() {
	return height;
	}

public void setWidth(double width) {
	this.width = width;
	}

public void setHeight(double height) {
	this.height = height;
	}

public double getPerimeter() {
	return (width + height) * 2;
	}
public double getArea() {
	return width * height;
	}

@Override
public String toString() {
	return "Rectangle (" + "width = " + width +", height = "+ height +") \n"+super.toString();
}

public void printRectangle() {
	System.out.println(this.toString()+"\nwidth = "+this.width+"\nheight = "+this.height);
	}
}

//code by Natalie Borgorez
