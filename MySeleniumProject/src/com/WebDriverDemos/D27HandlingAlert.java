package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D27HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Alert alt;
		
		js.executeScript("window.scrollBy(0, 150)", "");
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();				//Will click on Ok button
		
		WebElement button2 = driver.findElement(By.id("timerAlertButton"));
		button2.click();
		//Thread.sleep(5000);
		wait.until(ExpectedConditions.alertIsPresent());
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();				//Will click on Cancel button
		
		WebElement button3 = driver.findElement(By.id("confirmButton"));
		js.executeScript("arguments[0].click()", button3);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		//WebElement button4 = driver.findElement(By.id("promtButton"));
		//js.executeScript("arguments[0].click()", button4);
		js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		alt = driver.switchTo().alert();
		alt.sendKeys("Varsha");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
	}

}
