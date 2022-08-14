package day16;

public class _03_if {
	public static void main(String[] args) {
		// 조건문
		// if(){}
		// switch(){}
		
		// if~else if~else
		// switch~case~break
		
		int age = 30;
		if(age >= 20) {
			System.out.println("성인");
		}else if(age >= 0) {
			System.out.println("미성년자");
		}else {
			System.out.println("?");
		}
		
		switch(age / 10) {
		case 0:
			System.out.println("어린이");
			break;
		case 1:
			System.out.println("10대");
			break;
		case 2:
			System.out.println("20대");
			break;
		case 3:
			System.out.println("30대");
			break;
		default:
			System.out.println("그 이상");
		}
		
		// if : 일반적인 조건검사
		// switch : 조건검사 中 같은지 체크
	}
}
