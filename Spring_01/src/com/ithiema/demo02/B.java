package com.ithiema.demo02;

import org.springframework.stereotype.Component;

@Component("b")
public class B {
	public void save(){
		System.out.println("b:save");
	}
}
