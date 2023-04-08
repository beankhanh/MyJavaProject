package Java_202;

public class Teacher {
	private String designation;
	private String collegeName;
	public Teacher() {
	}
	public Teacher(String designation, String collegeName) {
		super();
		this.designation = designation;
		this.collegeName = collegeName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void teach(int duration) {
	    System.out.println("Teaching in " + duration + " minutes");
	}

	@Override
	public String toString() {
		return "Teacher [designation=" + designation + ", collegeName=" + collegeName + "]";
	}
	
}
