package day14;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) {
		Thread_1 t1 = new Thread_1();
		Thread_2 t2 = new Thread_2();
		
		Thread_3 t3 = new Thread_3();
		Thread tt3 = new Thread(t3);		// Runnable로 만들었을 경우
		
		t1.start();
		t2.start();
		tt3.start();
	}
}

// 쓰레드를 생성하여 동시에 2개의 작업을 수행하세요
// 쓰레드1 : 스캐너를 사용해서 입력받으면 출력
// 쓰레드2 : 무한반복으로 0.5초마다 Hello World 출력

class Thread_1 extends Thread{
	
	@Override
	public void run() {		// run으로 만들고 start로 실행
		go();
	}
	
	public void go() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String input = sc.next();
			
			System.out.println("입력 : " + input);
		}
	}
}

class Thread_2 extends Thread{
	@Override
	public void run() {		// 추가 쓰레드의 main함수(run으로 만들고 start로 실행)
		while(true) {
			System.out.println("Hello World");
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

// 자바는 다중상속이 안되기 때문에 추가로 상속할 수 있는 인터페이스를 제공 : Runnable
class Thread_3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("BGM 재생 중");
			try {
				// sleep은 오류방지를 위해 try/catch로 감싸줘야 함
				Thread.sleep(500);	//0.5초 쓰레드 중지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

