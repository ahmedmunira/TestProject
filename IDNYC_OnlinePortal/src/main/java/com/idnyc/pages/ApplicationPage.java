package com.idnyc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ApplicationPage extends LandingPage {

	public ApplicationPage(WebDriver driver) {
		super(driver);
		
	}
	
	public ApplicationPage getPersonalInformation() throws InterruptedException {
		//driver.switchTo().frame("c-auyck8ii7zt4");
		//WebElement iframe = driver.findElement(By.tagName("iframe"));
		//driver.switchTo().frame(iframe);
		//Thread.sleep(2000);
		
		driver.findElement(By.name("FirstName")).sendKeys("lllllll");
		driver.findElement(By.id("TextAppDetaillastname")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//*[@id='applicantInformation']/fieldset[1]/div/div[6]/div[2]/button/img")).click();
		driver.findElement(By.xpath(" //*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[7]/a")).click();
		
		WebElement eyeclor = driver.findElement(By.id("TextAppDetaileyecolor"));
		Select selectEyecolor = new Select(eyeclor);
		selectEyecolor.selectByVisibleText("Brown");
		
		WebElement hightFeet = driver.findElement(By.id("TextAppDetailheightfeet"));
		Select selectHightFeet = new Select(hightFeet);
		selectHightFeet.selectByValue("number:5");
		
		WebElement hightInche = driver.findElement(By.id("TextAppDetailheightinches"));
		Select selectHightInch = new Select(hightInche);
		selectHightInch.selectByValue("number:3");
		
		WebElement gender = driver.findElement(By.id("TextAppDetailgender"));
		Select selectGender = new Select(gender);
		selectGender.selectByVisibleText("Female");
		
		driver.findElement(By.id("TextAppDetailemail")).sendKeys("abc@gamil.com");
		 
		return new ApplicationPage(driver);
		
		}
	
	

}
