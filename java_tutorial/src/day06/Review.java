package day06;

public class Review {
	public static void main(String[] args) {
		// 객체화 : 클래스를 변수로 만든다. 이 변수는 '객체' (Object)라고 부른다.
		/// 클래스명 변수명 = new 클래스명();
		
		ReviewClass rc = new ReviewClass();
		rc.숫자입력(33);
		System.out.println(rc.숫자출력());
	}
}

// 클래스와 메서드
// 클래스 : 함수와 변수를 담은 꾸러미(반)
// ex) +, -, *, / :  사칙연산
// 변수(기능 사용을 위한 데이터) : 숫자 2개
// 함수(기능) : +, -, *, /
// 클래스(꾸러미) : 사칙연산

class ReviewClass{
	int num = 0;
	void 숫자입력(int num) {
		// () : 사용하는 곳에서 지정해줄 값
		// ex) * 곱하기 기호를 사용할 때 숫자 2개를 제공
		// 이와 마찬가지로 사용자 정의 기호인 함수도 () 안에 값을 제공해줘야 한다.
		this.num = num;			// this. : 내 클래스 안에 있는
	}
	
	int 숫자출력() {
		return num;				// ReviewClass 안에 있는
		// 메서드 내부에서 중복되는 이름이 없으면 자동적으로 클래스 내부에서 찾는다. (this. 생략가능)
		// return this.num;
	}
}