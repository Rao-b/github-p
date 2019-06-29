package com.GetAttributes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTour_Register_GetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url= "http://www.newtours.demoaut.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement register =driver.findElement(By.linkText("REGISTER"));
		String register_hrefurl = register.getAttribute("href");
		System.out.println(register_hrefurl);
		register.click();
		String actual_registerurl = driver.getCurrentUrl();
		System.out.println(actual_registerurl);
		if(actual_registerurl.equals(register_hrefurl))
		{
			System.out.println(("Successful"));
		}
		else
		{
			System.out.println("failed");
			
		}
		driver.quit();

	}

}
