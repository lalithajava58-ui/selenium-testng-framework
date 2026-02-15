package com.company.tests.base;


	
	


	import com.company.framework.driver.DriverFactory;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;

	public class BaseTest {
	    protected WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        DriverFactory.initDriver();
	        driver = DriverFactory.getDriver();
	    }

	    @AfterMethod(alwaysRun = true)
	    public void tearDown() {
	        DriverFactory.quitDriver();
	    }
	}


