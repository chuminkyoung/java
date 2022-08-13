package day15;

public class Review {
	public static void main(String[] args) {
		// 쓰레드 : 실행중인 프로그램 (프로세스) 내부에서 실질적으로 업무수행을 하는 단위
		
		// main() 함수는 기본적으로 메인 쓰레드를 갖고있음
		MyThread1 mt1 = new MyThread1();		// Thread 상속
		MyThread2 mt2 = new MyThread2();		// Runnable 상속
		Thread mtt2 = new Thread(mt2);
		
		mt1.start(); 		// run 메ㅐ서드의 내용이 추가쓰레드로 실행
		mtt2.start(); 		// mt2 객체 안에 있는 run메서드를 추가쓰레드로 실행
	}
}

// 추가 쓰레드 : 메인쓰레드와는 별개로 동작하기 위해서
class MyThread1 extends Thread{
	// 쓰레드 클래스를 상속받아서 run에 구현 -> main에서 start로 진행
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("추가쓰레드1");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

// 추가 쓰레드2
class MyThread2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("추가쓰레드2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}