package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12WriteToExcel {
	File file;
	FileOutputStream fos;	//As we are writing the data
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;	
	
	@Test
	public void writeData() {
		row = sheet.createRow(0);		//Will create 1st row in the sheet
		cell = row.createCell(0);		//Will create 1st cell in 1st row
		
		cell.setCellValue("Sana");		//Will add the data to cell
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File("MyFirstExcelFile.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();			//Will create a workbook
		sheet = wb.createSheet("My First Sheet");		//Create a sheet 
	}

	@AfterTest
	public void afterTest() throws IOException {
		System.out.println("-------- Data added to Excel File -------");
		wb.write(fos);  //Will write the data to physical file
		wb.close();
		fos.close();
	}

}
