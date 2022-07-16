package day07;

public class Class8 {
	public static void main(String[] args) {
		// 객체화 : 클래스명 객체명 = new 클래스명();
		Class8Ex c  = new Class8Ex();
		// 클래스명 객체명 = new 생성자();
		c.go();
	}
}

class Class8Ex{
	
	private String str1;
	
	// 생성자 : 객체화를 하는 순간 무조건 사용되는 함수
	// 함수이름과 똑같이 만들기 = 생성자
	Class8Ex(){
		setStr1("set을 먼저 써야지!");
	}
	
	// get : 사용
	public String getStr1() {
		return str1;
	}
	
	// set : 대입
	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public void go() {		// main()
		//setStr1("안녕하세요");
		System.out.println(getStr1());
	}
}