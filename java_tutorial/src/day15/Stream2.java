package day15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream2 {
	public static void main(String[] args) {
		MakeFile mf = new MakeFile();
		//mf.make("C:\\");
		
		MakeFile df = new MakeFile();
		//df.delete("C:\\");
		
		//mf.putText("C:\\myText.txt"); 		// 작성
		
		mf.readText("C:\\myText.txt");			// 읽기
	}
}

class MakeFile{
	// 파일 만들기
	public int make(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 파일 이름을 입력하세요(확장자까지) >>");
		
		String fileName = sc.next();
		File makeFile = new File(path + fileName);		// "c:\\myText.txt"
		
		try {	
			makeFile.createNewFile();	// 새 파일 만들기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 생성에 실패했습니다.");
			return -1;					// 파일 생성에 실패했을 경우 메서드를 종료하면서 -1을 리턴
		}
		
		if(makeFile.exists()) {			// 만약에 파일이 존재한다면
			System.out.println("파일 생성 완료!");
		}
		return 1;
	}
	
	// 파일 삭제하기
	public int delete(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 파일 이름을 입력하세요(확장자까지) >>");
		
		String fileName = sc.next();
		File file = new File(path + fileName);		// "c:\\myText.txt"
		
		// delete : 삭제 성공하면 true를 리턴, 삭제 실패하면 false
		if(file.delete()) {
			System.out.println("삭제 성공!");
			return 1;
		}else {
			System.out.println("삭제 실패ㅠㅠ");
			return -1;
		}
	}
	
	// 파일 내용 입력하기(OutputStream)
	public void putText(String file) {
		FileOutputStream fout = null; 		// try catch 때문에 선언 먼저
		try {
			fout = new FileOutputStream(file, true);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("입력할 내용 >> ");
			
			String msg = sc.nextLine() + "\n";	// 문자열
			// 파일은 '바이트' 단위, 문자열 -> 바이트
			byte[] byteArray = msg.getBytes(); 	// String -> byte[]
			
			fout.write(byteArray);
			System.out.println("내용 입력 완료");
		} catch (Exception e) {					// catch (FileNotFoundException e) -> catch (Exception e) 로 수정 해야 위에 fout.write(byteArray); 에 오류 안남
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("내용 입력 실패");
		} finally { 							// try나 catch 수행 후에 실행될 문장
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	// 파일 내용 읽어오기(InputStream)
	public void readText(String file) {
		FileInputStream fin = null; 			// try catch 때문에 선언 먼저
		
		try {
			fin = new FileInputStream(file);	// file의 경로와 이름을 넣어 줌
			
			// 버퍼 변환 UTF-8 (한글)
			InputStreamReader isr = new InputStreamReader(fin, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String msg = null;

			while((msg = br.readLine()) != null) {	// 한줄 한주 읽어주기 때문에 반복문을 통해 읽어줌
				System.out.println(msg);				
				// System.out.print((char)read); // char -> 1byte (영어만 가능) , 한글 -> 2byte
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 읽기 실패 ㅠㅠ");
		} finally {								// 무조건 실행
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}