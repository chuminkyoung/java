package day04;

import java.util.Iterator;
import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 구구단 중 입력한 단수에 대해서만 출력하기 (continue)
		
		Scanner sc = new Scanner(System.in);
		
		int 단;
		
		System.out.println("단 : ");
		단 = sc.next();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print( j + "x" + i + "=" + i*j + "\t" );
			}
			System.out.println();
		}
	}
}
