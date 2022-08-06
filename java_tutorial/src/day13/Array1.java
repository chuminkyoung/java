package day13;

public class Array1 {
	public static void main(String[] args) {
		Arr1 ar1 = new Arr1();
		ar1.go();
	}
}

class Arr1{
	public void  go() {
		// 배열 : 같은 주제를 가진 변수들을 뭉쳐놓은 변수
		// ex : 카페메뉴들, 음식메뉴들, ...
		
		// 배열 선언(공간을 만드는 법)
		// 자료형 변수명[];
		String menu[] = {"라면","김밥","떡볶이","순대"};		// 4칸짜리 menu를 만들어서 값을 담음
		int price[] = new int[4]; 						// 4칸짜리 price 공간을 만듦
		
		price[0] = 3000;
		price[1] = 1000;
		price[2] = 2000;
		price[3] = 3000;
		
		// 배열을 사용하는 이유(장점) : 반복문을 통해서 배열 갯수가 많아도 한번에 사용할 수 있게 하기 위해서
		for (int i = 0; i < price.length; i++) {
			System.out.println(menu[i] + " : " + price[i]);
		}
		
		// 배열의 단점 : 수정이 쉽지 않음
		// ex : 값을 중간에 삽입, 배열 크기를 늘리기, 위치바꾸기
		
		String save = menu[2];		// 떡볶이 백업
		menu[2] = menu[3]; 			// 떡볶이가 있던 자리에 순대를 대입
		menu[3] = save; 			// 순대 자리에 백업한 값을 대입(떡볶이)
		
		int price_bk = price[2];
		price[2] = price[3];
		price[3] = price_bk;
		
		for (int i = 0; i < price.length; i++) {
			System.out.println(menu[i] + " : " + price[i]);
		}
		
		// 배열의 단점을 극복하고자 만든 배열클래스 : 컬렉션 (List, Set, Map)
	}
}