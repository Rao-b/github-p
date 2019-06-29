package com.LoginTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Motto_Login {

	public static void main(String[] args) {
		WebDriver driver =null;
		driver = new FirefoxDriver();
		driver.navigate().to("http://192.168.1.3:8000/recruitmentmanagement/admin/login.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUserName")).sendKeys("jagan");
		driver.findElement(By.id("txtPassword")).sendKeys("test@123");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();


	}

}
