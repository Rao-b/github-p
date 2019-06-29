package com.bingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_IdentifyingTitle {

	public static void main(String[] args) {
		String url="http://bing.com";
		WebDriver driver =null;
		driver = new FirefoxDriver();
		driver.get(url);
		String bing_Title = driver.getTitle();
		System.out.println("The Title of Bing Home Page is:" +bing_Title);
		driver.quit();

	}

}
