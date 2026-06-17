package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	//@Scope("singleton")
	@Scope("prototype")
	public Product pobj(){
		Product p = new Product();
		p.setPid(101);
		p.setPcode("ABC");
		return p;
	}
}
