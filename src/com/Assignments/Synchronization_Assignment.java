package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Synchronization_Assignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
        driver.get("https://dash.bling-center.com/platform/signIn.html");
        //driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
        //driver.findElement(By.id("password")).sendKeys("123456");
        //driver.findElement(By.("signIn-btn main-signIn-btn"))
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[5]/button/p")).click();
        driver.findElement(By.id("email1")).sendKeys("test123@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/button[2]")).click();
        Thread.sleep(5000);
        String st=driver.findElement(By.xpath("//*[@id=\"resetsuccess\"]")).getText();
        System.out.println(st);
        //System.out.println(driver.findElement(By.xpath("//*[@id="resetsuccess"]")).getText());
      //*[@id="resetsuccess"]	
     
        

	}
}
