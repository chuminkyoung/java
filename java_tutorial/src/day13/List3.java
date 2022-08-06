package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List3 {
	public static void main(String[] args) {
		Menu1 mn1 = new Menu1();
		mn1.go();
	}
}

class Menu1{
	private int choice = -1;
	public void go() {
		
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		//String str2 = "";
		int num;
		
		while(true) {
			System.out.println("[1.추가 2.수정 3.제거 4.보기 0.종료]");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.print("추가 : ");
				str = sc.next();
				arr.add(str);
			}
			else if(choice == 2) {
				System.out.print("수정 위치 : ");
				num = sc.nextInt();
				
				System.out.print("수정 내용 : ");
				str = sc.next();
				arr.set(num, str);
			}
			else if(choice == 3) {
				System.out.print("제거 : ");
				num = sc.nextInt();
				arr.remove(num);
			}
			else if(choice == 4) {
				System.out.print("보기 : ");
				
				for (int i = 0; i < arr.size(); i++) {
					System.out.print(arr.get(i) + " ");
				}
				
			}
			else if(choice == 0) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}

// add 추가
// set 수정
// remove 삭제
// get 읽기
// size 항목개수