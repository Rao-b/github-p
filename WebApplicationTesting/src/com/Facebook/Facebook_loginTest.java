package com.Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_loginTest {

	public static void main(String[] args) {
		
		WebDriver driver =null;
		
		driver = new FirefoxDriver();
		
		driver.navigate().to("http://facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("email")).sendKeys("email@com");
		
		driver.findElement(By.id("pass")).sendKeys("password");
		
		WebElement loginButton = driver.findElement(By.id("u_0_2"));
		
		loginButton.click();
		

	}

}
