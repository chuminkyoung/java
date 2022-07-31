package com.example.myboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.myboard.model.User;
import com.example.myboard.service.UserService;

@Controller
public class BoardController {
	
	private UserService userService;
	
	public BoardController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/")			// localhost:8080/	로 이동하면 실행하는 함수
	public String boardPage(Model model) {
		model.addAttribute("user", userService.getAllUser());
		return "index";			// index.html 		로 이동
	}
	
	@GetMapping("/edit/{id}")
	public String editPage(Model model, @PathVariable Long id) {
		model.addAttribute("user", userService.getUserById(id));
		return "edit";			// edit.html   		로 이동
	}
	
	@PostMapping("/")
	public String saveUser(@ModelAttribute("user") User user) {
		userService.saveUser(user);
		return "redirect:/"; 	// 입력완료 후 localhost:8080/ 로 이동
	}
	
	// GetMapping : 페이지 이동
	// PostMapping : 입력받은 정보를 숨기고 페이지 이동
	// Model model : html로 넘겨줄 값
	// @PathVariable : html로부터 받을 값
	// @ModelAttribute : html에서 입력한 값
	
	@PostMapping("/{id}")
	public String updateUser(@PathVariable Long id, @ModelAttribute("user") User user, Model model) {
		// 받은 id를 통해서 mysql에서 정보를 가져옴
		User dbUser = userService.getUserById(id);
		dbUser.setId(id);
		dbUser.setFirst_name(user.getFirst_name());
		dbUser.setLast_name(user.getLast_name());
		dbUser.setEmail(user.getEmail());	
		
		// userService 업데이트
		userService.updateUser(dbUser);
		return "redirect:/";		// localhost:8080/ 로 돌아감
	}
}


// .model
// .repository
// .service
// .service.impl