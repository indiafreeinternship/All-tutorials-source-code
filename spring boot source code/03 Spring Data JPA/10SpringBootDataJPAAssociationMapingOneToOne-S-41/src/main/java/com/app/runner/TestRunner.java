package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Profile;
import com.app.entity.User;
import com.app.repository.ProfileRepository;
import com.app.repository.UserRepository;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private UserRepository urepo;
	@Autowired
	private ProfileRepository prepo;

	public void run(String... args) throws Exception {
		
		Profile p1 = new Profile(2233,"ACTIVE","DEV-001");
		Profile p2 = new Profile(2244,"ACTIVE","QA-002");
		
		prepo.save(p1);
		prepo.save(p2);
		
		User u1 = new User(111,"Rishav","abc@123",p1);
		User u2 = new User(222,"Tiger","xyz@123",p2);
		
		urepo.save(u1);
		urepo.save(u2);
		
	}

}
