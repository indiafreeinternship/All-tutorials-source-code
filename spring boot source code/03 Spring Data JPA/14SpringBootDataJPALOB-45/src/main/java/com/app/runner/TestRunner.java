package com.app.runner;

import java.io.File;
import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Product;
import com.app.repository.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private ProductRepository repo;

	@SuppressWarnings("resource")
	@Override
	public void run(String... args) throws Exception {
		   
		FileInputStream fis = new FileInputStream("D:/session 45.png");
		
		byte[] barr=new byte[fis.available()];
		
		fis.read(barr);
		
		String input="Welcome to India free Internship. You can learn from here any fullstack courses";
		char[] carr = input.toCharArray();
		
		Product p = new Product(101,"Laptop",65521.0,barr,carr);
		
		repo.save(p);
		
		fis.close();
		
		
		
	}

}
