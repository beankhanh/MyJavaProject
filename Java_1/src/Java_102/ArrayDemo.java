package Java_102;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= new int[4];
//		arr[0]=2;
//		arr[1]=0;
//		arr[2]=3;
//		arr[3]=9;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("số lượng phần tử mảng "+arr.length);
		System.out.println("phần tử thứ 2 là :" +arr[1]);
	}

}
