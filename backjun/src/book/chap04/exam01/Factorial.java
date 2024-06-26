package book.chap04.exam01;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if(n > 0) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int x = scan.nextInt();
		
		System.out.println(x+"의 팩토리얼은 " + factorial(x) + "입니다.");
		
		scan.close();
	}
}
