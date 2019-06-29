package com.KeywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest_Orange {
	
	WebDriver driver = null;
	String url = "https://opensource-demo.orangehrmlive.com/";
	String Uname ="Admin";
    String pwd = "admin123";
	
	@BeforeTest
	public void setup()
	{
	
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	
	}
	/*
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	*/

}