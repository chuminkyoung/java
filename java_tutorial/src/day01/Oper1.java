package day01;

public class Oper1 {
	public static void main(String[] args) {
		// 연산자 (자바에서 제공하는 기능) Operator
		// +, -, ÷, × 등등을 연산자라고 부름
		int num;
		String str;
		// 더하기 +
		num = 3 + 2;                  // 숫자의 더하기
		str = "Hello " + "Java";       // 문자의 더하기
		// 빼기 -
		num = 3 - 2;
		// 곱하기 *
		num = 3 * 2;
		// 나누기 /
		num = 3 / 2;
		// 나머지 구하기 %
		num = 3 % 2;
		// 출력
		System.out.println(num);
		System.out.println(str);				
	}
}
