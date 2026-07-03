package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.app.bean.Vendor;

@Configuration
public class MyAppConfig {

	@Bean
	@Primary
	public Vendor vod1() {
		Vendor v1=new Vendor();
		v1.setVname("v1-abc");
		return v1;
		
	}
	
	@Bean
	public Vendor vod2() {
		Vendor v1=new Vendor();
		v1.setVname("v1-pqr");
		return v1;
	}
}
