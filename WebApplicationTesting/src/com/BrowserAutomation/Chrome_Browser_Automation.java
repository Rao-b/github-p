package com.BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browser_Automation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		String url = "https://www.facebook.com/";
		
		d.get(url);

	}

}
