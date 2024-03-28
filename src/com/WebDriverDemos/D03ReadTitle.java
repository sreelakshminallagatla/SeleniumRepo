package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {
		String expTitle = "Online Shopping Site for Fashion, Electronics, Home & More | Meesho",actTitle;
		WebDriver driver = new EdgeDriver();// opening Edge browser
		driver.manage().window().maximize();
		
		driver.get("https://www.meesho.com/");
		 actTitle=driver.getTitle();
		System.out.println("Title is:===> "+actTitle);
		
		if(expTitle.equals(actTitle))
		{
			System.out.println("Title matching !!! Test Case Pass");
		}
			else
			{
				System.out.println("Title matching !!! Test Case Fail");
			}
		if(actTitle.contains("Meesho"))
		{
			System.out.println("Title matching !!! Test Case Pass");
		}
		else
		{
			System.out.println("Title matching !!! Test Case Fail");
		}
		
			
				
		
		
		
		driver.close();
	}

}
