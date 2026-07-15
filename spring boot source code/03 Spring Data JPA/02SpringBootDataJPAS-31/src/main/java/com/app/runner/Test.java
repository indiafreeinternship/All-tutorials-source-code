package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.EmployeeRepository;

@Component
public class Test implements CommandLineRunner{
	
	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		
	}

}
