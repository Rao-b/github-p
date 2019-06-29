package com.LoginTest;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.jetty.html.Select;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Motto_LoginTest {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		WebDriver driver = null;
		
		driver = new ChromeDriver();

		//WebDriver driver =null;
		//driver = new FirefoxDriver();
		driver.navigate().to("http://192.168.1.3:8000/recruitmentmanagement/admin/login.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("jagan");
		driver.findElement(By.id("txtPassword")).sendKeys("test@123");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("ctl00_ContentPlaceHolder2_txtName")).sendKeys("Naveen Kumar");
		driver.findElement(By.id("ctl00_ContentPlaceHolder2_txtEmail")).sendKeys("naveen_123@gmail.com");
		WebElement stream = driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlStreams"));
		Select selection = new Select(stream);
		 selection.selectByValue("4");
		 
		// driver.findElement(By.id("ctl00_ContentPlaceHolder2_txtFromDate")).sendKeys("07/JUN/2019");
		 
		 driver.findElement(By.id("ctl00_ContentPlaceHolder2_txtFromDate")).click();
		 //wait.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector(".pika-table")).get(0)));
		 driver.findElements(By.cssSelector
		            ("button[data-pika-day='22'][data-pika-month='11'][data-pika-year='2017']")).get(0).click();
		 
		 
		 
		 
		 
		 
		 WebElement stream1 = driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlStatus"));
			Select selection1 = new Select(stream1);
			selection.selectByValue("2");
			
			WebElement stream2 = driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlConsultancy"));
			Select selection2 = new Select(stream2);
			selection.selectByValue("65");
			
			 driver.findElement(By.id("ctl00_ContentPlaceHolder2_txtPhone")).sendKeys("9987654342");
			 
			 WebElement stream3 = driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlGender"));
			  Select selection3 = new Select(stream3);
				selection.selectByValue("True");
				
				WebElement stream4 = driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlPositions"));
				Select selection4 = new Select(stream4);
				selection.selectByValue("");
				
				WebElement stream5 = driver.findElement(By.id("ctl00_ContentPlaceHolder2_ddlRoundNumber"));
				Select selection5 = new Select(stream5);
				selection.selectByValue("2");
				
				
				
				
				
				driver.quit();
				
		
		
		
		

	}

}
