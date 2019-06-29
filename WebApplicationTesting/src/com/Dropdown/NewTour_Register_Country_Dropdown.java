package com.Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTour_Register_Country_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
				
		String url= "http://www.newtours.demoaut.com";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement country=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
        
		List<WebElement>countryNames= country.findElements(By.tagName("option"));
        
		int countryCount=countryNames.size();
        
		System.out.println(countryCount);
        
		for(int i=0;i<countryCount;i++)
        {
        	String countries = countryNames.get(i).getText();
           	System.out.println(countries);
        	
        }
	}

}