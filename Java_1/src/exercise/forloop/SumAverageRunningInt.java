package exercise.forloop;

public class SumAverageRunningInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average = 0.0d;
		int sum = 0;
		int lowerbound=1;
		int upperbound = 100;
		for (int i = lowerbound; i <= upperbound; i++) {
			sum+=i;
		}
		average = sum/upperbound;
		System.out.println("average" + average);
		
	}

}
