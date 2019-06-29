package com.BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FireFoxBrowserAutomation {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String url  = "https://www.facebook.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
	}

}
