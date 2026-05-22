package com.app;

public class DbCon {
   private String driver;
   private String url;
   //alt+shit+s
   public DbCon() {
	super();
	System.out.println("Constructor called");
   }
   public String getDriver() {
	return driver;
   }
   public void setDriver(String driver) {
	this.driver = driver;
	System.out.println("Driver method called");
   }
   public String getUrl() {
	return url;
   }
   public void setUrl(String url) {
	this.url = url;
	System.out.println("Url method called");
   }
   @Override
   public String toString() {
	return "DbCon [driver=" + driver + ", url=" + url + "]";
   }
   
   
   
   
   
}
