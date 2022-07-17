package com.example.myboard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sms")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		// ID를 통해서 구분을 하겠다.
	private Long id;
	
	@Column(name="first_name", nullable=false)
	private String first_name;
	
	@Column(name="last_name")
	private String  last_name;
	
	@Column(name="email")
	private String email;
	
	public User() {}		// 기본 생성자
	
	public User(String first_name, String last_name, String email) {
		super();			// 상속 생성자
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
