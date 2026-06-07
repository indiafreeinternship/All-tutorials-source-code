package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		ExcelExport ob = ac.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN");
		System.out.println(ob);
		ac.registerShutdownHook();
		//ac.close();
	}

}
