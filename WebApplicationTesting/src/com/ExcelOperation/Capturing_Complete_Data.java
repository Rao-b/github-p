package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_Complete_Data {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.timeanddate.com/worldclock/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String part1 = "/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		
		String part2 = "]/td[";
		
		String part3 = "]";
		
		
		FileInputStream file = new FileInputStream("./src/excel_Outpu_Data/Excel_WorldTime_Data.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet("sheet1");
		
		
		
		for(int i=1; i<=36; i++)
		{
			for(int k=1; k<=8; k++)
			{
				String data = driver.findElement(By.xpath(part1+i+part2+k+part3)).getText();
				
				System.out.print(data+" ");
				
				Row r = sheet.getRow(i);
	        	
	        	Cell c = r.createCell(k);
	        	
	        	c.setCellValue(data);
	        	
	        	FileOutputStream file1 = new FileOutputStream("./src/excel_Outpu_Data/Excel_WorldTime_Data.xlsx");
	           
	        	workBook.write(file1);
			}
			System.out.println();
		}
	}

}
