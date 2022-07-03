package day02;

public class If3 {
	public static void main(String[] args) {
		int pw = 1234;
		int wpw = 1325;
		
		if(pw == wpw) {
			System.out.println("어서오십시오.");
		}
		else{
			System.out.println("누구쎄용?");
		}
		
		// 퀴즈 : if ~ else 를 사용해서 20살 이상은 성인, 미만은 미성년자

		int age = 45;
		
		if (age < 20){
			System.out.println(" 미성년자입니다.");
		}
		else {
			System.out.println("성인입니다.");
		}
		
		
		
	}
}
