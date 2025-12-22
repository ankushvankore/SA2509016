package com.MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class D04NormalReport {

	public static void main(String[] args) {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("SimpleReport.html");
		//This object represents the report file in which report will be stored
		ExtentReports report = new ExtentReports();
		//This object represents the actual report.
		ExtentTest test;
		
		report.attachReporter(htmlReport);
		//Save the report in the file which we have declared
		
		//Add environment details for report
		report.setSystemInfo("Laptop Name", "Dell");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("User Name", "Akhila");
		report.setSystemInfo("Browser", "Google Chrome");
		
		//Configuration of Report file (html file)
		htmlReport.config().setDocumentTitle("My First Extent Report");
		htmlReport.config().setReportName("Google Tests");
		htmlReport.config().setTheme(Theme.STANDARD);
		htmlReport.config().setTimeStampFormat("dd-MMM-yyyy");
		
		test = report.createTest("Google Title Test");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		System.out.println("Title: " + driver.getTitle());
		
		driver.close(); 
		
		test.log(Status.PASS, MarkupHelper.createLabel("Google Title Test Case", ExtentColor.GREEN));
		
		
		test = report.createTest("Google Search");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Dhurandhar", Keys.ENTER);
		
		driver.close(); 
		
		test.log(Status.FAIL, MarkupHelper.createLabel("Google Search Functionlity", ExtentColor.RED));
		
		report.flush();
		//This will generate the report
	}

}
