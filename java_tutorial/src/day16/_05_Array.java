package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _05_Array {
	public static void main(String[] args) {		
		int arr1[] = {1,2,3,4,5,6};
		double arr2[] = new double[100];
		arr2[0] = 0.0;
		arr2[0] = 1.0;
		String arr3[] = {"원", "투", "쓰리", "포"};
		
		List<Integer> arr4 = new ArrayList<>();
		// 추가
		arr4.add(123);
		arr4.get(0); 		// 값 가져오기
		
		// 배열의 사용 이유 : 반복문을 통해서 한번에 사용하기 위해서
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// ArrayList를 반복문 사용
		for (int i = 0; i < arr4.size(); i++) {
			System.out.println(arr4.get(i));
		}
	}
}
