// code by Natalie Borgorez

package geometric_object_1;

import java.util.Scanner;

public class Test {

public static void main(String[] args) {

	 Scanner input = new Scanner(System.in);

	GeometricObject[] object = { new Circle(input.nextDouble()),new Circle(input.nextDouble()),new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble()),new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble())};

	input.close();

	 double totalPerimeter = 0;

	 for(GeometricObject go:object)

	totalPerimeter += go.getPerimeter();

	 System.out.println("The total perimeter is " + totalPerimeter + "\n");

	 for(GeometricObject go:object)

	System.out.println(go.toString());

	java.util.Arrays.sort(object);

	 for(int i = 0; i < object.length; i++)

	System.out.println("The perimeter of the "+i+"object is "+object[i].getPerimeter());}

	}