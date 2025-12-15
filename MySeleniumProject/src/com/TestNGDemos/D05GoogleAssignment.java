package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05GoogleAssignment {
	WebDriver driver;
	@Test(priority = 1, groups = "CoreLinks")
	public void clickOnGmail() {
		driver.findElement(By.linkText("Gmail")).click();
	}
	
	@Test(priority = 2, groups = "CoreLinks")
	public void clickOnImages() {
		driver.findElement(By.linkText("Images")).click();
	}
	
	@Test(priority = 3, groups = "GoogleLinks")
	public void clickOnAdvt() {
		driver.findElement(By.partialLinkText("Adve")).click();
	}
	
	@Test(priority = 4, groups = "GoogleLinks")
	public void clickOnAbout() {
		driver.findElement(By.partialLinkText("About")).click();
	}

	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://google.com");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod (alwaysRun = true)
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest (alwaysRun = true)
	public void beforeTest() {
		driver = new EdgeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterTest (alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
