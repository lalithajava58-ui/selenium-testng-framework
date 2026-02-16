package com.company.tests.testcases;


	
	
	

	import com.company.framework.config.Config;
	import com.company.tests.base.BaseTest;
	import com.company.tests.pages.GooglePage;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class GoogleSearchTest extends BaseTest {

	    @Test
	    public void verifyGoogleSearch() {
	        GooglePage google = new GooglePage(driver);
	        google.open(Config.BASE_URL);
	        google.search("Selenium TestNG Maven");

	        Assert.assertTrue(driver.getTitle().toLowerCase().contains("selenium"),
	                "Title should contain 'selenium'");

			System.out.println("Hello World why always");
	    }
	

}
