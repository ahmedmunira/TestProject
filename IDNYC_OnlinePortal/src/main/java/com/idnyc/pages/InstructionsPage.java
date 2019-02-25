package com.idnyc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstructionsPage extends LandingPage {

	public InstructionsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public InstructionsPage clickStartApplication() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='startapplicationbtn']/table/tbody/tr/td[2]/button")).click();
		return new InstructionsPage(driver);
	}
	
	public InstructionsPage switchFrame() {
		WebElement iframe = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframe);
		return new InstructionsPage(driver);
		
	}
	
	public void getPersonalInfo() {
		driver.findElement(By.name("FirstName")).sendKeys("lllllll");
	}
	
	
	
	
	
	
	
	

}
