package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class LoginPageTest extends TestBase{

		
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test(description = "Verify the login", enabled = true, priority = 1)
	public void testLogin() {
		
		System.out.println(driver.getTitle());
		
	}
	
	/*
	@Test(description = "Verify title of homepage")
	public void verifyTitle() {
		
		Assert.assertEquals(true, true);
	}
	*/
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
