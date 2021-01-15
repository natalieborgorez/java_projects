// code by Natalie Borgorez

package ch01;

import java.util.*;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Enter your grade: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(getGrade(a));
		sc.close();
	}
	public static char getGrade(int x) {
		if (x >= 0 && x < 60) return 'E';
		else if (x < 70) return 'D';
		else if (x < 80) return 'C';
		else if (x < 90) return 'B';
		else if (x < 100) return 'A';
		else return '0';
	    }
}

// code by Natalie Borgorez
