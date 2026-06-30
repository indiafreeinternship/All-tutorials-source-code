package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.bean.BookInfo;

@Component
public class BookRunner implements CommandLineRunner{
	
	@Autowired
	private BookInfo bookInfo;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(bookInfo);
		//System.out.println(bookInfo.getAuthors().getClass().getName());
	}

}
