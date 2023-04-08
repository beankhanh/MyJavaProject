package Java301;

import java.util.Scanner;

public class TaxCollector {

	public static void main(String[] args) {
		double luongcoban;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập lương cơ bản");
		luongcoban = sc.nextDouble();
		
		BasicRateTax B = new BasicRateTax();
		double tax = B.calcTax(luongcoban);
		System.out.println("Luong là:"+tax);

	}

}
