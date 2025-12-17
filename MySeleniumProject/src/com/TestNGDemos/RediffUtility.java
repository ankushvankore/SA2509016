package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RediffUtility {
	WebDriver driver;
	
	public void setFullName(String fn) {
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
	}
	public void setRediffId(String rid) {
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(rid);
	}
}
