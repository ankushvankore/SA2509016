package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LocateByPartialLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//WebElement link = driver.findElement(By.partialLinkText("How"));
		//link.click();
		driver.findElement(By.partialLinkText("Search")).click();
		
	}

}
