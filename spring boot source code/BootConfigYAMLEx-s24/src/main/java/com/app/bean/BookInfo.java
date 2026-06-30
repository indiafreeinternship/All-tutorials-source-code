package com.app.bean;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my.book")
public class BookInfo {
	
	private String bname;
	private int bcost;
	
	//private List<String> authors;
	//private Set<String> authors;
	private String[] authors;
	
	private Map<String,String> versions;
	
	private Publisher pob; // HAS-A Variable
	

}
