package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D21Synchronization_ExplictWait {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.redbus.in/");
		
		//Source
		driver.findElement(By.id("src")).sendKeys("Kolh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
		
		//Target
		driver.findElement(By.id("dest")).sendKeys("Ban");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text"))).click();
		//driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		
		//Calender
		//driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"onwardCal\"]/div/i"))).click();
		//Date
		//driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[7]/span[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[7]/span[1]"))).click();
		//Search Bus
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search_button"))).click();
		//driver.findElement(By.id("search_button")).click();
		
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"8331995\"]/div/div[1]/div[1]/div[1]/div[1]"))).getText());
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"8331995\"]/div/div[1]/div[1]/div[1]/div[1]"))).getText();
		//*[@id="8331995"]/div/div[1]/div[1]/div[1]/div[1]
		//*[@id="mBWrapper"]/section/div[2]/h1
		driver.close();
	}

}
		




