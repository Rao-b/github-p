package com.ExcelOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingFirst_Colume {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.timeanddate.com/worldclock/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement webtable = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
		
		String part1 ="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[" ;
		
		String part2 = "]/td[1]";
		
		for(int i=1; i<=36; i++)
		{
			String city_Name = webtable.findElement(By.xpath(part1+i+part2)).getText();
			
			System.out.println(city_Name);
			
		}
			
				
	}

}
