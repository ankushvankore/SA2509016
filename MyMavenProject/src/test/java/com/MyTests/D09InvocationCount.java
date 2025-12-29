package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class D09InvocationCount {
  @Test(invocationCount = 5)
  public void myTest() {
	  System.out.println("My Test");
  }

}
