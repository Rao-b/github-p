package com.NewtourLinkTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtour_Home_LinksTesting {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url= "http://www.newtours.demoaut.com";
		driver.get(url);
		driver.manage().window().maximize();
		 List<WebElement>links =driver.findElements(By.tagName("a"));
		 int links_count= links.size();
		 System.out.println("The Total number of links on NewTours home pages " + links_count );
		 for(int i=0;i<links_count;i++)
		 {
			 String linkNames = links.get(i).getText();
			 System.out.println(i+" "+linkNames);
			 links.get(i).click();
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.navigate().back();
			 links=driver.findElements(By.tagName("a"));
			 
		 }
		 driver.quit();
			 
	}

}