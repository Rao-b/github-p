package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Multiple_Data {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("./src/excel_InputFiles/Excel_read1_Oparation.xlsx");
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workBook.getSheet("sheet1");
		
		int rowCount = sheet.getLastRowNum();
		
		System.out.println("Total rows ="+rowCount);
		
		for(int i=0; i<=1; i++)
		{
			Row r = sheet.getRow(i);
			
			int cellCount = r.getLastCellNum();
			
			//System.out.println("Total Cells ="+cellCount);
			
			
			for (int j=0; j<1; j++)
			{
			
				String data=r.getCell(j).getStringCellValue();
			
				System.out.print(data+" ");
			}
			
			System.out.println();
			
			
				
		}
		
		
		
		

	}

	
	

}
