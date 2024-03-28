
package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class D22Synchronization_FluentWait {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Source
		driver.findElement(By.id("src")).sendKeys("Kolh");
		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
		
		//Target
		
		driver.findElement(By.id("dest")).sendKeys("Ban");
		wait.withTimeout(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.pollingEvery(Duration.ofMillis(1))
		.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text"))).click();		
		
		//driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		//Date
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[7]/span[1]")).click();
		
		driver.findElement(By.id("search_button")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"result-section\"]/div[1]/div/div[2]/div/div[1]/div")).getText());
		
		driver.close();
	}

}