package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Data2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("./src/excel_InputFiles/Excel_read_Oparation.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
        Row r = sheet.getRow(0);
        Cell c = r.createCell(3);
        c.setCellValue("password");
        FileOutputStream file1 = new FileOutputStream("./src/excel_InputFiles/Excel_read_Oparation.xlsx");
        workBook.write(file1);

	}

}
