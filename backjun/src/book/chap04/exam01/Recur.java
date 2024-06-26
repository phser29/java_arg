package book.chap04.exam01;

import java.util.Scanner;

import book.chap03.exam01.IntStack;

public class Recur {
//	static void recur(int n) {
//		if(n > 0) {
//			recur(n - 1);
//			System.out.println(n);
//			n = n - 2;
//		}
//	}
	
	static void recur(int n) {
		IntStack s = new IntStack(n);
		
		while(true) {
			if(n > 0) {
				s.push(n);
				n = n - 1;
				continue;
			}
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = scan.nextInt();
		
		recur(x);
		scan.close();
	}
}
