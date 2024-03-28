package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class S05AmazonTest {
	WebDriver driver;
  @Test(priority =1, groups = "FirstGroup")
  public void clickonBestSellers(){
	  
	  driver.findElement(By.partialLinkText("Best")).click();
  }
  @Test(priority =2, groups ="Gadgets")
  public void clickonMobiles() {
	  driver.findElement(By.partialLinkText("Mobile")).click();
  }
  
  @Test(priority =3,groups ="FirstGroup")
  public void clickonTodaysDeal()
  {
	  driver.findElement(By.partialLinkText("Today")).click();
  }
  
  @Test(priority = 4,groups = "Gadgets")
  public void clickonElectronics() {
	  driver.findElement(By.partialLinkText("Electr")).click();
  }
  
  @BeforeMethod(alwaysRun = true)
  public void openAmazon(){
	  driver.get("https://www.amazon.in/");
	  System.out.println("Title:"+driver.getTitle());
	  
	  
  }
  @AfterMethod(alwaysRun = true)
  public void printTitle() {
	  System.out.println("Title:"+driver.getTitle());
	  
  }
  @BeforeTest(alwaysRun=true)
  public void openbrowser()
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  @AfterTest(alwaysRun=true)
  public void closeBrowser()
  {
	  driver.close();
  }
}
