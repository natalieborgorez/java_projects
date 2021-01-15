// code by Natalie Borgorez

package geometric_object_1;

abstract class GeometricObject implements Comparable<GeometricObject>{
	
	private String color = "white";
	protected GeometricObject() {}
	protected GeometricObject(String color) {
		this.color = color;
}

public String getColor() {
	return color;
} 

public void setColor(String color) {
	this.color = color;
}

@Override

public int compareTo(GeometricObject o){
	if (this.getPerimeter() > o.getPerimeter())
		return 1;
	else if (this.getPerimeter() < o.getPerimeter())
		return -1;
	else
		return 0;
} 

public String toString(){
	return "The colour is " + color + "\n";
}

public abstract double getPerimeter();
}