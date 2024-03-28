package com.InsuranceProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC01Automobile_Silver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		
		driver.findElement(By.partialLinkText("Auto")).click();
		
		//Enter Vehicle Data
		
		new Select(driver.findElement(By.id("make"))).selectByIndex(1);
		driver.findElement(By.id("engineperformance")).sendKeys("1000");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("03/09/2024");
		new Select(driver.findElement(By.id("numberofseats"))).selectByIndex(2);
		new Select(driver.findElement(By.id("fuel"))).selectByIndex(2);
		driver.findElement(By.id("listprice")).sendKeys("1000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("MH09GF1246");
		driver.findElement(By.id("annualmileage")).sendKeys("1000");
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//Enter Insurent Data
		
		
		//Select Price Options
		System.out.println("Checking Automobile -> Silver Price Options");
		String expPrice = "222.00", actPrice, expClaim = "No", actClaim, expDis = "No", actDis, expCover = "No", actCover;
		
		actPrice = driver.findElement(By.id("selectsilver_price")).getText();
		
		if(expPrice.equals(actPrice))
			System.out.println("Price Matching");
		else
			System.out.println("Price is not Matching");
		
		driver.findElement(By.id("selectsilver")).click();
	}

}

