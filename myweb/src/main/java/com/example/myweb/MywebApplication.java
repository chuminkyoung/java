package com.example.myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MywebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebApplication.class, args);
		System.out.println("myweb 실행 완료");
	}

}

// 프론트(화면) : html/css/javascript
// 백(기능) : java
