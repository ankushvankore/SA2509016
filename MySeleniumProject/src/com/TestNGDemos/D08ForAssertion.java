package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import graphql.Assert;

public class D08ForAssertion {
	@Test
	public void hardAssertionDemo() {
		System.out.println("-----------Hard Assertion -------------");
		System.out.println("Test starts");
		Assert.assertTrue(false);// Mark the test as fail
		System.out.println("Test ends");
	}
	
	@Test
	public void softAssertionDemo() {
		System.out.println("-----------Soft Assertion -------------");
		System.out.println("Test starts");

		SoftAssert a1 = new SoftAssert();
		a1.assertTrue(false);
		System.out.println("Test ends");
		a1.assertAll();
	}
}
