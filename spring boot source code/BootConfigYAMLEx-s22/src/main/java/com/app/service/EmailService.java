package com.app.service;

import java.util.Map;
import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my.app")
public class EmailService {

	private String host;
	private int port;
	private String username;
	private boolean active;

	// private List<String> models;
	//private Set<String> models;
	//private String[] models;
	//private Map<String,String> data;
	//private Properties data;
	
	//private Message mob;

}
