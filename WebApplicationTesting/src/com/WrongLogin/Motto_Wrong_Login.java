package com.WrongLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Motto_Wrong_Login {

	public static void main(String[] args) throws InterruptedException {
		String Url = "http://192.168.1.3:8000/recruitmentmanagement/admin/login.aspx";
		WebDriver driver = new FirefoxDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUserName")).sendKeys("xyz");
		driver.findElement(By.id("txtPassword")).sendKeys("test@1234");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		Thread.sleep(5000);
		driver.quit();

		System.out.println("Invalid Username & Password");		

	}

}
