package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
