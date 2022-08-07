package day14;

public class Sync2 {
	public static void main(String[] args) {
		DressRoom dr = new DressRoom();
		Thread human = new Thread(dr,"사람");
		
		human.start();
	}
}


// 의상실은 한명이 사용 중이면 다른 사람들은 대기
// 동기화
class DressRoom implements Runnable{
	private int time;
	private int human;
	@Override
	public void run() {
		synchronized (this) {
			human = 1;
			while(human < 3) {
				time = 0;
				System.out.println("사람" + human + " 드레스룸 들어감");
				while(time < 10) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					time++;
					System.out.println("드레스룸 사용중... " + time + "초");
				}
				System.out.println("사람" + human + " 드레스룸 나옴");
				human++;
			}
		}
	}
	
}