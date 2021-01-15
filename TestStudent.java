// code by Natalie Borgorez

package student;

public class TestStudent {
	private int StuNo;
	private String name;
	public TestStudent(){}
	public TestStudent(int StuNo, String name) {
		this.name = name;
		this.StuNo = StuNo;
	}

	public int getStuNo() {
		return StuNo;
	}
	
	public void setStuNo(int StuNo) {
		this.StuNo = StuNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return"\nStudent Number "+ StuNo +"\nStudent Name"+ name;
	}
}

//code by Natalie Borgorez
