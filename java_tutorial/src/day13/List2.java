package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
	public static void main(String[] args) {
		Lst2 lst2 = new Lst2();
		// lst2.go();
		
		Lst4 lst4 = new Lst4();
		lst4.go();
	}
}

class Lst2{
	public void go() {
		ArrayList<String> arr1 = new ArrayList<>();		// arr1 = {};
		arr1.add("아메리카노");			// arr1 = {"아메리카노"};
		arr1.add("카페라떼");			// arr1 = {"아메리카노","카페라떼"};
		arr1.add("카페모카");			// arr1 = {"아메리카노","카페라떼","카페모카"};
		arr1.add("카라멜마끼아또");		// arr1 = {"아메리카노","카페라떼","카페모카","카라멜마끼아또"};
		arr1.add(0, "에스프레소");		// 추가 arr1 = {"에스프레소","아메리카노","카페라떼","카페모카","카라멜마끼아또"};
		arr1.set(4, "오렌지주스");		// 수정 arr1 = {"에스프레소","아메리카노","카페라떼","카페모카","오렌지주스"};
		arr1.remove(4); 			// 삭제 arr1 = {"에스프레소","아메리카노","카페라떼","카페모카"};
		arr1.remove("카페모카");		// arr1 = {"에스프레소","아메리카노","카페라떼"};
		
		System.out.println(arr1.indexOf("에스프레소"));		// "에스프레소" 방번호 찾기 = 0
		System.out.println(arr1.get(0)); 				// 0번방에 있는 내용 알려줌 = "에스프레소"
		System.out.println(arr1.size()); 				// 현재 몇개의 방이 있는지 알려줌 = 3
		
		// 전체 조회
		for (int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.get(i) + " ");
		}
	}
}

class Lst4{
	public void go() {
		ArrayList<String> arr2= new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("추가할 항목 입력(0을 입력하면 종료) >> ");
			String str = scanner.next();
			
			if(str.equals("0")) {
				break;
			}else {
				arr2.add(str);
			}
		}
		
		for (int i = 0; i < arr2.size(); i++) {
			System.out.print(arr2.get(i) + " ");
		}
	}
}