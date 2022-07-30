package day11;

import java.util.Scanner;

public class StringEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가격을 입력하세요 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		StringEx1 se1 = new StringEx1();
		se1.go(price);
	}
}

class StringEx1{
	
	// 천원 단위로 , 를 붙여주세요
	// 500 - > 500
	// 5000 -> 5,000
	// 20000 -> 20,000
	// 1000000 -> 1,000,000
	
	public void go(int num) {
		// num을 문자열로
		String str = Integer.toString(num);
		str = "" + num;
		
		if(num < 1000) {
			System.out.println(num);
		}
		else if(num < 10000) {
			// 앞뒤를 잘라서 사이에 , 를 붙여 합친다 substring
			String num1 = str.substring(0, 1);
			String num2 = str.substring(1, 4);
			System.out.println(num1 + "," + num2);
		} 
		else if(num < 100000) {
			String num1 = str.substring(0, 2);
			String num2 = str.substring(2, 5);
			System.out.println(num1 + "," + num2);
		}
		else if(num < 1000000) {
			String num1 = str.substring(0, 3);
			String num2 = str.substring(3, 6);
			System.out.println(num1 + "," + num2);
		}
		else if(num < 10000000) {
			String num1 = str.substring(0, 1);
			String num2 = str.substring(1, 4);
			String num3 = str.substring(5, 7);
			System.out.println(num1 + "," + num2 + "," + num3);
		}
		
	}
}