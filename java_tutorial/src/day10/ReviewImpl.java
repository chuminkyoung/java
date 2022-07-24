package day10;

public class ReviewImpl extends ReviewAdapter { 		// 상속받아서 사용
	static String str = "";					// static : 정적
	
	public static void main(String[] args) {
		Review r1 = new ReviewImpl();		// 인터페이스를 상속받으면 자료형을 인터페이스명으로 줄 수 있다.
		r1.func1();
		r1.func2(11);
		
		final int number = 12; 				// final로 만든 변수는 수정이 불가능
		// number = 33; 					// 불가능
	}

	@Override
	public void func1() {
		String str = "";					// 함수안에서 만든 변수는 함수 사용과 동시에 만들어지고 함수ㅜ가 종료되면 없어짐
		System.out.println("impl에서 구현");
	}
}

class Review2{
	public void  go() {
		ReviewImpl.str = "객체화없이 정적변수 대입/사용";
		// static변수는 프로그램 성능을 저하할 수 있으므로 사용을 최소화
	}
}