package day02;

public class If1 {
	public static void main(String[] args) {
		// If : 조건문
		// 현 상황에 맞춰서 내 프로그램의 동작을 결정하고 싶을 때
		// 예시 : 버스/성인/청소년/어린이 -> if 사용
	
		/*
		  if(조건) { // 조건이 맞을때 실행할 코드
		 
		  }
		 
		// 만약 조건이 맞지 않으면 if() 옆의 {} 코드는 실행 안됌
		*/
		
		int 나이 = 30;
		if(나이 >= 20) {
			System.out.println("성인 입니다.");
		}
	
		if(나이 < 20) {
			System.out.println("미성년자 입니다.");
			
		}
		
		// 여기로
	}
}
