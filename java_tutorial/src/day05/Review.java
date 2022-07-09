package day05;

import java.util.Iterator;

public class Review {
	public static void main(String[] args) {
		// 출력 syso
		System.out.println("출력");
		
		// 변수
		String str1 = "hello world";
		int num1 = 0;
		double dnum1 =  0.0;
		System.out.println(str1 + ", " + num1 + ", " + dnum1);
		
		// 조건문 if, switch
		if (num1 > 0) {
			System.out.println("양수");
		}else if(num1 == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		switch(num1) {
		case -1:
			System.out.println("-1");
			break;
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		default:
			System.out.println("그밖에");
		}
		
		switch(num1 % 2) { // %, / 할경우 범위로 나타낼수 있음
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
		}
		
		// 반복문 while, for (+ break, continue)
		int flag = 0;
		while(flag < 1) {
			System.out.println("while문");
			flag++;
		}
		
		for (int i = 0; i < 1; i++) {
			System.out.println("for문");
		}
		
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				//break;		// 반복문 종료
				continue;		// 1회성 취소
			}
			System.out.println(i+1+ "번");
		}
	}
}
