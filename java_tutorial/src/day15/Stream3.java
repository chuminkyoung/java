package day15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Stream3 {
	public static void main(String[] args) {
		MyProgram msg = new MyProgram();
		msg.go();
	}
}

class MyProgram{
	
	Scanner sc = new Scanner(System.in);
	String msg = "";
	
	public void go() {
		// 스캐너를 통해서 입력받은 문자열을 
		// 바탕화면의 scan.txt에 기록 (로그남기기)
		
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\scan.txt", true);
			
			System.out.print("내 메시지 >> ");
			msg = sc.nextLine() + "\n";
			System.out.println(msg);
			
			byte[] log  = msg.getBytes();
			fout.write(log);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("내용 입력 실패");
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}