// code by Natalie Borgorez

package student;

import java.util.Scanner;

public class Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		TestStudent stu1 = new TestStudent(sc.nextInt(), sc.nextLine());
		TestStudent stu2 = new TestStudent(sc.nextInt(), sc.nextLine());
		TestStudent[] stuList = new TestStudent[100];
		stuList[0] = stu1;
		stuList[1] = stu2;
		Course c = new Course(name, stuList, 0);
		c.addStudent(stu1);
		c.addStudent(stu2);
		System.out.println(c.toString());
		sc.close();
	}
}

//code by Natalie Borgorez

