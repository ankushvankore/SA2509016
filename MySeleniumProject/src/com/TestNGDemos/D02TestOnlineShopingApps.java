package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02TestOnlineShopingApps {
	@Test (priority = 3)
	public void testPharmeasy() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://pharmeasy.in/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test (priority = 2)
	public void testFirstCry() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.firstcry.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test (priority = 1)
	public void testKisankonnect() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.kisankonnect.in/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
	@Test (priority = 4)
	public void testNykaa() {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.nykaa.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
	}
}
