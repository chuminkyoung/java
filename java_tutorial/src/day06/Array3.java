package day06;

import java.util.Iterator;

public class Array3 {
	public static void main(String[] args) {
		Array3Ex a = new Array3Ex();
		a.go();
	}
}

class Array3Ex{
	public void go() {
		// 배열 생성1
		String arr1[] = {"a","b","c","d","e","f"}; 		// 6칸 배열
		
		// 배열 생성2
		int arr2[] = new int[256];				// 256칸 배열
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i+1;
			System.out.println(arr2[i]);
		}
		
		// 배열 생성3
		String arr3[];
		arr3 = new String[3];
		arr3[0] = "a";
		arr3[1] = "b";
		arr3[2] = "c";
		
		// 수정
		arr3[0] = "d";
		arr3[2] = "g";
		
		// 배열 전체 조회(보기)
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}