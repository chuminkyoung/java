package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class Join1 {
	static ArrayList<String> arrList = new ArrayList<>();	// static을 붙이면 객체화 없이 접근 가능(남발금지)
	public static void main(String[] args) {
		InitClass ic = new InitClass();
		AfterClass ac = new AfterClass();
		
		ic.start();
		
		// 쓰레드를 따로 작동시켜도 순번을 정해줄수 있따. join
		// join도 문제가 생길수 있어서 try/catch로 감싸줘야 함
		try {
			ic.join();		// ic 쓰레드가 끝날때까지 다른 쓰레드는 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ac.start();
	}
}

class InitClass extends Thread{
	// 먼저 해줘야할 클래스
	
	Scanner sc = new Scanner(System.in);
	private String ss;
	
	@Override
	public void run() {
		System.out.println("초기화 쓰레드 시작");
		while(true) {
			System.out.print("입력하세요(종료하려면 0) >> ");
			ss = sc.nextLine();
			if(ss.equals("0")) {
				break;
			}
			
			Join1.arrList.add(ss);
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("초기화 쓰레드 끝");
	}
	
}

class AfterClass extends Thread{
	// 나중에 해줘야할 클래스
	@Override
	public void run() {
		System.out.println("그 다음 쓰레드 시작");
		for (int i = 0; i < Join1.arrList.size(); i++) {
			System.out.println(Join1.arrList.get(i));
		}
		System.out.println("그 다음 쓰레드 끝");
	}
}