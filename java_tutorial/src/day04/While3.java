package day04;

public class While3 {
	public static void main(String[] args) {
		int i = 0;
		while(i < 3) {
			System.out.println("안녕하세요");
			System.out.println("반갑습니다");
			i++;
		}
		// 여기로
		i = 0;
		while(i < 3) {
			System.out.println(i + "번");
			i++;
		}
		
		int num = 1;
		// 1~10까지 출력
		while(num < 11) {			
			System.out.println(num);
			num++;
		}
		
		num = 10;
		while(num > 11) {
			// 10 ~ 1
			System.out.println(num);
			num--;
		}
	}
}
