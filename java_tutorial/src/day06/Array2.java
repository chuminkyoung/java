package day06;

public class Array2 {
	public static void main(String[] args) {
		// go() 을 사용해서 실행
		Array2Ex array2Ex = new Array2Ex();
		array2Ex.go();
	}
}

class Array2Ex{
	public void go() {
		// 카페 메뉴와 가격 출력
		
		// 아메리카노 : 1500원
		// 카푸치노 : 2500원
		// ...
		
		String menu[] = {"아메리카노", "카푸치노", "카페모카", "레몬에이드", "자몽에이드", "수박쥬스"};
		int money[] = {1500, 2500, 3500, 5500, 5500, 5000};
		int num[] = {1,2,3,4,5,6};
		
		// 배열갑 수정
		money[0] = 1900;
		
		// 반복문 길이는 카페메뉴 갯수와 가격의 갯수가 같기 때문에 둘중 하나만 해주면 됨
		System.out.println("======= 카페메뉴 =======");
		for (int i = 0; i < menu.length; i++) {
			System.out.println( num[i] + ") " + menu[i] + " : " + money[i] + "원");
		}
		System.out.println("======================");
	}
}