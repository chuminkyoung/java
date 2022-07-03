package day03;

import java.util.Scanner;

public class Scan3 {
	public static void main(String[] args) {
		// 시험 통과여부 판별 프로그램
		// 대상 : 국어, 영어, 수학 + 총점
		// 국영수 전과목 각각 40점 이상이면서 
		// 합계가 150점 이상이면 통과
		// 그 외에는 불합격
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력:");
		int 국어 = sc.nextInt();
		System.out.print("영어점수 입력:");
		int 영어 = sc.nextInt();
		System.out.print("수학점수 입력:");
		int 수학 = sc.nextInt();
		
		int 총점 = 국어 + 영어 + 수학;
		
		if (총점 >= 150 && 국어 >= 40 && 영어 >= 40 && 수학 >= 40) {
			System.out.println("통과");
		}else {
			System.out.println("불합격");
		}
		
		
	}
}
