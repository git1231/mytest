package com.itheima.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.service.UserService;

public class TestUserService {
	@Test
	public void testSave() {
		/*
		 * UserService service = new UserServiceImpl(); service.save();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		UserService service = (UserService) context.getBean("us");

		service.save();
	}


}
