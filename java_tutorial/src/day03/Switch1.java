package day03;

public class Switch1 {
	public static void main(String[] args) {
		int 숫자 = 2;
		
		switch(숫자) {
		case 0:
			System.out.println("숫자는 0입니다.");
			break;
		case 1:
			System.out.println("숫자는 1입니다.");
			break;
		case 2:
			System.out.println("숫자는 2입니다.");
			break;
		case 3:
			System.out.println("숫자는 3입니다.");
			break;
		default:
			System.out.println("일치하는 case가 없습니다.");
		}
	}
}
