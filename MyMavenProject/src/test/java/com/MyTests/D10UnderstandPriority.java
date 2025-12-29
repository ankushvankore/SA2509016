package com.MyTests;

import org.testng.annotations.Test;

public class D10UnderstandPriority {
  
  @Test(priority = 1)
  public void test2() {
	  System.out.println("Test 2");
  }
  
  @Test()
  public void test3() {
	  System.out.println("Test 3");
  }
  
  @Test
  public void test1() {
	  System.out.println("Test 1");
  }
}
