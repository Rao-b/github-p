package com.Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://opensource-demo.orangehrmlive.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
		driver.findElement(By.id("btnLogin")).click();
	    
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
		WebElement pim = driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b"));
	    
		Actions act= new Actions(driver);
	    
		act.moveToElement(pim).perform();
	    
		driver.findElement(By.linkText("Add Employee")).click();
	    
		driver.findElement(By.id("firstName")).sendKeys("Ravi");
	    
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
	    
		String empId = driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).getText();
	    
		System.out.println(empId);
	    
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
		

	}

}
