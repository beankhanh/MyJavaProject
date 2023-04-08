package Java_202;

public class EnglishTeacher extends Teacher implements Actionable  {
	private String mainSubject;

	public EnglishTeacher() {
		super();
	}
	public EnglishTeacher(String designation, String collegeName, String mainSubject) {
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
		System.out.println("Teaching English subject:");
	}
	@Override
	public void toSchool() {
		System.out.println("English teacher go to school motobike:");
		
	}
	public String translate(String en, String vi) {
	        return en + " in Vietnamese " + vi;
    }
	@Override
	public String toString() {
		return "EnglishTeacher [mainSubject=" + mainSubject + "]"+super.toString();
	}
	

}
