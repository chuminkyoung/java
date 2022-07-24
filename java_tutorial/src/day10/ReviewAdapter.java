package day10;

// 추상클래스
public abstract class ReviewAdapter implements Review {		// Review를 상속받아서 일부만 구현
	// 인터페이스는 {}가 무조건 없어야함
	// 추상클래스는 {}가 있어도 되고 없어도 됨
	// 추상클래스 : 인터페이스를 상속 받기 전 일부만 구현해서 상속하고 싶을때 추상클래스를 거침
	
	// func1과 func2중 func2만 먼저 완성하고 상속하고 싶을 때
	@Override
		public void func2(int num) {
			System.out.println(num + "를 받은 함수2");
		}
}
