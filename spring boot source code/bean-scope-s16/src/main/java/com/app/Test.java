package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		/*singleton
		Product ob1 = ac.getBean("pobj",Product.class);
		Product ob2 = ac.getBean("pobj",Product.class);
		Product ob3 = ac.getBean("pobj",Product.class);
		
	    System.out.println(ob2==ob3);
	    */
		
		Product p1 = ac.getBean("pobj",Product.class);
		Product p2 = ac.getBean("pobj",Product.class);
		Product p3 = ac.getBean("pobj",Product.class);
		System.out.println(p1==p2);
	}
}
