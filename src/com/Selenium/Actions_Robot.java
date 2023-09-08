package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_Robot {
	
	 public static void main(String[] args) throws AWTException, InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", 
		 "C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
	     Actions a = new Actions(driver);
		 
		 Robot r = new Robot();
		 
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		 WebElement x = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		 x.click();
		 
		 WebElement Grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		 a.contextClick(Grocery).build().perform();
		 
		 Thread.sleep(2000);
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 WebElement Mobiles = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		 a.contextClick(Mobiles).build().perform();
		 
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		System.out.println("G Jegath \nGowthami\nGuru");
	
	 
	 
	  }
}
