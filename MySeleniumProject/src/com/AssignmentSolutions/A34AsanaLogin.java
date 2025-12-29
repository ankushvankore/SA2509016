package com.AssignmentSolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A34AsanaLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://asana.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement loginLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/nav/div/div[2]/div/div[1]/a[2]/span[1]"));
		
		js.executeScript("arguments[0].click()", loginLink);
		
		Thread.sleep(5000);
		driver.close();
	}

}
