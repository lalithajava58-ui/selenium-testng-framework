package com.company.framework.driver;


	
	
	
	import com.company.framework.config.Config;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DriverFactory {
	    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    public static WebDriver getDriver() {
	        return driver.get();
	    }

	    public static void initDriver() {
	        String browser = Config.BROWSER.toLowerCase();

	        if (browser.equals("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            ChromeOptions options = new ChromeOptions();

	            if (Config.HEADLESS) {
	                options.addArguments("--headless=new");
	            }
	            options.addArguments("--no-sandbox");
	            options.addArguments("--disable-dev-shm-usage");
	            options.addArguments("--window-size=1920,1080");

	            driver.set(new ChromeDriver(options));
	        } else {
	            throw new RuntimeException("Browser not supported: " + browser);
	        }
	    }

	    public static void quitDriver() {
	        if (getDriver() != null) {
	            getDriver().quit();
	            driver.remove();
	        }
	    }
	}


