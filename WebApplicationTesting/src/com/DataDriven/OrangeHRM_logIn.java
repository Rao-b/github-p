package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrangeHRM_logIn extends Base_Test {
	
	@Test
	public void LogIn()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		password.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		
		
	}

	
	}


