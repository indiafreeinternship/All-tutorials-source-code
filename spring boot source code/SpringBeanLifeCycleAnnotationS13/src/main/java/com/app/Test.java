package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ExcelExport ob = ac.getBean("exObj",ExcelExport.class);
		System.out.println("FROM MAIN");
		System.out.println(ob);
		ac.registerShutdownHook();
		//ac.close();
	}

}
