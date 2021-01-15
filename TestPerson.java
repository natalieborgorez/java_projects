// code by Natalie Borgorez

package person;

public class TestPerson {
	public static void main(String[] args) {
		MyDate d1 = new MyDate(2015, 02, 25);
		Faculty f1 = new Faculty("Tom Jones", "8 Green Road, Birmingham", "+447136562635", "tomjones@gmail.com", "Red Office", 45500, d1, "8:00 - 17:00", 1);
		System.out.println(f1.toString());
		System.out.println(d1.toString());
	}
}

//code by Natalie Borgorez
