package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D15LoginToOHRM_DDF {
	String fPath = "ExcelFiles\\OHRMLoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 1;
	String message; 
	
	WebDriver driver;
	
	@Test(dataProvider = "getLoginDetails")
	public void login(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterMethod
	public void afterMethod() {
		row = sheet.getRow(index);
		cell = row.getCell(2);
		//cell = sheet.getRow(1).getCell(2);
		
		if(driver.getCurrentUrl().contains("dash")) {
			message = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Test case pass");
			
			cell.setCellValue("Pass");
		}
		else {
			message = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
			System.out.println("Test case fail");
			
			cell.setCellValue("Fail");
		}
		sheet.getRow(index).getCell(3).setCellValue(message);
		
		index++;
	}


	@DataProvider
	public Object[][] getLoginDetails() {
		int rows = sheet.getPhysicalNumberOfRows();
		String[][]loginData = new String[rows-1][2];
		
		for(int i = 1; i < rows; i++) {
			row = sheet.getRow(i);
			for(int j = 0; j < 2; j++) {
				cell = row.getCell(j);
				loginData[i-1][j] = cell.getStringCellValue();
			}
		}
		
		return loginData;
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);	//Index starts form 0
		fos = new FileOutputStream(file);
		//Always configure fileoutputstream object after reading the sheet
		
		driver = new EdgeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		
		driver.close();
	}

}
