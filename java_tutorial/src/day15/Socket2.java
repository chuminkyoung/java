package day15;

public class Socket2 {
	public static void main(String[] args) {
		MyClient mc = new MyClient();
		
		mc.go("192.168.3.6", 15000);
	}
}
