package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Open blank browser
		driver.manage().window().maximize();
		//Maximize the browser
		driver.get("https://www.google.co.in/");
		//open the URL
		driver.close();
		/* Create java project with module checkbox off and Java 11 or 17
		/* Right click on Project Name->
		 * Build Path -> configure Build Path-> 
		 * Libraries -> Click on Class Path->
		 * Click on -> Add External Libraries ->
		 * Select the folder Selenium Jar Files ->
		 * Select the file selenium Server 4.18.1 ->
		 * Open -> Apply and Close
		 */
	}

}
