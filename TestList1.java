// code by Natalie Borgorez

package list;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TestList1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			//int a = Integer.parseInt(args[0]);
			//int b = Integer.parseInt(args[1]);
			System.out.println(a/b);
			sc.close();
		}
		catch (ArithmeticException e) {
			System.out.println("Catch arithmetic anomalies");	
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch array out of bounds exception");
		}
		catch (NumberFormatException e) {
			System.out.println("Catch number format exception");
		}
		catch (InputMismatchException e) {
			System.out.println("Catch input mismatch exception");
		}
		finally {
			System.out.println("Continue to run other code");
		}
	}
}

//code by Natalie Borgorez
