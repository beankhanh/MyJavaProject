package Java_103;

import java.util.Scanner;

public class CheckOddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number ;
		System.out.print("Enter value for number:");
		number = sc.nextInt();
		System.out.println("The number is :"+number);
		
		if(number %2 == 0) {
			System.out.println(number +":is Even");
		}else {
			System.out.println(number +":is Odd");
		}
		System.out.println("-------------");
		System.out.println("Bye");
	}
}
