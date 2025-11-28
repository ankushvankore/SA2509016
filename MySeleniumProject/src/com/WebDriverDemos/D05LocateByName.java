package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.name("email"));	
		//Please find a control on this page whose name is "email" and 
		//store this control in object called as userName
		userName.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("test123");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
