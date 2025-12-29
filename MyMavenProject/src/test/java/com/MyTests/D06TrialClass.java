package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

@Listeners(com.MyTests.MyListners.class)
public class D06TrialClass {
	@Test
	public void testCase1() {
		System.out.println("Test Case 1 Started");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testCase2() {
		System.out.println("Test Case 2 Started");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testCase3() {
		System.out.println("Test Case 3 Started");
		throw new SkipException("Skipping this test");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

}
