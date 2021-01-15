// code by Natalie Borgorez

package geometric_object;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1, r2, r3;
		r1 = new Rectangle();
		r2 = new Rectangle(2, 5);
		r3 = new Rectangle(20, 35, "red", true);
		
		r1.printRectangle();
		r2.printRectangle();
		r3.printRectangle();
		
		System.out.println("\nThe perimeter of the 1st rectangle is " + r1.getPerimeter());
		System.out.println("The area of the 1st rectangle is " + r1.getArea());
		
		System.out.println("\nThe perimeter of the 2nd rectangle is " + r2.getPerimeter());
		System.out.println("The area of the 2nd rectangle is " + r2.getArea());
		
		System.out.println("\nThe perimeter of the 3rd rectangle is " + r3.getPerimeter());
		System.out.println("The area of the 3rd rectangle is " + r3.getArea());
		}
}

//code by Natalie Borgorez
