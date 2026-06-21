package com.app.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Token {
	
	private int token;
		
	public Token() {
		 token = new Random().nextInt(999);
	}
	
	@Override
	public String toString() {
		return "Token [token=" + token + "]";
	}
	

}
