package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D30HoverTheMouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://istqb.in/");
		
		Actions act = new Actions(driver);
		
		WebElement spMenu = driver.findElement(By.linkText("SPECIALIST"));
		act.moveToElement(spMenu).perform();
		
		List<WebElement>subMenus = driver.findElements(By.cssSelector("ul[class=\"sp-dropdown-items\"]>li>a"));
		System.out.println("------- Sub Menus -------------");
		
		for(WebElement sm :subMenus)
			System.out.println(sm.getText());
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
