package day09;

public class Phone {
	public static void main(String[] args) {
		_5GPhone Phone = new _5GPhone();
		Phone.call(010);
		Phone.msg(0, "");
		Phone.net();
		Phone.lte();
		Phone.big();
		
	}
}

// 인터페이스1 : 상속을 여러개 하기 위해서
// 인터페이스2 : 반드시 만들어줘야하는 함수를 정해놓기 위해서
// 인터페이스3 : 다형성

interface KPhone{
	// 전화, 문자 함수 만들기를 강요
	void call(int num); 				// 전화
	void msg(int num, String str);	 	// 문자 
}

class _2GPhone implements KPhone{ 	// interface를 상속 받으려면 implements를 사용해야함
	// 2G폰을 만드는 사람은 전화와 문자기능을 빼놓을 수 없음

	@Override
	public void call(int num) {
		// 반드시 만들어줘야하는 기능1
		System.out.println(num + "에 전화합니다.");
	}

	@Override
	public void msg(int num, String str) {
		// 반드시 만들어줘야하는 기능2
		System.out.println(num + "에 문자를 보냅니다." + str);
	}
	
}


// 3G폰 : 전화 + 문자 + 인터넷
class _3GPhone extends _2GPhone {	// 클래스를 상속받으려면 extends를 사용
	public void net() {
		System.out.println("인터넷을 사용합니다.");
	}
}

// 4G폰 : 전화 + 문자 + 인터넷 + 속도(LTE)
class _4GPhone extends _3GPhone {
	public void lte() {
		System.out.println("속도");
	}
}

// 5G폰 : 전화 + 문자 + 인터넷 + 속도(LTE) + 빅데이터
class _5GPhone extends _4GPhone {
	public void big() {
		System.out.println("빅데이터 활용");
	}
}