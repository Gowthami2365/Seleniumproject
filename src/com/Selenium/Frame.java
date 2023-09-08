package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
	     
	     driver.get("https://demo.automationtesting.in/Frames.html");
	     driver.manage().window().maximize();
	     

	     
	  //   WebElement f1 = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
	    // driver.switchTo().frame(1);
	     driver.switchTo().frame(0);
	     
	     Thread.sleep(3000);
	     
	     WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	    
	     text.sendKeys("Harsha");
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
