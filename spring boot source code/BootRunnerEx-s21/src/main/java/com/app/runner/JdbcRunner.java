package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class JdbcRunner implements CommandLineRunner  {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM JDBC RUNNER");
		
	}

}
