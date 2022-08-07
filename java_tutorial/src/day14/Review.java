package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Review {
	public static void main(String[] args) {
		List_ lst = new List_();
		lst.go();
		System.out.println("----------------");
		Set_ set = new Set_();
		set.go();
		System.out.println("----------------");
		Map_ map = new Map_();
		map.go();
	}
}

class List_{
	ArrayList<String> ar = new ArrayList<>();			// 순서O, 중복O 배열
	public void go() {
		// 기존 배열의 불편한 점을 개선한 클래스
		
		// 추가 add
		ar.add("한개");			// 0
		ar.add("두개");			// 1
		ar.add("세개"); 			// 2
		ar.add("세개");			// 3
		
		System.out.println(ar.get(0));		// get 보기
		
		ar.set(1, "두개 수정");
		System.out.println(ar.get(1));		// get 보기
		
		//ar.remove(1);
		ar.remove("두개 수정");
		
		System.out.println("===============");
		// 전체 보기
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
	}
}

class Set_{
	HashSet<String> hs = new HashSet<>();			// 순서X, 중복X 배열
	public  void go() {
		// 추가 add
		hs.add("한개");
		hs.add("두개");
		hs.add("세개");
		hs.add("세개");
		
		// Set은 Iterator를 사용
		Iterator<String> iter = hs.iterator();		// 반복자
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

class Map_{
	// 키와 값으로 이루어짐
	HashMap<Integer, String> hm = new HashMap<>();
	// 일반 배열 [1,2,3,4,5]
	// Map [키:값, 키:값, 키:값, 키:값]
	
	public void go() {
		// 추가 put
		hm.put(1, "첫번째");		// 1
		hm.put(2, "두번째");		// 2
		hm.put(3, "세번째");		// 3
		hm.put(5, "네번째");		// 5
		
		// 보기 get
		System.out.println(hm.get(5));
		
		// 전체 키 보기 keySet()
		System.out.println(hm.keySet()); 
		
		Set<Integer> set = hm.keySet();		// 키를 전부다 가져오기
		
		// Set을 사용해서 값 전체보기
		Iterator<Integer> iter = set.iterator();		// 반복자
		while(iter.hasNext()) {
			int keyNum = iter.next();
			System.out.println(hm.get(keyNum));	 		// 키에 해당하는 값을 출력
		}
	}
}


/*
	{"날씨":"흐림", "기온":"23", "지역":"서울"} : JSON => Map
	// List : 순서O, 중복O 배열
	// Set : 순서X, 중복X 배열
	// Map : 키와 값으로 이루어진 배열
	
	// ArrayList, HashMap 주로 많이 쓰임
*/