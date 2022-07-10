package day06;

public class Class4 {
	public static void main(String[] args) {
		// 사칙연산 클래스를 사용
		사칙연산 num = new 사칙연산();
		double result = 0;
		
		result = num.더하기(3,2);
		System.out.println((int)result);
		
		result = num.빼기(3,2);
		System.out.println((int)result);
	}
}

class 사칙연산{
	// 더하기, 빼기, 곱하기, 나누기
	int 더하기(int n1, int n2) {
		return n1 + n2;
	}
	
	int 빼기(int n1, int n2) {
		return n1 - n2;
	}
	
	int 곱하기(int n1, int n2) {
		return n1 * n2;
	}
	
	double 나누기(int n1, int n2) {
		return (double)n1 / (double)n2;
	}
}