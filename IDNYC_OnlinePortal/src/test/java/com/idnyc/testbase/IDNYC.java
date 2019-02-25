package com.idnyc.testbase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IDNYC {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://a069-idnyconlineportal.nyc.gov/IOPWeb/#/EN/Dashboard");;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		String til = driver.getTitle();
		System.out.println(til);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Apply for an IDNYC Card")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='startapplicationbtn']/table/tbody/tr/td[2]/button")).click();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total iframe: " + size);
		
		driver.switchTo().frame(3);
		Thread.sleep(2000);
		driver.findElement(By.id("TextAppDetailfirstname")).sendKeys("hhh");
		
		
		
	}

}
