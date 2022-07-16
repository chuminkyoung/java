package day07;

public class Review {
	public static void main(String[] args) {
		// 객체화 : 클래스명 변수명 = new 클래스명();
		ReviewClass rc = new ReviewClass();
		
		// go함수 실행
		// 변수명.go();
		rc.go();
	}
}


class ReviewClass{
	// Class : 변수 + 함수 꾸러미(반)
	private int num[] = {1,2,3,4};
	
	public void go() {
		System.out.println("객체화 성공!");
		numChange();		// 메서드 사용
		numSelect();
	}
	
	// 메서드 정의
	public void numChange() {
		// 배열에 값 대입
		num[0] = 11;
		num[1] = 22;
		num[2] = 33;
		num[3] = 44;
	}
	
	public void numSelect() {
		// 배열을 전부 보기
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
