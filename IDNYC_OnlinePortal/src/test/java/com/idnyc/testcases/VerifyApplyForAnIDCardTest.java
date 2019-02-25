package com.idnyc.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.idnyc.testbase.TestBase;



public class VerifyApplyForAnIDCardTest extends TestBase {
	
	@Test
	public void applyForIDCardTest() throws InterruptedException {
		 landingPage.clickApplyForIdCardLink().clickStartApplication().switchFrame().getPersonalInfo();;
		//Assert.assertEquals(title, "");
		
	}
	

	

}
