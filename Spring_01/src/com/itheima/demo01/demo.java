package com.itheima.demo01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
	@Test
	public void testRun(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = (A) context.getBean("a");
		a.run();
	}
}
