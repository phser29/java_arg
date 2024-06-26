package book.chap04.exam01;

import java.util.Scanner;

public class EuclidGCD {
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 수의 최대 공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int x = scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int y = scan.nextInt();
		
		System.out.println("최대공약수는 " + gcd(x, y) +"입니다.");
		
		scan.close();
	}
}