package com.MouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		String url= "https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement singIn = driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[1]"));
		Actions act =new Actions(driver);
		act.moveToElement(singIn).perform();
		driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span")).click();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.quit();
		

	}

}
