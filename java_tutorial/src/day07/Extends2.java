package day07;

public class Extends2 {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.Info("홍길동", 22);
		
		Member m1 = new Member();
		m1.Info("아무개", 33);
	}
}

class Human{
	//private String name; 		// private : 내 클래스 안에서만 사용 가능
	//double weight;			// default : 내 패키지 안에서만 사용 가능
	//public double height;		// public : 모두 사용 가능

	protected int age;			// protected : 상속받은 곳까지는 허용
	protected String name;

	public void Info(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("이름은 " + this.name + "이고, 나이는 " + this.age);
	}
}

// 상속 : extends 기존의 클래스를 일부만 수정/추가해서 사용하고 싶을 때
class Member extends Human{
	// Human의 코드가 복붙되어 있음
	// 상속을 해서 수정하는 것 : 오버라이딩
	public void Info(String name, int age) {	
		this.name = name;
		this.age = age;
		System.out.println("회원의 이름은 " + this.name + "이고, 나이는 " + this.age);
	}
	
	// 함수 이름은 동일해도 인자()가 다르면 다른 함수로 취급 : 오버로딩
	public void Info() {
		
	}
	
	public void go() {
		System.out.println("실행");
	}
}