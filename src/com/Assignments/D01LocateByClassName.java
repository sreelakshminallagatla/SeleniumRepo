package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LocateByClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//*Launching Echotrak application
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement eName = driver.findElement(By.name("txtCustomerID"));
		eName.sendKeys("SreeLakshmi");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("12345678");
		
		WebElement loginBtn = driver.findElement(By.name("Butsub"));
		loginBtn.click();
		
		//driver.close();
	}

}
