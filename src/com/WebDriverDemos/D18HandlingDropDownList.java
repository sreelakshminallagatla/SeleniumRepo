package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingDropDownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries  = new Select(drpList);
		System.out.println("Selected country is ===>"+countries.getFirstSelectedOption().getText());
		List<WebElement>countryList =countries.getOptions();
		System.out.println("Total Countries: "+countryList.size());
		
		//for(WebElement c:countryList)
		//{
			//System.out.println(c.getText());
			
			/*int i = 0;
			for(WebElement c : countryList)
			{
				System.out.println(i + ". " + c.getText());
				i++;
			}*/
			
			
			

		
	
		//countries.selectByVisibleText("Canada");
		countries.selectByValue("37");
		System.out.println("Selected country:"+countries.getFirstSelectedOption().getText());

	}
}

