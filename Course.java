// code by Natalie Borgorez

package student;

public class Course {
	private String name;
	private TestStudent[] stuList = new TestStudent[50];
	private int numberOfStudents = 0;
	
	public Course() {
		this.name = "noname";
	}
	
	public Course(String name) {
		this.name = name;
	}
	
	public Course(String name, TestStudent[] stuList, int numberOfStudents) {
		this.name = name;
		this.stuList = stuList;
		this.numberOfStudents = numberOfStudents;
	}
	
	public void setStuList(TestStudent[] stuList) {
		this.stuList = stuList;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	
	public void addStudent(TestStudent stu) {
		stuList[numberOfStudents] = stu;
		numberOfStudents++;
	}
	
	
	public String toString() {
		String stuList = "";
		for (int i = 0; i < this.numberOfStudents; i++) {
			stuList = stuList + this.stuList[i].toString();
		}
		return "Course Name = " + name + "\nStudent List " + stuList + "\nNumber of students = " + numberOfStudents;
	}
}

//code by Natalie Borgorez
