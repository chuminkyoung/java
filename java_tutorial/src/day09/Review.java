package day09;

public class Review {
	public static void main(String[] args) {
		// main함수 : 시작
		
		// 다른 클래스에 있는 함수나 변수를 사용하기 위해서는 '객체화'라는 걸 해줘야한다.
		// 객체화 : 클래스명 객체명 = new 클래스명();
		// 객체 : 클래스를 자료형으로 갖고있는 변수, 자료형으로 쓰인 클래스의 변수와 함수를 사용할 수 있다.
		
		R1 r1 = new R1();
		r1.go();
		
		R2 r2 = new R2();
		r2.go();
	}
}

// class 클래스이름{} : 변수 + 함수
class R1{
	// 클래스 멤버변수
	protected String str;			// null -> 기본값
	private int integer;			// 0
	private double d; 				// 0.0
	
	// 생성자 : 함수인데 이름이 클래스 이름과 동일하다. 클래스 사용 전에 미리 해줘야할 작업을 자동으로 시키기 위해 제작
	R1(){
		// 클래스를 객체화할 때 사용되는 함수
		// 클래스를 사용하는 사람이 사전에 해줘야할 작업을 빼놓고 할 수 있기 때문에 추가한 개념
	}
	
	// 클래스 멤버함수(메서드) : ()가 있다.
	public void go() {
		// () : 사용하는 곳에서 받아올 값을 저장할 매개변수를 만들어놓기
		// {} : go라는 함수의 기능을 만드는 곳
		System.out.println("go를 사용했다.");
	}
}

// 상속 : 기존에 존재하는 클래스를 수정하지 않고 다른 클래스에 복사 붙여넣기해서 수정
class R2 extends R1{
	// R2클래스에 R1클래스가 복사 붙여넣기 됨
	// R : 자식, R1 : 부모(super)
	
	// 상속을 한 이유 : 기존 클래스를 수정/추가하기 위해서
	
	@Override
	public void go() {
		// 수정 == 오버라이딩(재정의)
		System.out.println("R2에 있는 go를 사용했다.");
		// super.go();		// super.go() : 부모의 go()를 사용
	}
	
	// 추가
	public void go(int num) {
		// 오버로딩 : 함수 이름은 같으나 매개변수가 다름
		System.out.println("숫자 한개를 입력해줘야하는 함수" + num);
	}
}
