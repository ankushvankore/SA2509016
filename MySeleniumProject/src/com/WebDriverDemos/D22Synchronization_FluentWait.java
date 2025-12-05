package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D22Synchronization_FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://omayo.blogspot.com/");
		
		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);
		
		WebElement chkBox = driver.findElement(By.id("dte"));
		
		driver.findElement(By.xpath("//*[@id=\"HTML47\"]/div[1]/button")).click();
		
		System.out.println("Before");
		System.out.println("Enabled: " + chkBox.isEnabled());
		System.out.println("Selected: " + chkBox.isSelected());
		
		wait.withTimeout(Duration.ofSeconds(20))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.elementToBeClickable(chkBox)).click();
		
		System.out.println("After");
		System.out.println("Enabled: " + chkBox.isEnabled());
		System.out.println("Selected: " + chkBox.isSelected());
	}

}
