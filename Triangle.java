// code by Natalie Borgorez

package geometric_object_1;

class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;

public Triangle() {
	this.side1 = 3.0;
	this.side2 = 4.0;
	this.side3 = 5.0;
}

public Triangle(double side1 ,double side2, double side3){
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3; 
}

public Triangle(String color,double side1 ,double side2, double side3){
	super();
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}

@Override

public double getPerimeter(){
	return side1 + side2 + side3;
}

@Override

public String toString(){
	return super.toString() + "The perimeter of the triangle is " + side1 + " "+ side2 +  " "+ side3 +"\n";

}

 

}

//code by Natalie Borgorez
