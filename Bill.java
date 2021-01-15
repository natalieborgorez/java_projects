// code by Natalie Borgorez

package bill;

public abstract class Bill {
	
	public Bill() {
	}
	
	protected double volume; // can be seen by subclasses or package members
	
	public abstract double getBill(); // getting the bill which will depend on the volume
	
	  public Bill(double volume) {
		  
		this.volume = volume;
	}
}

// code by Natalie Borgorez
