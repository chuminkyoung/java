package day04;

public class For2 {
	public static void main(String[] args) {
		// for 사용해서 5번 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
			System.out.println("반갑습니다");
		}
		
		// 반복문을 활용한 계산
		// {} : 범위, {}안에서 만들어진 변수는 {}가 끝나면 삭제됨
		// {} 밖에서 만들어진 변수는 {}가 끝나고 유지가 됨 (공간, 값)
		int 합산 = 0;
		// 1~9합산 == 45
		for (int i = 0; i < 10; i++) {
			합산 += i;
		}
		System.out.println(합산);
		
		// total 1~50까지의 합 : 1275
		int total = 0;
		for (int i = 0; i < 51; i++) {
			total += i;
		}
		System.out.println(total);
	}
}
