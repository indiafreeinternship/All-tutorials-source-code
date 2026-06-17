package com.app;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
	
	private int pid;
	private String pcode;
	
	public Product() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}

}
