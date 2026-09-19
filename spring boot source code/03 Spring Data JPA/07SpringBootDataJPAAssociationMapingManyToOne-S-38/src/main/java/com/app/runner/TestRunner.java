package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Department;
import com.app.entity.Employee;
import com.app.repo.DepartmentRepository;
import com.app.repo.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner{
		
	@Autowired
	private EmployeeRepository erepo;
	
	@Autowired
	private DepartmentRepository drepo;
	

	@Override
	public void run(String... args) throws Exception {
		
		
		Department d1 = new Department(101,"DEV","RAJ");
		
		drepo.save(d1);
		
		Employee e1 = new Employee(10,"RAJEEV",1200.0,d1);
		Employee e2 = new Employee(11,"MOHIT",1500.0,d1);
		Employee e3 = new Employee(33,"KUMAR",1800.0,d1);
		
		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		
		
	}

}
