package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D07DependsOnMethod {
	@Test
	public void login() {
		System.out.println("Login started!!!");

		Assert.assertTrue(false);
		
		System.out.println("Login success!!!");
	}
	
	@Test(dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout test!!!");
	}
}
