package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03ReadingTheTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		//if(title.equals("Downloads | Selenium"))
		if(title.contains("Selenium"))
			System.out.println("Title matched!!!\nTest case pass");
		else
			System.out.println("Title not matching!!!\nTest case fail");
		
		driver.close();
	}

}
