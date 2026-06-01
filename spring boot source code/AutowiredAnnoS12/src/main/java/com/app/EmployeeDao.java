package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("edao")
@Component("edao")
public class EmployeeDao {
 
	
	@Value("ORACLE")
	private String dbName;

	@Override
	public String toString() {
		return "EmployeeDao [dbName=" + dbName + "]";
	}
	
	
	
	
}
