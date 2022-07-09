package day05;

import day01.Syso1;

public class Method1 {
	public static void main(String[] args) {
		myprint();
		myprint();
		
		add2(1,2);
		add2(1,1);
		add3(1,1,4);
		
		absMinus(-3,-2); 	// 1
		absMinus(3, -2); 	// 1
		absMinus(3,1); 		// 2
		absMinus(-3,1); 	// 2
		
		// return이 있을 경우 그 값을 변수에 담는다.
		int result = absMinus2(10, -4); 	// 6
		System.out.println(result);
	}
	
	// myprint 기호 : 안녕하세요 반갑습니다. 를 보여주는 기능
	static void myprint() {
		System.out.println("안녕하세요 반갑습니다.");
	}
	
	// + 와 동일한 기능
	static void add2(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	// add3 : 숫자 3개를 더하는 기능(연산자)
	static void add3(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
		System.out.println("===============");
	}
	
	
	// 기존의 -는 절댓값기능 엇음 => 직접 만들어 씀
	static void absMinus(int num1, int num2) {
		// num1 과 num2를 각각 절대값으로 만들어서
		// num1 - num2 를 출력
		//int abs1 = num1, abs2 = num2;
		if(num1 < 0 && num2 < 0) {
//			abs1 *= -1;
//			abs2 *= -1;
			num1 = -(num1);
			num2 = -(num2);
		}else if(num1 < 0) {
			num1 = -(num1);
		}else if(num2 < 0) {
			num2 = -(num2);
		}
		System.out.println(num1 - num2);
	}
	
	static int absMinus2(int num1, int num2) {
		System.out.println("===============");
		int abs1 = num1, abs2 = num2;
		if(abs1 < 0 && abs2 < 0) {
			abs1 *= -1;
			abs2 *= -1;
		}else if(abs1 < 0) {
			abs1 *= -1;
		}else if(abs2 < 0) {
			abs2 *= -1;
		}
		// System.out.println(abs1 - abs2);
		
		return abs1 - abs2; 		// return : 주는 것
	}
}

// 메소드 : 클래스 안에 있는 함수