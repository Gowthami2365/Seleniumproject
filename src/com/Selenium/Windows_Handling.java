package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
	private static void robot() throws AWTException {
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Actions a = new Actions(driver);
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement grocery = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]"));
		
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
	    a.contextClick(grocery).build().perform();
	    robot();
//		r.keyPress(KeyEvent.VK_WINDOWS);
//		r.keyPress(KeyEvent.VK_PRINTSCREEN);
//		r.keyRelease(KeyEvent.VK_PRINTSCREEN);
//		r.keyRelease(KeyEvent.VK_WINDOWS);
		Thread.sleep(3000);
		
		WebElement mobiles = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		a.contextClick(mobiles).build().perform();
		robot();
		
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
		
		WebElement travel = driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]"));
		a.contextClick(travel).build().perform();
	    robot();
		              
		Thread.sleep(3000);
		
		
		Set<String> handles = driver.getWindowHandles();
			
		String Grocery = "Flipkart Grocery Store";
		
		for (String Titles : handles) {
			System.out.println(driver.switchTo().window(Titles).getTitle());
				
			if (driver.switchTo().window(Titles).getTitle().contains(Grocery)) {
				
				continue;			
			} 
			
			else {
				driver.close();			}
			
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//#THIS IS TO SWITCH TAB INSIDE
//		List<String> handle = new ArrayList<String>(title);
//		String parent = handle.get(0);
//		String child = handle.get(1);
//		String child1 = handle.get(2);
//		String child2 = handle.get(3);
//		
//		System.out.println(parent+" "+driver.switchTo().window(parent).getTitle());
//		System.out.println(child+" "+driver.switchTo().window(child).getTitle());
//		System.out.println(child1+" "+driver.switchTo().window(child1).getTitle());
//		System.out.println(child2+" "+driver.switchTo().window(child2).getTitle());
		//driver.switchTo().window(child1);
		
		
		//for (String Total_title : handle) {
			//System.out.println(Total_title);
				
		//System.out.println(driver.switchTo().window(Total_title).getTitle());
	}
		
		//driver.switchTo().window("9B1E4572AB2382BB148E63BA9EBF3D21");
		
		//String id ="Mobile Phones Online at Best Prices in India";
		
		//driver.switchTo().window(id);
		
		//String s = ("Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com");
	
//		for (String string : handle) {
//			
//			System.out.println(driver.switchTo().window(string).getTitle()+" "+string);
//			
//		}
				
		//THIS IS USED TO OPEN & CLOSE A SINGLE TAB.
		
//		for (String string : handle) {
//			
//			if (driver.switchTo().window(string).getTitle().equals(s)) {
//				driver.close();
//				
//			} 
//			else {
//				//driver.close();
//
//			}		
//		}
		
		
		//THIS IS JUST TO GET NAME IS CONSOLE.
//		for (String travell : handle) {
//			
//			if(driver.switchTo().window(travell).getTitle().equalsIgnoreCase(s)) {
//				System.out.println("============================================================");
//				System.out.println(driver.switchTo().window(travell).getTitle());		
		}
		
	
	

