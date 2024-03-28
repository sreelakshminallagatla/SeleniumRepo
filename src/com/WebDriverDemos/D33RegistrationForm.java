package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D33RegistrationForm {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.automationbyte.com/forms/basic-form-1");
		
		//Enter First Name
		driver.findElement(By.xpath("//input[@id='urFirstname']")).sendKeys("Jack");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("David");
		driver.findElement(By.xpath("//textarea[@id='additionalInformationInput']")).sendKeys("Registration Form");
		driver.findElement(By.xpath("//*[@id=\"user-registration-form\"]/div[1]/div[3]/div[2]/label/input")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Cricket']//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//*[@id=\"user-registration-form\"]/div[2]/button[1]")).click();
		//Verify successfully registered or not
		
	}

}
