package com.MouseOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hello {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		String url="https://www.myntra.com/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement helloSignIn =driver.findElement(By.className("desktop-userTitle"));
		Actions act= new Actions(driver);
		act.moveToElement(helloSignIn).perform();
		driver.findElement(By.className("desktop-infoSection")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.quit();
		
		
		
		
		
	}

}
