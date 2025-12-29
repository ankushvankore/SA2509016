package com.MyTests;

import org.testng.annotations.Test;

public class D08InvocationTimeout {
  @Test(invocationTimeOut = 2000)
  public void myTest() throws InterruptedException {
	  System.out.println("Test started");
	  
	  Thread.sleep(3000);
	  
	  System.out.println("Test ends");
  }
}
