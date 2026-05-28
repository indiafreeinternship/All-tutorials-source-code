package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyAppConfig.class);
		DatabaseCon obj = ac.getBean("databaseCon",DatabaseCon.class);
		System.out.println(obj);
	}

}
