package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService ob = ac.getBean("esobj",EmployeeService.class);
		System.out.println(ob);
		
	}

}
