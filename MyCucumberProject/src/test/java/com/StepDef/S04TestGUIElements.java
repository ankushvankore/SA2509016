package com.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04TestGUIElements {
	WebDriver driver;
	@Given("Open Test Automation Page")
	public void open_test_automation_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/?m=1");
	}

	@When("Enter name as {string}")
	public void enter_name_as(String name) {
		driver.findElement(By.id("name")).sendKeys(name);
	}

	@When("Enter email as {string}")
	public void enter_email_as(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@When("Enter phone no as {string}")
	public void enter_phone_no_as(String pNo) {
		driver.findElement(By.id("phone")).sendKeys(pNo);
	}

	@When("Enter address as {string}")
	public void enter_address_as(String address) {
		driver.findElement(By.id("textarea")).sendKeys(address);
	}

	@When("Select gender {string}")
	public void select_gender(String gn) {
		if(gn.equals("Male"))
			driver.findElement(By.id("male")).click();
		else
			driver.findElement(By.id("female")).click();
	}

	@Then("Process complete")
	public void process_complete() {
	    System.out.println("All elements tested successfuly");
	}
	
	
	@When("I Enter name as {string}")
	public void i_enter_name_as(String name) {
		driver.findElement(By.id("name")).sendKeys(name);
	}

	@When("I Enter email as {string}")
	public void i_enter_email_as(String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	@When("I Enter phone no as {string}")
	public void i_enter_phone_no_as(String pNo) {
		driver.findElement(By.id("phone")).sendKeys(pNo);
	}

	@When("I Enter address as {string}")
	public void i_enter_address_as(String address) {
		driver.findElement(By.id("textarea")).sendKeys(address);
	}

	@When("I Select gender {string}")
	public void i_select_gender(String gn) {
		if(gn.equals("Male"))
			driver.findElement(By.id("male")).click();
		else
			driver.findElement(By.id("female")).click();
	}

	@Then("The Process is complete")
	public void the_process_is_complete() {
	    System.out.println("Thanks for testing");
	}
}
