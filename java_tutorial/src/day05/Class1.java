package day05;

public class Class1 {
	// main 함수
	public static void main(String[] args) {
		// 더하기 1,2,3
		plus3();		// 숫자 3개를 더하는 기호
		//  + :  앞과 뒤 숫자를 더한다 -> 3개를 더할 수 없을까? 기호를 추가하지 않고
		// 너희가 마나들어서 써 -> 함수
	}
	int i = 0;
	//  plus3() : 한번에 3개를 더하기 해주는 기능
	static void plus3() {
		System.out.println(1+2+3);
	}
}

// 클래스 : 변수 + 함수, 초보자를 위해서
// 변수 : 저장공간
// 함수 : 사용자가 만드는 연산자, ()가 있음 == 기능
// 자료형 함수명(){}