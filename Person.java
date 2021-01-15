// code by Natalie Borgorez

package person;

public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;

public Person() {
	}

public Person(String name, String address) {
	this.name = name;
	this.address = address;
	}

public Person(String name, String address, String phone, String email) {
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.email = email;
	}

public String toString() {
	return "Name: " + name + '\n'
			+ "Address: " + address + '\n'
			+ "Phone number: " + phone + '\n'
			+ "Email: " + email + '\n';
	}
}

//code by Natalie Borgorez
