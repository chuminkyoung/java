package day04;

public class For1 {
	public static void main(String[] args) {
		// int flag = 0;
		// while(flag){
		// syso(i);
		// flag++; }
		
		// for(){} : while과 동일하게 반복문
		// while 지저분했던 이유 : 1. 플래그 2. 조건(소괄호) 3. 코드 내부에서 플래그증감 
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 안녕하세요 5번
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}
}
