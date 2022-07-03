package day03;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		// 나이에 따라서 50대이상, 40대이상, 30대이상, 20대이상, 미성년자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		if(age >= 50) {
			System.out.println("50대이상");
		}else if(age >= 40) {
			System.out.println("40대이상");
		}else if(age >= 30) {
			System.out.println("30대이상");
		}else if(age >= 20) {
			System.out.println("20대이상");
		}else {
			System.out.println("미성년자");
		}
	}
}
