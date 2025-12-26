package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class S05TestSeleniumPage {
	WebDriver driver;

	@Before
	public void beforeHook() {
		System.out.println("Before Hook Executed");
	}

	@After
	public void closeBrowser() {
		driver.close();
	}

	@Given("Launch the application {string}")
	public void launch_the_application(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(url);
	}

	@When("Click on Downloads link")
	public void click_on_downloads_link() {
		driver.findElement(By.partialLinkText("Down")).click();
	}

	@Then("Downloads page should open")
	public void downloads_page_should_open() {
		Assert.assertTrue(driver.getTitle().contains("Downloads"));
	}

	@When("Click on Documentation link")
	public void click_on_documentation_link() {
		driver.findElement(By.partialLinkText("Docum")).click();
	}

	@Then("Documentation page should display")
	public void documentation_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Browser"));
	}

	@When("Click on Projects link")
	public void click_on_projects_link() {
		driver.findElement(By.partialLinkText("Projects")).click();
	}

	@Then("Projects page should display")
	public void projects_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Projects"));
	}

	@When("Click on Support link")
	public void click_on_support_link() {
		driver.findElement(By.partialLinkText("Support")).click();
	}

	@Then("Support page should display")
	public void support_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Support"));
	}
}
