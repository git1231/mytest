package com.ithiema.demo02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
	@SuppressWarnings("resource")
	@Test
	public void testSave(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = (A) context.getBean("a");
		a.save();
		
	}
	
}
