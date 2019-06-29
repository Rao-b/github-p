package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class NewTours_Write_Excel {

	public static void main(String[] args) throws IOException {
	    WebDriver driver = new FirefoxDriver();
	    String url = "http://newtours.demoaut.com/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    WebElement register=driver.findElement(By.linkText("REGISTER"));
	    register.click();
	    
        
        WebElement country=driver.findElement(By.name("country"));
        
		List<WebElement>countryNames= country.findElements(By.tagName("option"));
        
		int countryCount=countryNames.size();
		
	   	     	    
	    	    
		FileInputStream file = new FileInputStream("./src/excel_Outpu_Data/Excel_Write_Data2.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet("sheet1");
		
		         
		
        		        
		for(int i=0;i<countryCount;i++)
        {
        	String countries = countryNames.get(i).getText();
        	
        	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
           	
        	System.out.println(countries);
        	
        	Row r = sheet.createRow(i);
        	
        	Cell c = r.createCell(0);
        	
        	c.setCellValue(countries);
        	
        	 FileOutputStream file1 = new FileOutputStream("./src/excel_Outpu_Data/Excel_Write_Data2.xlsx");
             workBook.write(file1);
        	
        	
        }

	    
   	}

	
}

	
	


