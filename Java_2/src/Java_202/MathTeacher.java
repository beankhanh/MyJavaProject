package Java_202;

public class MathTeacher extends Teacher implements Actionable{
	private String mainSubject;

	public MathTeacher() {
	}

	public MathTeacher(String designation, String collegeName, String mainSubject) {
		super(designation, collegeName);
		this.mainSubject = mainSubject;
	}

	public String getMainSubject() {
		return mainSubject;
	}

	public void setMainSubject(String mainSubject) {
		this.mainSubject = mainSubject;
	}
	public void teach() {
		System.out.println("Teaching math subject:");
	}
	public static int num (int m , int n) {
		return (m+n);
	}

	@Override
	public void toSchool() {
		System.out.println("Math teacher go to school by car :");
		
	}

	@Override
	public String toString() {
		return "MathTeacher [mainSubject=" + mainSubject + "]" +super.toString();
	}
	

	
	

	

	

	
	

	

	

	

	
	

	

	

	

	

	

	

	
	
	
}
