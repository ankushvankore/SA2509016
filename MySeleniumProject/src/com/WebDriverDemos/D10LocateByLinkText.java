package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement storeLink = driver.findElement(By.linkText("Store"));
		String text = storeLink.getText();
		System.out.println("Text on the link: " + text);
		//String href = storeLink.getAttribute("href");
		String href = storeLink.getDomAttribute("href");
		System.out.println("Reference of Link: " + href);
		
		storeLink.click();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("store"))
			System.out.println("Store page launched!!!\nTest case pass");
		else
			System.out.println("Test case fail");
	}

}
