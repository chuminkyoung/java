package day04;

import java.util.Scanner;

public class For4 {
	public static void main(String[] args) {
		// 아이디와 비밀번호 맞추기
		// 무한 반복
		String id = "id";
		String pw = "1234";
		Scanner sc = new Scanner(System.in);
		String id_sc, pw_sc;
		
		while(true) {
			System.out.print("아이디 입력 : ");
			id_sc = sc.next();
			if( id.equals(id_sc) ) {
				System.out.print("비밀번호 입력 : ");
				pw_sc = sc.next();
				if( pw.equals(pw_sc) ) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비번 다름");
				}
			}else {
				System.out.println("아이디 없음");
			}
		}
	}
}
