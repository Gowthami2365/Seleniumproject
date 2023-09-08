package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver_96\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		//WebElement helmet = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[7]/div/div/div/div/a/div[2]/span "));
		//helmet.click();
		
		//WebElement spain = driver.findElement(By.xpath("/html/body/div/div[5]/div[4]/ul/li[13]/a"));
		//spain.click();
		
		WebElement sellonamazon = driver.findElement(By.xpath("/html/body/div/div[5]/div/div/div[5]/ul/li/a"));
	    sellonamazon.click();		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


