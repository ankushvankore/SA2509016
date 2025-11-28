package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D02LaunchingEdge {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.speedtest.net/");
		
		driver.close();
	}

}
