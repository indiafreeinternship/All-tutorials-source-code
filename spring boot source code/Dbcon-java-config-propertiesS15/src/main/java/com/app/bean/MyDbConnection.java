package com.app.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class MyDbConnection {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	

}
