package com.company.framework.config;

public class Config {
	
	


	
	    public static final String BASE_URL = System.getProperty("baseUrl", "https://www.google.com");
	    public static final String BROWSER = System.getProperty("browser", "chrome");
	    public static final boolean HEADLESS = Boolean.parseBoolean(System.getProperty("headless", "true"));
	

}
