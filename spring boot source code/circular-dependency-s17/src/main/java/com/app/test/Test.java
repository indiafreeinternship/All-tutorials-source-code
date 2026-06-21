package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.ProjectService;
import com.app.config.AppConfig;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProjectService ps = ac.getBean("projectService",ProjectService.class);
		System.out.println(ps);
	}

}
