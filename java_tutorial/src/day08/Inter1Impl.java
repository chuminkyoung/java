package day08;

public class Inter1Impl extends MyClass implements Inter1, MyInter{
	// MyClass 코드 복사 붙여넣기
	// implements 받을파일, 받을 클래스
	
	// 인터페이스를 상속(지정)받으면 인터페이스의 함수를 모두 완성해줘야함
	// implements 라는 것으로 상속을 받고 클래스에 빨간밑줄이 가면 마우스를 올려준다.
	// Add unimplemented methods 라는 것을 클릭해서 오버라이딩(재정의, 수정)한다.
	public static void main(String[] args) {
		// static : 우선순위 높음 -> this로 접근이 안됨
		// 아래 go(); 사용 못함
		Inter1Impl imp1 = new Inter1Impl();
		imp1.go();
		
		// interface를 왜 상속받냐
		Inter1 inter1 = new Inter1Impl();	// 자료형을 인터페이스로 통일할 수 있음 : 다형성
		inter1.go();
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 상속 완료!");
	}
}

class MyClass{
	
}

class MyClass2{
	
}

interface MyInter{
	
}