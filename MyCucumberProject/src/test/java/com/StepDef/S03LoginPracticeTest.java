package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03LoginPracticeTest {
	WebDriver driver;

	// Valid data

	@Given("Launch Practice Test Application")
	public void launch_practice_test_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practice.expandtesting.com/login");
	}

	@When("Enter valid user name")
	public void enter_valid_user_name() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("practice");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='submit-login']")).submit();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
	}

	// Invalid data


	@When("Enter invalid user name and invalid password")
	public void enter_invalid_user_name_and_invalid_password() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("amir");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	}

	@When("I Click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//button[@id='submit-login']")).submit();
	}

	@Then("Error message should display")
	public void error_message_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
	}
}
