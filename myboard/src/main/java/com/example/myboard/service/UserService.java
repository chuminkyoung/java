package com.example.myboard.service;

import java.util.List;

import com.example.myboard.model.User;

public interface UserService {
	List<User> getAllUser();			// {} 없음
	
	// user의 id로 가져오겠습니다.
	User getUserById(Long id);			// 인터페이스에 있는 메서드는 상속받은 곳에서 완성
}


// 만듦