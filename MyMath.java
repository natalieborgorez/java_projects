// code by Natalie Borgorez

package ch01;

import java.util.Scanner;

public class MyMath {
	public static double computSum(int n) {
		int z = n * 2;
		return z;
    }
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner  sc = new Scanner(System.in);
		double z = computSum(sc.nextInt());
		System.out.println(z+" is your answer");
		sc.close();
	}

}

// code by Natalie Borgorez
