package day12;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		Rand3 r1 = new Rand3();
		r1.go(num1, num2);
		
		Rand3 r2 = new Rand3();
		r2.go(num1, num2);
	}
}

class Rand3{
	Random rand = new Random();
	// 입력받은 두 수 사이에서 랜덤
	public void go(int n1, int n2) {
		int result = rand.nextInt((n2-n1)+1) + n1;
		System.out.println(result);
	}
	
	
	public void go2(int n1, int n2) { 
		// 작은수 ~ 큰수
		if(n1 < n2) {
			int result = rand.nextInt((n2-n1)+1) + n1;
			System.out.println(result);
		}else if(n1 > n2) {	
			int result = rand.nextInt((n1-n2)+1) + n2;
			System.out.println(result);
		}
	}
	
	
	public void go3(int n1, int n2) { 
		// n1~n2 랜덤
		int result = 0;
		int save = 0;
		
		// n1이 n2보다 더 큰 값이 들어왔을 경우
		if(n1 > n2) {
			save = n1;	// n1 백업
			n1 = n2;	// n1에 n2값을 담음
			n2 = save;	// n2에 백업값(n1)을 담음
			// n1 과 n2의 값을 체인지!
		}
		
		result = rand.nextInt(n2-n1+1)+n2;
		System.out.println(result);
	}
}

