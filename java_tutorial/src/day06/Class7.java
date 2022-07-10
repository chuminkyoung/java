package day06;

public class Class7 {
	public static void main(String[] args) {

		// 홍길동은 한국에서 온 23살이다.
		// 아무개는 캐나다에서 온 22살이다.
		
		Person person1 = new Person();
		person1.set이름("홍길동");
		person1.set나라("한국");
		person1.set나이(23);
		
		Person person2 = new Person();
		person2.set이름("아무개");
		person2.set나라("캐나다");
		person2.set나이(22);
		
		System.out.println( person1.get이름() + "은 " + person1.get나라() + "에서 온 " + person1.get나이() + "살 이다." );
		System.out.println( person2.get이름() + "는 " + person2.get나라() + "에서 온 " + person2.get나이() + "살 이다." );
	}
}

// 클래스명 : Person
// 변수 : 이름, 나라, 나이
// 함수 : get, set

// getter/setter : 우클릭 -> source -> Generate getter and setter...

class Person {
	private String 이름;
	private String 나라;
	private int 나이;
	
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get나라() {
		return 나라;
	}
	public void set나라(String 나라) {
		this.나라 = 나라;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
}