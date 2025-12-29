package com.AssignmentSolutions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A33Revenue_Calculator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fitpeo.com/revenue-calculator");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 300)", "");

		driver.findElement(By.xpath("//*[@id=\":R57alklbrpida:\"]")).sendKeys(Keys.CONTROL, "A");
		driver.findElement(By.xpath("//*[@id=\":R57alklbrpida:\"]")).sendKeys("400");

		Thread.sleep(5000);
		driver.close();
	}

}
