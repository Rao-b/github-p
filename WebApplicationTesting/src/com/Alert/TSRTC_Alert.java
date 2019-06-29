package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		
		String url = "https://www.tsrtconline.in";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String alt_Massage = alt.getText();
		
		System.out.println(alt_Massage);
		
		Thread.sleep(1000);
		
		alt.accept();
		
		
		

	}

}
