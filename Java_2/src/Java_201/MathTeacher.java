package Java_201;

public class MathTeacher extends Teacher{
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
		System.out.println("The parent's methord");
	}
	public int num (int m , int n) {
		return m+n;
	}

	@Override
	public String toString() {
		return "MathTeacher [mainSubject=" + mainSubject + "]" +super.toString();
	}

	
	
	
	
	

	

	

	
	

	

	

	

	
	

	

	

	

	

	

	

	
	
	
}
