package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D19Synchronization_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		
		//From
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[1]/div[1]/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("srcDest")).sendKeys("Kolh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();
		
		//To
		//driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[2]/div/div/div[1]")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Ban");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/div/div/div")).click();
		
		//Calender Icon
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[3]/div[1]/i")).click();
		
		//Select Date
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[31]/div/div/span")).click();
		
		//Click on Search Bus
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/search/div/div/button")).click();
		
		//Display the bus
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"42628206\"]/div[2]/div[3]/div/div[1]/div[1]")).getText());
		
		driver.close();
	}

}
