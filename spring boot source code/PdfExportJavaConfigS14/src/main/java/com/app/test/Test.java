package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.PdfExport;
import com.app.config.AppConfig;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		PdfExport ob = ac.getBean("pObj",PdfExport.class);
		
		System.out.println(ob);
		
	}

}
