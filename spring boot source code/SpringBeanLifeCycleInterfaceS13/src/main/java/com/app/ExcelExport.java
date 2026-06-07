package com.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExcelExport implements InitializingBean, DisposableBean{
	
	private String fileName;
	private String fileExt;
	
	public ExcelExport() {
		super();
		System.out.println("from constructor");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		System.out.println("from setter method");
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}


	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("FROM INIT METHOD AFTER PROPERTIESSET()");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("from destroy method destroy()");
		
	}

	
	
	
	
	
	
	

}
