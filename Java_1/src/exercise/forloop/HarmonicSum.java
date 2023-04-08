package exercise.forloop;

public class HarmonicSum {
	public static void main(String[] args) {
		int n = 50000;
		double Sum2L= printLefttoRightSum(n);
		double Sum2R= printRighttoLeftSum(n);
		System.out.println(" Deference : %.15f" +(Sum2L-Sum2R));
		System.out.println();
	}

	private static double printRighttoLeftSum(int n) {
		double Sum =0.0;
		for (int i = n; i >= 1 ; i++) {
			Sum += (double) 1/i;
		}
		System.out.println("printRighttoLeftSum %.15f" +Sum);
		System.out.println();
		return Sum;
	}

	private static double printLefttoRightSum(int n) {
		double Sum =0.0;
		for (int i = 1; i <= n ; i++) {
			Sum += (double) 1/i;
		}
		System.out.println("printLefttoRightSum %.15f" +Sum);
		System.out.println();
		return Sum;
	}
}
