package book.chap02.exam01;

import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("사람 수: ");
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("height["+i+"]: ");
			height[i] = scan.nextInt();
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
		scan.close();
	}
}
