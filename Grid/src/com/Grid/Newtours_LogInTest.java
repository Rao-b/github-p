package com.Grid;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Newtours_LogInTest {
	
	@Parameters("Browser")
	@Test
	public void LogIn(String Browser) throws MalformedURLException
	{
		System.out.println("The Browser name is :"+Browser);
		DesiredCapabilities cap =  null;
		if(Browser.equalsIgnoreCase("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		else
			if(Browser.equalsIgnoreCase("chrome"))
			{
				cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
				
			}
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.69:4444/wd/hub"),cap);
		
		String url = "http://www.newtours.demoaut.com/";
		driver.get(url);
		
			
	}

}
