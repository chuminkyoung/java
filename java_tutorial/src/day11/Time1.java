package day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time1 {
	public static void main(String[] args) {
		NowTime nt = new NowTime();
		nt.go();
		nt.go2();
		nt.go3();
	}
}

class NowTime{
	public void go() {
		// main
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime(); 		// 현재 시간
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM");
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date)+"년");
		System.out.println(Integer.parseInt(sdf3.format(date))+"월");
	}
	
	public void go2() {
		// 내일은 2022년 7월 31일
		// Integer.parseInt로 문자열을 정수로 바꿔서 더하기
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		//SimpleDateFormat ss1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		SimpleDateFormat ss2 = new SimpleDateFormat("yyyy년 MM월");
		SimpleDateFormat ss3 = new SimpleDateFormat("dd");
		
		//System.out.println(ss1.format(date));
		System.out.println("내일은 " + ss2.format(date) + " " + (Integer.parseInt(ss3.format(date)) + 1 + "일") );
	}
	
	public void go3() {
		// substring 사용, SimpleDateFormat은 한번만 사용
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String time = sdf.format(date);			  // 2022-07-30-11-38-22
		
		// 내일은 2022년 7월 31일
		// substring 사용
		
		 String dd1 = time.substring(0,3+1);
		 String dd2 = time.substring(5,6+1);
		 String dd3 = time.substring(8,9+1);
		 
		 int num = Integer.parseInt(dd3);
		 
		 System.out.println("내일은 " + dd1 + "년 " + dd2 + "월 " + (num + 1) + "일");
		
	}
}