package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;

public class LoginPageTest extends TestBase{

		
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test
	public void testLogin() {
		

		System.out.println(driver.getTitle());
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

		
		
		

}
