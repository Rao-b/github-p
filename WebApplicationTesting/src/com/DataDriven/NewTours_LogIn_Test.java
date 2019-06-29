package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_LogIn_Test extends BaseTest1{
	
	@Test
	 public void Login() throws IOException
	 {
		FileInputStream file = new FileInputStream("./src/excel_InputFiles/Excel_NewTour_Login1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("sheet1");
		int rowCount = sheet.getLastRowNum();
		for(int i=0; i<rowCount;i++)
		{
			Row r = sheet.getRow(i);
			driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys(r.getCell(0).getStringCellValue());
			
			//driver.findElement(By.xpath("//*[@name= �login�]")).click();
			
			
		}
		
		WebElement sde = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input"));
		sde.click();
	 }
	 
	


}
