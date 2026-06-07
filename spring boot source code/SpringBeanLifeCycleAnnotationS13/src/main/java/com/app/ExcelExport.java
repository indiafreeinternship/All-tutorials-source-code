package com.app;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("exObj")
public class ExcelExport {

	@Value("SAMPLE")
	private String fileName;
	@Value(".csv")
	private String fileExt;

	public ExcelExport() {
		super();
		System.out.println("from constructor");
	}

	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
	}

	
	@PostConstruct
	public void setUpA() {
		System.out.println("FROM INIT METHOD");
	}

	@PreDestroy
	public void clearB() {
		System.out.println("FROM DESTROY METHOD");
	}

}
