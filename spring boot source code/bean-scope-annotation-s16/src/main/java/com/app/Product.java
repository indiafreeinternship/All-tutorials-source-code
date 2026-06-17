package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component("pobj")
//@Scope("singleton")
@Scope("prototype")
public class Product {
    
	@Value("101")
	private int pid;
	@Value("ABC")
	private String pcode;
}
