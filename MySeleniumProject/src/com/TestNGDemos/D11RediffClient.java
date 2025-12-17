package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D11RediffClient {
	WebDriver driver;
	RediffUtility r1;
	
	@Test
	public void createUser() {
		r1.setFullName("Shashikant Mall");
		r1.setRediffId("shashikantmall");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility();
	}

	@AfterTest
	public void afterTest() {
		
	}

}
