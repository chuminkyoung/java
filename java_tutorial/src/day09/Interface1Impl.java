package day09;

public class Interface1Impl implements Interface1{
	public static void main(String[] args) {
		Interface1Impl i1 = new Interface1Impl();
		i1.go();
	}

	@Override
	public void go() {
		// 인터페이스에 있는 함수를 재정의(수정)해줘야함
		System.out.println("인터페이스에서 상속받은 함수");
		
	}
}
