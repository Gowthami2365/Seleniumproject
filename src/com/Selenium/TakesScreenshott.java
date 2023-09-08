package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshott {
	
	public static void main(String[] args) throws IOException  {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement Fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Fashion.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver; 
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\TakesScreenshot\\A2.png");
		FileUtils.copyFile(source, desti);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
//		TakesScreenshot ts =(TakesScreenshot)driver;	// Narrowing T_C
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\TakesScreenshot\\A1.png");
//		FileUtils.copyFile(source, destination);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
