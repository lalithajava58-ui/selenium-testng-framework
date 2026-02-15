package com.company.tests.pages;


	
	
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;

	public class GooglePage {
	    private final WebDriver driver;

	    private final By searchBox = By.name("q");

	    public GooglePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void open(String url) {
	        driver.get(url);
	    }

	    public void search(String text) {
	        driver.findElement(searchBox).sendKeys(text, Keys.ENTER);
	    }
	}


