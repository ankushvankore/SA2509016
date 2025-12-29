package com.AssignmentSolutions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A25IPL_Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.iplt20.com/points-table/men/2024");
		
		List<WebElement>allTeams = driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr/td[3]/div/h2"));
		
		
		for(int i = 0; i < allTeams.size(); i++)
		{
			int n = 0, l = 0, w = 0;
			System.out.print(allTeams.get(i).getText() + "\t");
			List<WebElement>result = driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr[" + (i+1) + "]/td[12]/div/span"));
			for(WebElement r : result)
			{
				System.out.print(r.getText() + " ");
				if(r.getText().contains("N"))
					n++;
				else if(r.getText().contains("W"))
					w++;
				else if(r.getText().contains("L"))
					l++;
			}
			System.out.print("\t" + "N: " + n + " W: " + w + " L: " + l);
			System.out.println();
		}
		
		driver.close();
	}

}
