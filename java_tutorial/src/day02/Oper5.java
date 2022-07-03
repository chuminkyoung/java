package day02;

public class Oper5 {
	public static void main(String[] args) {
		// 논리 연산자 : 비교연산자를 여러개 사용할 수 있게 해줌 
		/*
		  and(둘다 맞을때만 true, 나머진 false) : &&
		  or(둘중 하나라도 맞으면 true, 둘다 틀릴때만 false) :  ||
		  not(결과를 반대로) : !
		 */
		boolean 참 = true;
		boolean 거짓 = false;
		int num = 10;
		
		// not 
		System.out.println(참);
		System.out.println(!참);
		System.out.println(!거짓);
		
		// and 
		System.out.println(num == 10 && 참);
		System.out.println(참 && 참);
		System.out.println(거짓 && 거짓);
		System.out.println(거짓 && 참);
		System.out.println(참 && 거짓);
		
		// or
		System.out.println(참 || 거짓);
		System.out.println(참 || 참);
		System.out.println(거짓 || 거짓);
		System.out.println(거짓 || 참);	
		
		System.out.println(num > 5 || num < -5);
		System.out.println(num > 5 && num < -5);
		System.out.println(!(num > 5));
		System.out.println(!(num < -5));
		System.out.println((num > 5 && num < -5) || num >= -5);
		System.out.println(num > 5 && (num < -5 || num >= -5));
		System.out.println(!(num > 5 && num < -5));
	}
}
