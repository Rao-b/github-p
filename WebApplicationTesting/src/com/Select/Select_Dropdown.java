package com.Select;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		String url = "http://newtours.demoaut.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("REGISTER")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement countries=driver.findElement(By.name("country"));
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select selection= new Select(countries);
		selection.selectByValue("200");
		
		
		
		
		

	}

}
