package Java_103;

import java.util.Scanner;

public class ChechPassfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mark ;
		System.out.print("nhập mark:");
		mark = sc.nextInt();
		System.out.println("mark :"+mark);
		if(mark<=50) {
			System.out.println("Pass");
		}else {
			System.out.println("Fall");
		}
		System.out.println("-------------");
		System.out.println("CHECK DON");
	}

}
