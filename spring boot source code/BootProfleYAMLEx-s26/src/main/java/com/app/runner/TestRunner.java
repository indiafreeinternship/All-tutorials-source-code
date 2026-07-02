package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.bean.MyDbCon;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private MyDbCon myDbCon;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(myDbCon);

	}

}
