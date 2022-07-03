package day02;

public class Review {
	public static void main(String[] args) {
		// 출력 syso -> Ctrl + F11 실행
		System.out.println("출력하고 싶은 말");
	
		// 변수 (저장공간)
		String 변수1;             // 자료형 = 변수형;
		변수1 = "저장할 말";        // 대입 (오른쪽 값 -> 왼쪽 공간)
		변수1 = 변수1;             // 대입 (변수1 안에 있는값 -> 변수1 공간)
		String 변수2 = "저장 말";   // 초기화 (선언 + 대입)
		
		// 변수 사용
		System.out.println(변수1);
		System.out.println("나의 말은 : "+변수2); 
		
		// 변수의 자료형
		int 정수형 = 456;
		double  실수형 = 3.14;
		String 문자열형 = "저장";
		char 문자 = 'A';
		boolean 참거짓형 = true;
		
		// 자료형1 : 의도를 명확화
		// 자료형2 : 개발자의 실수를 방지
		// 변수1 = 3.141592;
		
		// 연산자 (기능)
		// 더하기 + 
		// 빼기 - 
		// 곱하기 *
		// 나누기 /
		int result;
		result = 51 + 3;
		result = 33 - 1;
		result = 3 * 3;
		result = 10 / 2;
		result = 71 % 72;            // 나머지구하기 %
		System.out.println(result);
	}
}
