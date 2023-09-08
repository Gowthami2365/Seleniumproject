package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selDay1 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", //MAP*******
	"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); //UPCASTING*******
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.facebook.com/");
	WebElement Create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	Create.click();
	
	

	
	Thread.sleep(3000);
	
	WebElement fname = driver.findElement(By.name("firstname"));
	fname.sendKeys("jegath");
	
	WebElement lname = driver.findElement(By.name("lastname"));
	lname.sendKeys("Rakshgan");
	
	
	/*driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	System.out.println("Completed");
	Thread.sleep(3000);
	driver.close();*/
	
	
	System.out.println("==========================================");
	//System.out.println(driver.getCurrentUrl());
	System.out.println("=================================================");
	//System.out.println(driver.getTitle());
		
	}

}
