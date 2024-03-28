package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02LocateByID {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		WebElement uName = driver.findElement(By.id("txtCustomerID"));
		uName.sendKeys("uName");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("pass");
		
		WebElement loginBtn = driver.findElement(By.id("Butsub"));
		loginBtn.click();
        //driver.close();
	}

}
