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

public class D13CreateFriendsData {
	File file;
	FileOutputStream fos;	//As we are writing the data
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;	
	
	@Test
	public void createData() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Neha");
		
		//row = sheet.createRow(0);
		cell = row.createCell(1);
		cell.setCellValue("Sharma");
		
		sheet.getRow(0).createCell(2).setCellValue("Patiala");

		row = sheet.createRow(1);
		cell = row.createCell(0);
		cell.setCellValue("Sana");
		
		cell = row.createCell(1);
		cell.setCellValue("Bennur");
		
		cell = row.createCell(2);
		cell.setCellValue("Pune");
		
		sheet.createRow(2).createCell(0).setCellValue("Pooja");
		sheet.getRow(2).createCell(1).setCellValue("Shivankar");
		sheet.getRow(2).createCell(2).setCellValue("Nanded");
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File("ExcelFiles\\FriendsData.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet();
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
