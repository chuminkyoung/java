package day04;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 비밀번호 맞추기, 기회 5번
		Scanner sc = new Scanner(System.in);
		
		int pw = 1234;
		int pw_sc;

		for (int i = 0; i < 5; i++) {
			System.out.println("비밀번호 입력 : ");
			pw_sc = sc.nextInt();
			if( pw_sc == 1234 ) {
				System.out.println("통과");
				break;
			}else {
				System.out.println("틀림");
			}
		}
	}
}
