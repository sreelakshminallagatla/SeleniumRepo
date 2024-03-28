//###############This Program demonstrates Synchronization (Thread.sleep) (Mandatory wait time)###############
package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D19Synchronization_ThreadSleep {

	public static void main(String[] args)throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		//Source
		driver.findElement(By.id("src")).sendKeys("Kolh");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		
		
		//Target
		driver.findElement(By.id("dest")).sendKeys("Ban");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		//Date
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[7]/span[1]")).click();
		
		//Search Bus
		driver.findElement(By.id("search_button")).click();
		Thread.sleep(7000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"8331995\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		//*[@id="result-section"]/div[1]/div/div[2]/div/div[1]/div
		//Issue properties are dynamic
		driver.close();
	}
	
	

}
