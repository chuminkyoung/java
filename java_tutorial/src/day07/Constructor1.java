package day07;

public class Constructor1 {
	public static void main(String[] args) {
		Cst1 c1 = new Cst1("모닝", 1234);
		// 클래스명 객체명 = new 생성자명();
		c1.go();
		
		Cst1 아빠차 = new Cst1("BMW", 9998);
		아빠차.go();
	}
}

class Cst1{
	
	private String car_name;
	private int car_num;
	
	// 생성자
	Cst1(String car_name, int car_num){
		setCar_name(car_name);
		setCar_num(car_num);
	}
	
	public void go() {
		carInfo();
	}
	
	public void carInfo() {
		System.out.println("차종은 " + getCar_name() + ", 차번호는 " + getCar_num());
	}
	
	// get : 사용
	public String getCar_name() {
		return car_name;
	}
	
	// set : 대입
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	
	// get : 사용
	public int getCar_num() {
		return car_num;
	}
	
	// set : 대입
	public void setCar_num(int car_num) {
		this.car_num = car_num;
	}
	
	
}