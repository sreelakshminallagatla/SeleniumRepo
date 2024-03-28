package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class D02LaunchingFirefox {

	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in/");
		driver.close();
		
	}

}
