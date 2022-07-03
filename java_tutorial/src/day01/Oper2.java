package day01;

public class Oper2 {
	public static void main(String[] args) {
		System.out.println(3+3);
		int num1 = 3;
		int num2 = 2;
		System.out.println(num1-num2);
		
		int 국어 = 50, 영어 = 40, 수학 = 60;
		System.out.println(국어+영어+수학);
		System.out.println((국어+영어+수학)/3);
		num1 = 0;
		num2 = 0;
		num1 = 국어+영어+수학;
		num2 = (국어+영어+수학)/3;
		System.out.println("합계 : "+num1+"점, 평균 : "+num2+"점");
	}
}
