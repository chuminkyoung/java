package day10;

import java.util.Scanner;

public class Try3 {
	public static void main(String[] args) {
		MyClass3 mc3 = new MyClass3();
		//mc3.go();
		
		double result = mc3.divide(20,10);		// 20 % 10
		System.out.println(result);
		
		result = mc3.divide2(10, 0);				// 10 % 0 	==> 버그발생으로 프로그램 강제 종료
		System.out.println(result);
	}
}

class MyClass3{
	
	double divide(double num1, double num2) {
		double result = 0.0;
		if(num2 != 0) {					// num2가 0이면 나누기 x
			result = num1 / num2;		// 0으로 나누면 프로그램 버그 발생
		}else {
			System.out.println("0으로는 나눌 수 없습니다");
		}
		return result;
	}
	
	double divide2(double num1, double num2) {
		double result = 0.0;
		try {							// num2가 0이면 나누기 x
			result = num1 / num2;		// 0으로 나누면 프로그램 버그 발생
		}catch(Exception e) {
			System.out.println("0으로는 나눌 수 없습니다");
		}
		return result;
	}

	
	
	// 함수3개를 만들고 main 사용
	// 1. 스캐너의 nextInt()
	// 2. 스캐너를 사용해서 Integer.parseInt(sc.next()) 형변환
	// 3. 나누기
	
	// 예외처리작업
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("첫번째 숫자 입력 ");
		try {
			num1 = Integer.parseInt(sc.next());			// 버그발생 가능
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("29번째 줄 오류발생");
		}
		System.out.println(num1);
		
		System.out.print("두번째 숫자 입력 ");
		try {
			num2 = sc.nextInt();						// 버그발생 가능
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("38번째 줄 오류발생");
		}
		System.out.println(num2);
			
		// if(num2 != 0){} -> try{}
		try {
			num3 = num1/num2;							// 버그발생 가능
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("46번째 줄 오류발생");
		}
		System.out.println(num3);
		
		sc.close();
		System.out.println("프로그램 종료");
	}
	
}