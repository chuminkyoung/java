package day04;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 대한민국 수도맞추기 만들기, 맞추면 break, 게임 종료하려면 0 입력
		
		Scanner sc = new Scanner(System.in);
		
		String 수도 = "서울";
		String 수도_sc;
		
		for (;;) {
			System.out.print("수도 입력 : ");
			수도_sc = sc.next();
			
			if(수도_sc.equals("0")) {
				System.out.println("끝");
				break;
			}
			
			if( 수도.equals(수도_sc) ) {
				System.out.println("통과");
				break;
			}else {
				System.out.println("틀림");
			}
		}
		
	}
}
