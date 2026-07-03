package com.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Product {
	
	//@Autowired(required = false)
	//@Autowired(required = true)
	
	
	@Autowired
	//@Qualifier("vod2")
	private Vendor vod;   // HAS-A

}
