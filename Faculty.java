// code by Natalie Borgorez

package person;

public class Faculty extends Employee {
	private String officeHours;
	private int rank;

public Faculty() {
	super();
	}

public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate date, String officeHours, int rank) {
	super(name, address, phone, email, office, salary, date);
	this.officeHours = officeHours;
	this.rank = rank;
}

public String toString() {
	return super.toString() + "\n"
			+ "Office hours: " + officeHours + "\n"
			+ "Rank: " + rank + "\n";
}
}

//code by Natalie Borgorez
