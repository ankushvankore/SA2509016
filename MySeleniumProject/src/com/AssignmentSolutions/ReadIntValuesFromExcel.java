package com.AssignmentSolutions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadIntValuesFromExcel {

	public static void main(String[] args) throws IOException {
		File file;
		FileInputStream fis;
		XSSFWorkbook wb;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;

		file = new File("Trial.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);			//We are not creating the workbook, rather reading the data from excting workbook
		sheet = wb.getSheetAt(0);

		int rows = sheet.getPhysicalNumberOfRows();
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();

		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < cells; j++)
			{
				cell = sheet.getRow(i).getCell(j);

				switch(cell.getCellType())
				{
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				default:
					break;
				}
			}
		}

		wb.close();
		fis.close();
	}
}


