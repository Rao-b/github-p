package com.DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class OrangeHRM_LogIn1 extends Base_Test{
	
	
	// Not Execute
	
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream("./src/excel_InputFiles/Excel_OrangeHRM.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet("sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		
		System.out.println("Total rows ="+rowCount);
		
		for(int i=1; i<=rowCount; i++)
		{
			Row r = sheet.getRow(i);
			switch(i) 
			{
			case 1:
				
				
				driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
				
		        break;
		        
			case 2:
				
				driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(0).getStringCellValue());
				driver.findElement(By.id("btnLogin")).click();

				
			
			}
			workBook.close();

			
						
	     }	
		
	}	
	
}	
		
	
		
		
		
		
	