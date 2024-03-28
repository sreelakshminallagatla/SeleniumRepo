package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D08KeywordDrivenFramework {
	WebDriver driver;
	String fPath = "C:\\Users\\sreel\\OneDrive\\Documents\\StarAgile\\SA2312016_sree_demo\\SeleniumDemos\\MyAutomationProject\\src\\com\\TestNGDemos\\MyData.properties";
	File file;
	FileInputStream fis;
	Properties prop;
	
	@Test
	public void login() {
		
		driver.findElement(By.xpath(prop.getProperty("unTxBxXpath"))).sendKeys("veera");
		driver.findElement(By.name(prop.getProperty("psTxBxName"))).sendKeys("Verr123");
		driver.findElement(By.cssSelector(prop.getProperty("logBtnCss"))).click();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(driver.findElement(By.id(prop.getProperty("errMsgId"))).getText());
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);				//Load all the properties in prop object
		
		//ChromeOptions op = new ChromeOptions();
		//op.addArguments("--headless");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}