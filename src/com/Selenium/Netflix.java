package com.Selenium;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Netflix {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver_96\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		
		WebElement Sg = driver.findElement(By.xpath("//a[@data-uia='header-login-link']"));
		Sg.click();
	    
		
		Thread.sleep(3000);
		
		WebElement Em = driver.findElement(By.name("userLoginId"));
		Em.sendKeys("ghggg");
		
		WebElement ps = driver.findElement(By.name("password"));
		ps.sendKeys("@you1223hdkuhwh");
		
		WebElement lg = driver.findElement(By.xpath("//button[@type='submit']"));
		lg.click();	                           

		
		
		 
		
		
		
		
		
		
	}

}
