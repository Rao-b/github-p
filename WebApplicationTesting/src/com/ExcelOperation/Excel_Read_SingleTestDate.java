package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestDate {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("./src/excel_InputFiles/Excel_read_Oparation.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Row r = sheet.getRow(0);
		Cell c = r.getCell(0);
		String data = c.getStringCellValue();
		System.out.println(data);
		
		
	}

}
