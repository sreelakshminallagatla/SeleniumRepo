package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A03echoechoAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echoecho.com");
		WebElement tLink = driver.findElement(By.linkText("Tutorials"));
		tLink.click();
		
		WebElement hLink = driver.findElement(By.linkText("HTML"));
		hLink.click();

	}

}
