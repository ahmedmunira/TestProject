package com.idnyc.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {
	
	/*
	 * public static void main(String[] args) { createDriver();
	 * 
	 * }
	 */
	
	static WebDriver driver;
	static Properties prop;
	static FileInputStream fis;
	
	public static WebDriver createDriver() {
		
		prop = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties" );
			try {
				prop.load(fis);
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/drivers/geckodriver");
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
			driver = new ChromeDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,  TimeUnit.SECONDS);
		
		return driver;
	
	}
	
	public static void closeDriver(WebDriver driver) {
		driver.quit();
	}

}
