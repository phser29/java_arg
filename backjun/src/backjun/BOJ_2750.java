package backjun;

import java.util.Scanner;

public class BOJ_2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j < arr.length; j++) {
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		
		for(int val :arr) {
			System.out.println(val);
		}
	}
}
