package day08;

// public class : 한 파일당 하나만 존재할 수 있음
public class Review {
	// main함수 : 실행시 프로그램의 시작점
	public static void main(String[] args) {
		ReviewClass rc = new ReviewClass();
		rc.go();
		
		Review2 r2 = new Review2();
		System.out.println(r2.myString());
	}
}

// class : 반, 꾸러미 (변수 + 함수)
class ReviewClass {
	private String str;
	
	// public String 을 사용할 경우 마지막 줄에 return 을 실행 해줘야함
	public String myString() {
		System.out.println("myString함수 실행");
		return "문자열";
		// return 뒤 : 죽은 코드
	}
	
	public void go() {
		str = myString();	// "문자열"
		System.out.println(str);
	}
}

// extends : 클래스를 복사 붙여넣기 (상속)
class Review2 extends ReviewClass{
	// ReviewClass의 코드가 복사 붙여넣기 되어있음
	// 추가
	private int num = 10;
	public int myNum() {
		System.out.println(num);
		return num;
	}
	// 수정 (오버라이딩 , 재정의)
	public String myString() {
		return "수정한 myString함수";
	}
}