package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05AmazonTest {
	WebDriver driver;
	
	@Test(priority = 1)
	public void clickOnBestSellers() {
		driver.findElement(By.partialLinkText("Best")).click();
	}
	@Test(priority = 2)
	public void clickOnMobiles() {
		driver.findElement(By.partialLinkText("Mobile")).click();
	}
	@Test(priority = 3)
	public void clickOnTodaysDeal() {
		driver.findElement(By.partialLinkText("Today")).click();
	}
	@Test(priority = 4)
	public void clickOnElectronics() {
		driver.findElement(By.partialLinkText("Electr")).click();
	}

	@BeforeMethod
	public void openAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod
	public void printTitle() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}