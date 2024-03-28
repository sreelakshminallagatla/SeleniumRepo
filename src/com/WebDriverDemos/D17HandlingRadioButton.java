package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement genderF = driver.findElement(By.xpath("//input[@value='f']"));
		
		System.out.println("Before");
		System.out.println("Visible:"+genderF.isSelected());
		System.out.println("Visible:"+genderF.isDisplayed());
		System.out.println("Visible:"+genderF.isEnabled());
		
		genderF.click();
		
		System.out.println("\n After");
		System.out.println("Visible:"+genderF.isSelected());
		System.out.println("Visible:"+genderF.isDisplayed());
		System.out.println("Visible:"+genderF.isEnabled());
		
		

	}

}
