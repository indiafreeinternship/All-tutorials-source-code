package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//ctrl+shit+O
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		Object ob = ac.getBean("mobj");
		System.out.println(ob);
	}

}
