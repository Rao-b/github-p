package com.Tsrtc;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_HeaderBlock_ElementCount_And_DisplayLinks {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url= "https://www.tsrtconline.in";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement headerBlock = driver.findElement(By.className("menu-wrap"));
		System.out.println(headerBlock);
		List<WebElement>links =headerBlock.findElements(By.tagName("a"));
		System.out.println("The Total number of elements of the headerfile are " + links.size());
		for(int i=0;i<links.size();i++)
		{
			String LinkNames = links.get(i).getText();
			System.out.println(LinkNames);
			
		}
		
		driver.quit();
		
 
	}

}
