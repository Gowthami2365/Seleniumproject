package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	
	public static void main(String[] args) throws InterruptedException {
		
	
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\Driver_32_96\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.xpath("//input[@id='search']"));
		id.click();
		id.sendKeys("Edsheeran songs");
		
		WebElement search = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		search.click();
		
		Thread.sleep(3000);
		
        WebElement ed = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
		ed.click();	
		
		Thread.sleep(1000);
		
		WebElement agains = driver.findElement(By.xpath("//input[@id='search']"));
		agains.clear(); //s - search
		
		WebElement news = driver.findElement(By.xpath("//input[@id='search']"));
		news.sendKeys("GVP Songs");
		
		Thread.sleep(3000);
		
		WebElement se = driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[3]"));
		se.click();
		
		Thread.sleep(3000);
		
		WebElement Gvp = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[19]"));
		Gvp.click();
		
		
		
		
		
		
	}	
}


