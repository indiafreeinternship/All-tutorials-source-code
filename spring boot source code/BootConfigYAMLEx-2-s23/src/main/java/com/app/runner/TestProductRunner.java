package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.bean.ProductInfo;

@Component
public class TestProductRunner implements CommandLineRunner {
    @Autowired
	private ProductInfo productInfo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(productInfo);
		
	}
}
