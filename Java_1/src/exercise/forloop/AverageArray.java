package exercise.forloop;

public class AverageArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[] {3 , 5 , 9 , 12 ,6};
		int sum=0;
		int length= arr.length;
		double trungbinh = 0.0d;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		trungbinh = sum/length;
		System.out.println("trung bình tổng:"+trungbinh);
	}

}
