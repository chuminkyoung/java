package day06;

public class Class6 {
	public static void main(String[] args) {
		Class6Ex c = new Class6Ex();
		
		c.setName("홍길동");
		c.setAge(13);
		c.setHeight(166.4);

		System.out.println("이름은 : " + c.getName() + ", 나이는 : " + c.getAge() + ", 키는 : " + c.getHeight());
	}
}

class Class6Ex{
	private String name;
	private int age;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}