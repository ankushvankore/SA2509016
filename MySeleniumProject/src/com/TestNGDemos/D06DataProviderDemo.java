package com.TestNGDemos;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D06DataProviderDemo {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	String actUrl;
	
	@Test(dataProvider = "getLoginData")
	public void login(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		actUrl = driver.getCurrentUrl();
		
		//Assert.assertEquals(actUrl, expUrl);
		//Assert.assertTrue(actUrl.equals(expUrl));
		Assert.assertTrue(actUrl.contains("dash"));
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "akhila", "akhila123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "amir", "amir123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "bhagya", "bhagya123" },
		};
		//Object[][]data = {{1, "a", 1.1}, {2, "b", 2.2}, {3, "c", 3.3}};
		//return data;
	}
	@AfterMethod
	public void logout() {
		if(driver.getCurrentUrl().contains("dash")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Test case pass");
		}
		else {
			System.out.println("Test case fail");
		}
	}

	@BeforeTest
	public void beforeTest() {
		Map<String, Object>pref = new HashMap<>();
		pref.put("profile.credentials_enable_serve", false);
		pref.put("profile.password_manager_leak_detection", false);
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("prefs", pref);
		
		driver = new ChromeDriver(op);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
