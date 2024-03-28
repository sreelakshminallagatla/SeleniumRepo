package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		driver.close();
		System.out.println("After Test");
	}
	
	@Test(priority = 3)
	public void openMyntra() {
		driver.get("https://www.myntra.com/");
		System.out.println("\tTitle: " + driver.getTitle());
	}
	@Test(priority = 2)
	public void openBewakoof() {
		driver.get("https://www.bewakoof.com/");
		System.out.println("\tTitle: " + driver.getTitle());
	}
	@Test (priority = 1)
	public void openZepto() {
		driver.get("https://www.zeptonow.com/");
		System.out.println("\tTitle: " + driver.getTitle());
	}
	@Test(priority = 4)
	public void openMeesho() {
		driver.get("https://www.meesho.com/");
		System.out.println("\tTitle: " + driver.getTitle());
	}
}