package day03;

import java.util.Scanner;

public class If6 {
	public static void main(String[] args) {
		// 년, 월을 입력하면 몇일까지 있는지 알려주는 프로그램
		// 1,3,5,7,8,10,12 -> 31일
		// 4,6,9,11 -> 30일
		// 2 -> 28일, 윤년일때만 29일
		// 그 외 입력 -> "?"
		
		// 윤년공식 : 4로 나눠떨어지면서 100으로 나누어 떨어지지 않으면 윤년, 혹은 400으로 나눠 떨어진다면 윤년.
		
		// swith, if 중 쓰기
		// 결과 예시 : 2024년 2월은 29일까지 있습니다.
		
		// 년도 입력받고, 월을 입력받아서 몇일까지 있는지 보여주기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(year + "년 " + month + "월은 31일까지 있습니다.");
		}else if(month  == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println(year + "년 " + month + "월은 30일까지 있습니다.");
		}else if(month == 2) {
			if(year % 4 == 0 && year % 100 != 0 || year % 4 == 400) {
				System.out.println(year + "년 " + month + "월은 29일까지 있습니다.");
			}else {
				System.out.println(year + "년 " + month + "월은 28일까지 있습니다.");
			}
		}else {
			System.out.println("?");
		}
	}
}
