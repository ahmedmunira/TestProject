package com.idnyc.testbase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.idnyc.pages.LandingPage;
import com.idnyc.util.WebDriverHelper;

public class TestBase {
	protected WebDriver driver;
	protected LandingPage landingPage;
	
	@BeforeMethod
	public void setup() {
	driver = WebDriverHelper.createDriver();	
	landingPage = new LandingPage(driver);
		
	}
	
	@AfterMethod
	public void tearDown() {
		WebDriverHelper.closeDriver(driver);
		
	}

}
