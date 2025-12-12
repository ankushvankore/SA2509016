package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D01FirstTest {
	@Test
	public void testSelenium() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/downloads/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	
	public void trialMethod() {
		System.out.println("This is trial method");
	}
}
