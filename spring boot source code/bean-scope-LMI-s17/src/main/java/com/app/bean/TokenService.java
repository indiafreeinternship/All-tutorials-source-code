package com.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService {
	
	@Autowired
	private Token tokenOb;
	
	// problem solution
	@Lookup
	public Token linkNewChildObj() {
		return null;
	}
	
	public Token getTekenOb() {
		 this.tokenOb = linkNewChildObj();
		return tokenOb;
	}

	@Override
	public String toString() {
		return "TokenService [tokenOb=" + tokenOb + "]";
	}
	
	
	

}
