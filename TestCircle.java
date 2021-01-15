// code by Natalie Borgorez

package geometric_object;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1, c2, c3;
		c1 = new Circle();
		c2 = new Circle(3.0);
		c3 = new Circle(3.0, "red", true);
		
		c1.printCircle();
		c2.printCircle();
		c3.printCircle();
	}
}

//code by Natalie Borgorez
