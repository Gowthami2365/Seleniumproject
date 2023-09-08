package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(3000);
		
		WebElement Fn = driver.findElement(By.name("firstname"));
		Fn.sendKeys("Harsha");
		
		WebElement Ln = driver.findElement(By.name("lastname"));
		Ln.sendKeys("Vardhini");
		
		WebElement Ph = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		Ph.sendKeys("123456789");
		
		WebElement Ps = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		Ps.sendKeys("you789");
		
		WebElement Gen = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		Gen.click();
		
		WebElement lg = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		lg.click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
