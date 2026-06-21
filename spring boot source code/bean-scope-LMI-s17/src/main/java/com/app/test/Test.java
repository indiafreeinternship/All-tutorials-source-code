package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.TokenService;
import com.app.config.AppConfig;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		TokenService ts1 = ac.getBean("tokenService",TokenService.class);
		System.out.println(ts1);
		System.out.println("Token Serive HS : "+ ts1.hashCode());
		System.out.println("Token HS :"+ ts1.getTekenOb().hashCode());
		
		TokenService ts2 = ac.getBean("tokenService",TokenService.class);
		System.out.println(ts2);
		System.out.println("Token Serive HS : "+ ts2.hashCode());
		System.out.println("Token HS :"+ ts2.getTekenOb().hashCode());
	}

}
