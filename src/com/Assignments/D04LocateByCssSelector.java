package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04LocateByCssSelector {

	public static void main(String[] args) {
		
		String expMsg="Invalid Username/Password";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		;
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		//WebElement uName = driver.findElement(By.cssSelector("#txtCustomerID"));
		WebElement uName = driver.findElement(By.cssSelector("input[placeholder=\"Username\"]"));
		uName.sendKeys("uName");
		
		//WebElement password = driver.findElement(By.cssSelector("#txtPassword"));
		WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"]"));
		password.sendKeys("pass");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		loginBtn.click();
		
				
		WebElement errMsg = driver.findElement(By.id("lblMsg"));
		String msg=errMsg.getText();
		System.out.println("Error Message is ===>>"+msg);
		
		if(msg.equals(expMsg))
			System.out.println("Correct Message \n Test Case Pass");
		else
			System.out.println("Correct Message \n Test Case Fail");
        driver.close();
	}

}
