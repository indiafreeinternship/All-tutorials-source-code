package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Product p1 = ac.getBean("pobj",Product.class);
		Product p2 = ac.getBean("pobj",Product.class);
		System.out.println(p1==p2);
		
	}

}
