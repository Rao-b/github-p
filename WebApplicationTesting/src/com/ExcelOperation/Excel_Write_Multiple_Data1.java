package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Multiple_Data1 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./src/excel_InputFiles/Excel_read1_Oparation.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook (file);
		XSSFSheet sheet = workBook.getSheet("sheet1");
		Row r = sheet.getRow(0);
		Cell c = r.createCell(1);
		c.setCellValue("Value");
		FileOutputStream file1=FileOutputStream("./src/excel_InputFiles/Excel_read1_Oparation.xlsx");
		workBook.write(file1);

	}

	private static FileOutputStream FileOutputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
