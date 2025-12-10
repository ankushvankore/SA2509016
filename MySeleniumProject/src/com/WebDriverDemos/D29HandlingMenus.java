package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29HandlingMenus {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		List<WebElement>links = driver.findElements(By.xpath("//ul[@class=\"oxd-main-menu\"]/li/a"));
		System.out.println("Total links: " + links.size());
		
		System.out.println("------------ All Links ------------");
		for(WebElement l : links)
			System.out.println(l.getText());
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();
	}

}
