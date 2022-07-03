package day02;

public class If2 {
	public static void main(String[] args) {
		// 버스를 탔습니다.
		// 카드를 찍네요.
		// 나이에 따라서 멘트를 다르게 해주세요.
		
		int num = 20;
		
		if (num >= 20) {
			System.out.println("성인 입니다.");
		}
		else if (num < 20 && num > 13) {
			System.out.println("청소년 입니다.");
		}
		else {
			System.out.println("어린이 입니다.");
		}
	}
}
