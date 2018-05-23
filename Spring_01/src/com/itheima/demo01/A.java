package com.itheima.demo01;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("a")
public class A {
	@Resource(name="b")
	private B b;

/*	public void setB(B b) {
		this.b = b;
	}
*/
	public void run() {
		b.run();
	}
}
