package com.idnyc.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	protected WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public String getTitleOfThePage() {
		String title = driver.getTitle();
		return title;
	}
	
	public InstructionsPage clickApplyForIdCardLink() throws InterruptedException {
		driver.findElement(By.linkText("Apply for an IDNYC Card")).click();
		Thread.sleep(3000);
		return new InstructionsPage(driver);
	}
}






