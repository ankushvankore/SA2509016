package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class D11RediffClient {
	WebDriver driver;
	RediffUtility r1;
	
	@Test
	public void createUser1() {
		r1.setFullName("Shashikant Mall");
		r1.setRediffId("shashikantmall");
		r1.setPassword("Shashi!234");
		r1.setBirthDate("10", "OCT", "1991");
		r1.selectGender("Male");
	}
	
	@Test
	public void createUser2() {
		r1.setFullName("Neha Sharma");
		r1.setRediffId("nehasharma123");
		r1.setPassword("neha!234");
		r1.setBirthDate("15", "JUL", "1994");
		r1.selectGender("Female");
	}
	
	@BeforeMethod
	public void clearForm() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		r1 = new RediffUtility(driver);
	}

	@AfterTest
	public void afterTest() {
		
	}

}
