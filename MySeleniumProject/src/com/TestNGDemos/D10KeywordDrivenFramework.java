package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class D10KeywordDrivenFramework {
	File file;
	FileInputStream fis;
	Properties prop;	//Because we are reading the properties from .properties file
	WebDriver driver;
	
	@Test
	public void automobileTest() {
		driver.findElement(By.linkText(prop.getProperty("autoLinkText"))).click();
		Select makeDD = new Select(driver.findElement(By.id(prop.getProperty("makeID"))));
		makeDD.selectByIndex(2);
		driver.findElement(By.xpath(prop.getProperty("epXPath"))).sendKeys("1000");
		driver.findElement(By.name(prop.getProperty("domName"))).sendKeys("12/01/2025");
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("src/com/TestNGDemos/MyLocators.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		//Will load all the properties from .properties file
		
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
	}

}
