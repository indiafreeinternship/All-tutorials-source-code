package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.MyDbConnection;
import com.app.config.AppConfig;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		MyDbConnection ob = ac.getBean("dbObj",MyDbConnection.class);
		System.out.println(ob);
	}

}
