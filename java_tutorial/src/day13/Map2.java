package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		HM2 hm2 = new HM2();
		//hm2.go();
		
		Nations nt = new Nations();
		nt.go();
	}
}


class Nations{
	private String str;
	
	HashMap<String, String> hm = new HashMap<>();
	public void go() {
		hm.put("한국", "서울");
		hm.put("영국", "런던");
		hm.put("미국", "워싱턴");
		hm.put("중국", "베이징");
		hm.put("일본", "도쿄");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("어느 나라 수도가 궁금하신가요?(0 입력은 종료) >> ");
			// 나라를 전체 보여주기
			// == , != : 기본 자료형 비교할 떄 int double boolean

			// .equals : 자바 클래스 자료형을 비교할 떄 String
			// ex) String str = "";
			// str.equals() --> str 과 (내용) 같은지 비교
			// !(str.equals()) --> str 과  (내용) 이 다른지 비교
			
			System.out.println(hm.keySet()); 
			
			// 나라를 입력받아서
			System.out.println("나라 입력 : ");
			str = sc.next();
			
			// 수도를 알려주기
			if (str.equals("0")) {
				System.out.println("종료");
				break;
			}else if(!(hm.containsKey(str))) {
				System.out.println("없음");
			}else if(hm.containsKey(str)) {
				System.out.println(str + " : " + hm.get(str));
			}
		
		}
	}
}


class HM2{
	public void go() {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("아메리카노", 1500);			// key, Value
		hm.put("카페라떼", 2500);
		hm.put("카페모카", 2500);
		hm.put("카라멜마끼아또", 3500);
		
		System.out.println(hm.containsKey("아메리카노"));	// 해당하는 키가 있는지 검사
		System.out.println(hm.containsValue(2500));		// 해당하는 값이 있는지 검사
		
		hm.remove("카라멜마끼아또");							// 해당 키 삭제
		hm.get("아메리카노");								// 해당 키의 값 보기
		
		System.out.println(hm.keySet());				// 키 모두 보기
		Set<String> keyset = hm.keySet();
		Iterator<String> it = keyset.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("메뉴 : " + key + "\t 가격 : " + hm.get(key));
		}
	}
}

