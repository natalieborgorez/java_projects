// code by Natalie Borgorez

package geometric_object;
import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated = new Date();
	
	public GeometricObject() {
		
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	@Override
	public String toString() {
		return "Geometric Object(" + color +", filled=" + filled +", dateCreated=" + dateCreated;
	}
}

//code by Natalie Borgorez
