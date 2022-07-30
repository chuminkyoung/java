package day11;

public class Review {
	public static void main(String[] args) {
		// 1. 객체화
		// 2. go 사용
		ReviewTest rt = new ReviewTest();
		rt.go();
		
	}
}

class ReviewTest{
	String str = "문자열";
	public void go() {
		System.out.println("복습페이지");
		str.equals("문자열"); 						// str 안에있는 내용과 같은지 비교
		System.out.println( str.charAt(0) ); 		// 0번째 있는 문자 가져오기
		System.out.println( str.contains("문자") );	// 포함하고 있는지 검사 (true, false)
		
		String ss = str.replace("문자열", "글자 출력");	// 글자 변경해서 반환
		System.out.println(ss);						// 글자 출력
		
		System.out.println( ss.substring(0, 2) ); 	// 잘라내기
		System.out.println(ss.indexOf("글자"));  		// 문자열 시작위치 찾기
		
		String str1 = "1";
		int num = Integer.parseInt(str1);			// 문자열 -> 정수 (계산이 필요할때)
		System.out.println(num +1);
		
		str1 = Integer.toString(num);				// 정수 -> 문자열
		System.out.println(str1 + 1);
		
		str1 = "" + num;							// 정수 -> 문자열 (천원 단위로 , 붙여줄때)
		System.out.println(str1 + 1);
	}
}