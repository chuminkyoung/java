package com.example.myboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.myboard.model.User;
import com.example.myboard.repository.UserRepository;
import com.example.myboard.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository user;
	
	public UserServiceImpl(UserRepository user) {
		super();
		this.user = user;
	}
	
	// 전체 보여주기
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return user.findAll(); 					// 상속받은 인터페이스의 함수를 오버라이딩
	}

	@Override
	public User getUserById(Long id) {
		return user.findById(id).get();
	}

	@Override
	public User saveUser(User user) {			// 새로 저장하기
		return this.user.save(user);
	}

	@Override
	public User updateUser(User user) {
		return this.user.save(user);			// 변경하기
	}
	
	// 아이디로 삭제하기
	@Override
	public void deleteUserById(Long id) {
		user.deleteById(id);
		
	}
	
	// 일부만 보여주기
	@Override
	public Page<User> findPaginated(int no, int totalNo) {
		Pageable pageable = PageRequest.of(no-1, totalNo);		// -1해주는 이유 : 1페이지는 0번 방
		return user.findAll(pageable);
	}

}


// 상속받은 곳에서 구현