package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.PdfExport;

@Configuration
public class AppConfig {

	// user defined
	@Bean
	public PdfExport pObj(){
		PdfExport p = new PdfExport();
		p.setFileName("sbms");
		p.setFileAuth("IndiaFreeInternship");
		return p;
		
	}
	
	
	
	
	
	
	
}
