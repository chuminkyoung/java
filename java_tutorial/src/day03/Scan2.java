package day03;

import java.util.Scanner;

public class Scan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String id =  "id";
		int pass = 1234;
		
		System.out.print("아이디를 입력하세요 : ");
		id = sc.next();
		
		System.out.print("비밀번호를 입력하세요 : ");
		pass = sc.nextInt();
		
		if( !(id.equals("hello")) || !(pass == 1234) ) {
			System.out.println("없는 아이디거나 패스워드가 일치하지 않습니다.");
		}else {
			System.out.println("로그인 성공");
		}
		
	}
}
