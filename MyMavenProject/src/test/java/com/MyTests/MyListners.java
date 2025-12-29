package com.MyTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListners implements ITestListener {
	
	public void onStart(ITestContext result) {
		System.out.println("Test Started");
	}

	public void onFinish(ITestContext result) {
		System.out.println("Test Ends");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case: " + result.getName() + " failed!!!");
		System.out.println(result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case: " + result.getName() + " skipped");
		System.out.println(result.getThrowable());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test case: " + result.getName() + " started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case: " + result.getName() + " passed");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
}
