package day02;

public class If4 {
	public static void main(String[] args) {
		int num = 15;
		
		if (num > 65) {
			System.out.println("노약자 입니다.");
		}else if (num >= 20) {
			// 20이상
			System.out.println("성인 입니다.");
		}else if (num > 13) {
			// 13 초과 20미만
			System.out.println("청소년 입니다.");
		}else {
			System.out.println("어린이 입니다.");
		}
		
		int result = 100;
		
		if (result == 100) {
			System.out.println("만점! A+");
		}else if(result >= 90) {
			System.out.println("상위권 A");
		}else if(result >= 80) {
			System.out.println("중상위권 B");
		}else if(result >= 70) {
			System.out.println("중위권 C");
		}else if(result >= 60) {
			System.out.println("중하위권 D");
		}else if(result >= 50) {
			System.out.println("하위권 E");
		}else {
			System.out.println("낙제 F");
		}
		
	}
}
