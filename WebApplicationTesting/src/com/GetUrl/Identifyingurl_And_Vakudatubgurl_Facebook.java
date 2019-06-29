package com.GetUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identifyingurl_And_Vakudatubgurl_Facebook {

	public static void main(String[] args) {
		String Url = "http://facebook.com";
		WebDriver driver = new FirefoxDriver();
		driver.get(Url);
		System.out.println("The Title of Facebook homepage is :" +driver.getTitle());
		String expected_url = "facebook.com";
		System.out.println("The Expected url of fb is :" +expected_url);
		String actual_url = driver.getCurrentUrl();
		System.out.println("The actual url of fb is :" +actual_url);
		
		if (actual_url.contains(expected_url))
		{
			System.out.println("Successful navigate to...pass" );
		}
		else
		{
			System.out.println("Failed to ");
		}
			
		driver.quit();
				
	
	}

}
