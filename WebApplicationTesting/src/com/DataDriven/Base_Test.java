package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Base_Test {
	
	   WebDriver driver = null;
	   
	   String url = "https://opensource-demo.orangehrmlive.com/";
	   
	  // String Username = "Admin";
	   
	//   String Password = "admin123";
	   
	   
	   @BeforeTest
	   public void setup()
	   {
		   System.setProperty("webdriver.gecko.driver", "./driverFiles/chromedriver.exe");
		   
		   driver = new FirefoxDriver();
		   
		   driver.get(url);
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
	   }
	   
	   /* @AfterTest
	    public void tearDown()
	    {
	    	driver.quit();
	    }*/
	   

}
