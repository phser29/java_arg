package book.chap02.exam01;

import java.util.Scanner;

public class DayOfYear {
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		
		for(int i=1; i<m; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		
		return days;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년: ");
			int year = scan.nextInt();
			System.out.print("월: ");
			int month = scan.nextInt();
			System.out.print("일: ");
			int day = scan.nextInt();
			
			System.out.printf("그 해 %d일째 입니다.\n", dayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1.예/0.아니오): ");
			retry = scan.nextInt();
		}while(retry == 1);
		
		System.out.println("종료 되었습니다.");
		
		scan.close();
	}
}
