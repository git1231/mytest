package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.itheima.service.UserService;

@Component("us")
public class UserServiceImpl implements UserService {
	@Value("xxxxx")
	private String name;

	/*
	 * public UserServiceImpl() { super(); }
	 */

	/*
	 * public UserServiceImpl(String name) { super(); this.name = name; }
	 */

	public void setName(String name) {
		this.name = name;
	}

	public void save() {
		System.out.println("UserServiceImpl:save: " + name);

	}

	

}
