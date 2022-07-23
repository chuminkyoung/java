package day09;

public class Class2 {
	public static void main(String[] args) {
		gangnam sg = new gangnam();
		sg.made();
		sg.sell();
		
		sinchone ss = new sinchone();
		ss.made();
		ss.sell();
		
		bupyeong sb = new bupyeong();
		sb.made();
		sb.sell();
		
		// 다형성 : 객체화를 할 때 상속한 인터페이스의 이름으로 통일
		starbucks strar1 = new gangnam();
		starbucks strar2 = new sinchone();
		starbucks strar3 = new bupyeong();
		starbucks star[] = new starbucks[30];
		
		star[0] = new gangnam();
		star[1] = new sinchone();
		
		star[0].made();		// 강남점
		star[1].made();		// 신촌점
		
		star[0] = new bupyeong();
		star[0].made(); 	// 부평점
		
		strar1.sell();		// 강남점
		strar1 = new bupyeong();
		strar1.sell();		// 부평점
		
		// sg = new bupyeong(); 	안됨		// gangnam sg = new bupyeong(); 
		// starbucks star1 = new bupyeong();  	가능
		// starbucks star1 = new sinchone();  	가능
		
		// 다향성 : 코드수정을 줄이고 재사용 비율을 늘린다.
	}
}

// 스타벅스
interface starbucks{
	// 커피를 만든다
	void made();
	// 커피를 판다
	void sell();
}

//스타벅스 강남점
class gangnam implements starbucks{

	@Override
	public void made() {
		System.out.println("강남점 커피만들기");
		
	}

	@Override
	public void sell() {
		System.out.println("강남점 커피판매");
		
	}
	
}

// 스타벅스 신촌점
class sinchone implements starbucks {

	@Override
	public void made() {
		System.out.println("신촌점 커피만들기");
		
	}

	@Override
	public void sell() {
		System.out.println("신촌점 커피판매");
		
	}
	
}


// 스타벅스 부평점
class bupyeong implements starbucks {

	@Override
	public void made() {
		System.out.println("부평점 커피만들기");
		
	}

	@Override
	public void sell() {
		System.out.println("부평점 커피판매");
		
	}
	
}

