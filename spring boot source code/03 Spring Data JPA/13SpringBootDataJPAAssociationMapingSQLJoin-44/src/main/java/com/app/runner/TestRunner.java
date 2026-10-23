package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Department;
import com.app.entity.Employee;
import com.app.repository.DepartmentRepository;
import com.app.repository.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private DepartmentRepository drepo;
	
	@Autowired
	private EmployeeRepository erepo;
	
	 @Override
	public void run(String... args) throws Exception {
		
		 Department d1 = new Department(101,"Dev","AAA");
		 Department d2 = new Department(102,"QA","BBB");
		 Department d3 = new Department(103,"BA","PPP");
		 Department d4 = new Department(104,"ART","XYZ");
		 Department d5 = new Department(105,"devOps","PXZ");
		 
		 drepo.save(d1);
		 drepo.save(d2);
		 drepo.save(d3);
		 drepo.save(d4);
		 drepo.save(d5);
		 
		 Employee e1 = new Employee(10,"Raj",200.0,null);
		 Employee e2 = new Employee(11,"Ajay",200.0,d2);
		 Employee e3 = new Employee(12,"Rohit",200.0,d3);
		 Employee e4 = new Employee(13,"Mohan",200.0,null);
		 Employee e5 = new Employee(14,"priya",200.0,null);
		 
		 erepo.save(e1);
		 erepo.save(e2);
		 erepo.save(e3);
		 erepo.save(e4);
		 erepo.save(e5);
		
		 
		// erepo.fetchEmpNameAndDeptCode()
		 //erepo.fetchAllDeptNameAndEmp()
		 //erepo.fetchAllEmpNameAndDeptCode()
		 erepo.fetchEmpNameAndAllDeptCode()
		 .stream()
		 .map(e->e[0]+"----------"+e[1])
		 .forEach(System.out::println);
	}

}
