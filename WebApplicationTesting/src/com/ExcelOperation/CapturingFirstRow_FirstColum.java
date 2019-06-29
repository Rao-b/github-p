package com.ExcelOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingFirstRow_FirstColum {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.timeanddate.com/worldclock/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement country_name=driver.findElement(By.linkText("Accra"));
		
		String country_Text = country_name.getText();
		
		System.out.println(country_Text);
		
		
		

	}

}
