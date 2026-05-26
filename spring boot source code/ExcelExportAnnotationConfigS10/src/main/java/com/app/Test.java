package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
        // Find classes from a package(basePackage)
		//ac.scan("com.app");
        // object creation
       //ac.refresh();
		
		
        ExcelExport ee = ac.getBean("excel",ExcelExport.class);
        System.out.println(ee);
	}
}
