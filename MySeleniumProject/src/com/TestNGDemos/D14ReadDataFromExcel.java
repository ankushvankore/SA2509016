package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D14ReadDataFromExcel {
	String fPath = "ExcelFiles\\OHRMLoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test(enabled = false)
	public void readTheData() {
		row = sheet.getRow(0);
		cell = row.getCell(0);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		cell = row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
	}
	
	@Test
	public void readAllData() {
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		/*for(int i = 0; i < rows; i++) {
			row = sheet.getRow(i);
			for(int j = 0; j < cells; j++) {
				cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
			System.out.println("-----------------");
		}*/
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cells; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);	//Read the workbook which is already created
		sheet = wb.getSheet("Login Data");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
