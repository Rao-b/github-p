package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest1 {
	

	   WebDriver driver = null;
	   
	   String url = "http://www.newtours.demoaut.com/";
	   
	   String Username = "tutorial";
	   
	   String Password = "tutorial";
	   
	   
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
