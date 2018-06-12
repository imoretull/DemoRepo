package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){

		try {
			
			// Is there a way to get project file path instead of whole D path.
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\myDevelopment\\workspaces\\"
					+ "SampleProject\\DemoGITRepo\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		
		String browserName = prop.getProperty("browser");
		
		// Store .exe in project folder and change path?
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\myDevelopment\\installs\\drivers\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\myDevelopment\\installs\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
