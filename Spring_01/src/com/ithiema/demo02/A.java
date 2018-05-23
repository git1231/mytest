package com.ithiema.demo02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a")
public class A {
	@Autowired
	private B b;

	public void setB(B b) {
		this.b = b;
	}

	public void save() {
		b.save();
	}

}
