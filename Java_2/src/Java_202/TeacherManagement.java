package Java_202;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {

	public static void main(String[] args) {
		MathTeacher M = new MathTeacher("Teacher", "Hoa", "Math");
		MathTeacher M2 = new MathTeacher("Teacher", "Thoa", "Math");
		EnglishTeacher E = new EnglishTeacher("Teacher", "Thanh", "English");
		
		Teacher teacher[]= new Teacher[3];
		teacher[0]= M;
		teacher[1]= M2;
		teacher[2]= E;
		int number1 = 100, number2 = 20;
		for (int i = 0; i < teacher.length; i++) {
			System.out.println("----------TEACHER " + (i + 1) + "-------------");
			System.out.println("Colleage name: " + teacher[i].getCollegeName());
			System.out.println("Designation: " + teacher[i].getDesignation());
			if (teacher[i] instanceof MathTeacher) {
			System.out.println("Main subject: " + ((MathTeacher) teacher[i]).getMainSubject());
			 
			((MathTeacher) teacher[i]).toSchool();
			
			teacher[i].teach(i);
			System.out.println("num(num1+num2)="+MathTeacher.num(number1,number2)); 
			                                   
			
			     } else {
			        System.out.println("Main subject: " + ((EnglishTeacher) teacher[i]).getMainSubject());
			        
				        ((EnglishTeacher) teacher[i]).toSchool();
			
		        teacher[i].teach(i);
	        
			       ((EnglishTeacher) teacher[i]).translate("Hello", "Xin chao!");
		      }
				
		}
	}

}
