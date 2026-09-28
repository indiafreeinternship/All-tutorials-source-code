package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Course;
import com.app.entity.Student;
import com.app.repository.CourseRepository;
import com.app.repository.StudentRepository;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private StudentRepository srepo;
	
	@Autowired
	private CourseRepository crepo;

	@Override
	public void run(String... args) throws Exception {
		
		Course c1 = new Course(10,"java",5000);
		Course c2 = new Course(11,"ORACLE",4500);
		Course c3 = new Course(12,"React",10000);
		
		crepo.save(c1);
		crepo.save(c2);
		crepo.save(c3);
		
		Student s1 = new Student(5001,"Prashant","Delhi",Arrays.asList(c1,c2));
		Student s2 = new Student(5002,"Priya","Mumbai",Arrays.asList(c1,c3));
		Student s3 = new Student(5003,"Archana","UP",Arrays.asList(c1,c3,c2));
		
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);
		
		
	}

}
