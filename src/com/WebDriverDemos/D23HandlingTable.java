
package com.WebDriverDemos;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class D23HandlingTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//List<WebElement>headers = driver.findElements(By.tagName("th"));
		List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		for(WebElement h : headers)
			System.out.println(h.getText());
		
		List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total Rows: " + rows.size());
		for(WebElement r : rows)
			//System.out.println(r.getText());
		//driver.findElement(By.linkText(rows.get(1).getText())).click();
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
	
		System.out.println(rows.get(1).getText());
		String st=rows.get(1).getText();
		System.out.println(st);
		 Thread.sleep(5000);
		
		String st1= driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[1]/a")).getText();
		System.out.println(st1);
		
		driver.findElement(By.linkText(st1)).click();
		
		//driver.close();
	}
	
}