package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RediffUtility {
	WebDriver driver;
	
	//Page Factory ==> Object Repository
	@FindBy (xpath = "//input[@placeholder='Enter your full name']")WebElement fullName;
	@FindBy (id = "newpasswd")WebElement passwordTx;
	
	public RediffUtility(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	public void setFullName(String fn) {
		//driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys(fn);
		fullName.sendKeys(fn);
	}
	public void setRediffId(String rid) {
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys(rid);
	}
	
	public void setPassword(String ps) {
		//driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys(ps);
		passwordTx.sendKeys(ps);
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys(ps);
	}
	
	public void setBirthDate(String day, String month, String year) {
		new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[8]/select[1]"))).selectByVisibleText(day);
		new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[8]/select[2]"))).selectByVisibleText(month);
		new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[8]/select[3]"))).selectByVisibleText(year);
	}
	
	public void selectGender(String gn) {
		if(gn.equals("Male"))
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[9]/div[1]/label[1]/input[1]")).click();
		else
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[9]/div[1]/label[2]/input[1]")).click();
	}
}
