package com.WorldClockTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class World_Clock_Time {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.timeanddate.com/worldclock/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String part1 = "/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		
		String part2 = "]/td[";
		
		String part3 = "]";
		
		for(int i=1; i<=36; i++)
		{
			for(int k=1; k<=8; k++)
			{
				String data = driver.findElement(By.xpath(part1+i+part2+k+part3)).getText();
				
				System.out.print(data+" ");
			}
			System.out.println();
		}
	}

	

}
