// code by Natalie Borgorez

package person;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate date;

public Employee() {
	}

public Employee(String name, String address, String phone, String email, String office, double salary, MyDate date) {
	super(name, address, phone, email);
	this.office = office;
	this.salary = salary;
	this.date = date;
	}

public String toString() {
	return super.toString() + "\n"
			+ "Office: " + office + "\n"
			+ "Salary: " + salary + "\n"
			+ "Date of employment: " + date.toString();
	}
}

//code by Natalie Borgorez
