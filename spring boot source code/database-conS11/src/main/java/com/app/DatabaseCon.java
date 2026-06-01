package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("databaseCon")
public class DatabaseCon {
	
	@Value("${my.driver}")
	private String driver;
	
	@Value("${my.url}")
	private String url;
	
	@Value("${my.username}")
	private String username;
	
	@Value("${my.password}")
	private String password;
	
	@Value("${my.port}")
	private int port;
	
	@Value("${my.active}")
	private boolean active;

	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ ", port=" + port + ", active=" + active + "]";
	}
	
	

}
