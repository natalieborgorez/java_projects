// code by Natalie Borgorez

package bill;

public class WaterBill extends Bill {
	private double[] rate = {5, 7, 9};
	public WaterBill(double volume) {
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
		if(volume > 0 && volume <= 180) {
			return rate[0] * volume;
		}
		else if(volume > 180 && volume <= 260) {
			return rate[0] * 180 + rate[1] * (volume - 180);
		}
		else {
			return rate[0] * 180 + rate[1] * 260 + rate[2] * (volume - 260);
		}
	}     
}

//code by Natalie Borgorez
