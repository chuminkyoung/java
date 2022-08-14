package day16;

import java.util.Scanner;

public class _06_Class {
	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();
		System.out.println(mc1.getNum());
	}
}

class MyClass1{
	// 생성자 : 객체화시 사용되는 메서드
	MyClass1(){
		// 생성자는 클래스와 동일한 이름을 갖고있는 메서드이다
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자의 값은 ? ");
		int num = sc.nextInt();
		setNum(num);
	}
	
	// 메서드 : 클래스 안에 있는 함수
	// 접근권한제어자 : private, default, protected, public ...
	// 변수는 private, 메서드는 public, 상속이 필요할때만 private을 protected로
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	// 모든 메서드에는 클래스를 지칭하는 this가 숨겨져 있다.
	public void go(MyClass1 this) {
		this.getNum();
		this.setNum(1);
		this.num = 3;
	}
}