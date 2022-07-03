package day04;

import java.util.Iterator;

public class GuGu {
	public static void main(String[] args) {
		System.out.println("구구단 출력");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
