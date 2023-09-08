package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Practicec {
	
	
	public static void main (String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\Driver_32_96\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email")); //Written Type
		user.sendKeys("gowthami");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.myntra.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
