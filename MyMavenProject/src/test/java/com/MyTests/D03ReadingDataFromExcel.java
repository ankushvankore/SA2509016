package com.MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class D03ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		/*
		 * Add 2 depencencies
		 * 1. Apache POI
		 * 2. Apache POI OOXML
		 */
		
		File file = new File("C:\\Users\\Dell\\Desktop\\OHRMLoginData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cells; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
		wb.close();
		fis.close();
	}

}
