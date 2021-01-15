// code by Natalie Borgorez

package bill;

public class GasBill extends Bill {
	private double rate = 2.28;
	
	public GasBill(double volume) {
		super(volume);
		this.volume = volume;
	}
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public double getBill() {
		return rate * volume;
	}            
}

//code by Natalie Borgorez
