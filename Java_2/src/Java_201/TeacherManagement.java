package Java_201;

public class TeacherManagement {

	public static void main(String[] args) {
		MathTeacher m = new MathTeacher("Teacher", "Anh", "Math");
		System.out.println(m);
		m.teach();
		System.out.println("tong 20+80 "+ m.num(20, 80));

	}

}
