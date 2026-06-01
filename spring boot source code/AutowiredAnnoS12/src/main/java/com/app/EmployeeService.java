package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//ctrl+shift+O
@Component("esobj")
public class EmployeeService {
    
	//@Autowired(required=true)
	@Autowired(required=false)
	private EmployeeDao dao; // HAS-A

	@Override
	public String toString() {
		return "EmployeeService [dao=" + dao + "]";
	}
	
	
}
