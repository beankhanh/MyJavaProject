package Java301;

public class BasicRateTax {
	private static final double luong =1000.00;
	private static final double hesoluong =0.2;
	
	public double calcTax() {
		return luong*hesoluong;
	}
	
	public double calcTax(double luongcoban) {
		if(luongcoban<luong) {
			return calcTax();
		}
		return luongcoban*hesoluong;
	}
}
