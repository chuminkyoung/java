package day03;

import java.util.Scanner;

public class Scan1 {
	public static void main(String[] args) {
		// 출력 syso
		// 입력 Scanner
		Scanner sc = new Scanner(System.in);
		
		// 입력1
//		System.out.println("글자를 입력하세요 : ");
//		String 글자입력1 = sc.next();
//		System.out.println("숫자를 입력하세요 : ");
//		int 숫자입력1 = sc.nextInt();
		
		// 입력2
		System.out.println("글자 여러개를 입력하세요 : ");
		String 글자입력2 = sc.nextLine();  				// nextLine 은 next 랑 같이 못씀
		System.out.println("숫자를 입력하세요 : ");
		int 숫자입력2 = Integer.parseInt(sc.nextLine());
		
		// 입력받은 것 출력
		System.out.println(글자입력2);
		System.out.println(숫자입력2);
		
		sc.close(); 		// 입력종료
	}
}
