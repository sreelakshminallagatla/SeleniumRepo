package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16HandlingCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement chkBox = driver.findElement(By.cssSelector("input[name^=\"chk_alte\"]"));
		
		System.out.println("Before\n");
		System.out.println("Selected:"+chkBox.isSelected());
		System.out.println("Visible:"+chkBox.isDisplayed());
		System.out.println("Enabled:"+chkBox.isEnabled());
		
		if (chkBox.isSelected()==false)
			chkBox.click();
		
		System.out.println("\n After\n");
		System.out.println("Selected:"+chkBox.isSelected());
		System.out.println("Visible:"+chkBox.isDisplayed());
		System.out.println("Enabled:"+chkBox.isEnabled());
		//driver.close();
		
		
		
		
		

	}

}
