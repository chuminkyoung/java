package day13;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
	public static void main(String[] args) {
		HMap1 hm1 = new HMap1();
		//hm1.go();
		
		MyDictionary md1 = new MyDictionary();
		md1.go();
	}
}

class HMap1{
	public void go() {
		HashMap<String, Double> hm1 = new HashMap<>();
		
		// 추가 put
		hm1.put("일", 1.0);  	// (키워드, 값)
		hm1.put("이", 2.0);
		hm1.put("삼", 3.0);
		hm1.put("사", 4.0);
		hm1.put("요건따로", 55.1);
		
		// get : 읽기
		// System.out.println(arr1.get(0));
		System.out.println(hm1.get("일"));  		// 키워드를 직접 적어서 가져올 수 있음
		System.out.println(hm1.get("이"));
		System.out.println(hm1.get("삼"));
		System.out.println(hm1.get("사"));
		System.out.println(hm1.get("요건따로"));
		
		if(hm1.containsKey("사")) {				// containsKey : 해당하는 키워드를 갖고있는지 검사
			System.out.println(hm1.get("사"));
		}
	}
}

class MyDictionary{
	// 나만의 사전 만들기
	private String search;
	public void go() {
		HashMap<String, String> hm1 = new HashMap<>();
		
		// put 사전 항목 추가
		hm1.put("red", "빨강");
		hm1.put("yellow", "노랑");
		hm1.put("green", "초록");
		
		// 스캐너를 통해서 입력된 키워드에 따른 값을 출력
		Scanner sc = new Scanner(System.in);
		
		
		// 있으면 get
		while(true) {
			System.out.println("색깔 입력 : ");
			search = sc.nextLine();
			
			if(hm1.containsKey(search)) {		// containsKey : 해당하는 키워드를 갖고있는지 검사
				System.out.println(search + " : " + hm1.get(search)); 
			}else {
				System.out.println("없음");
			}
		}
	
	}
}

// Map : 사전
// ArrayList : {1,2,3,4}
// Map : {"키워드1":"값1","키워드2":"값2"};