package com.app;

public class ExcelExport {
	
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

	public void setUp(){
		System.out.println("3.FROM INIT METHOD");
	}
	
	public void clear() {
		System.out.println("5.FROM DESTORY METHOD");
	}

	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
	}
	
	
	
	
	

}
