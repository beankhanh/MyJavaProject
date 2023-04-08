package Java_102;

import java.util.Scanner;

public class MultindimensionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][]= new int[2][2];
//		arr[0][0]= 1;
//		arr[1][0]= 2;
//		arr[0][1]= 3;
//		arr[1][1]= 4;
//		System.out.println("arr[1][1]"+arr[1][1]);
//		System.out.println("số hàng ngang "+arr.length);
//		System.out.println("số cốt dọc "+ arr[0].length);
		//tính tổng 2 ma trận A,B
		
		Scanner sc = new Scanner(System.in);
		int m,n;
		do {
			System.out.println("nhập m:");
			m = sc.nextInt();
			System.out.println("nhập n:");
			n = sc.nextInt();
		}while(m<1||n<1);
		
		int A[][]= new int [m][n];
		int B[][]= new int [m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("nhập A["+i+"]["+j+"]=");
				A[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("nhập B["+i+"]["+j+"]=");
				B[i][j]=sc.nextInt();
			}
		}
		System.out.println("mảng A");
		for (int[] is : A) {
			for (int is2 : is) {
				System.out.print(is2+"  ");
			}
			System.out.println();
		}
		System.out.println("mảng B");
		for (int[] is : B) {
			for (int is2 : is) {
				System.out.print(is2+"  ");
			}
			System.out.println();
		}
		
		int C[][]= new int [m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.println("mảng C");
		for (int[] is : C) {
			for (int is2 : is) {
				System.out.print(is2+"  ");
			}
			System.out.println();
		}
	}

}
