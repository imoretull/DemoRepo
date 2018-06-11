package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\myDevelopment\\installs\\drivers\\geckodriver.exe");
		//this is an added comment
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
