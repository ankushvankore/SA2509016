package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataProviderDemo {
	
	@Test(dataProvider = "getLoginData")
	public void login(Integer n, String s, double d) {
		System.out.println(n);
		System.out.println(s);
		System.out.println(d);
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { 1, "a", 1.1 },
			new Object[] { 2, "b", 2.2 },
			new Object[] { 3, "c", 3.3 },
		};
	}
	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
