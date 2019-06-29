package com.Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Gmail {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String url = "https://opensource-demo.orangehrmlive.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div[2]/input")).sendKeys("Admin");
		
		
		
	}

}
