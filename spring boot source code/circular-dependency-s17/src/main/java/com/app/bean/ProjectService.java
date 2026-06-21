package com.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectService {

	@Autowired
	private EmployeeService eService;

	@Override
	public String toString() {
		return "ProjectService [eService=" + eService + "]";
	}
	
	
}
