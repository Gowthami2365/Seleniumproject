package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();	
		
		Thread.sleep(4000);
		
		WebElement fn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fn.sendKeys("Gowthami");
		
		WebElement ln = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		ln.sendKeys("Sekar");
		
		WebElement no = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		no.sendKeys("123456789");
		
		WebElement ps = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		ps.sendKeys("Gowthami@12345");
		
		
		WebElement Date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Date.click();
		Select s = new Select(Date);
		s.selectByValue("9");
		//s.deselectByValue("9");
		
		WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Month.click();
		Select m = new Select(Month);
		m.selectByValue("8");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		year.click();
		Select y = new Select(year);
		y.selectByValue("1999");
		
		WebElement sex = driver.findElement(By.name("sex"));
		sex.click();
		
		WebElement lg = driver.findElement(By.name("websubmit"));
		lg.click();		
		
		
		
		
		
		
		
		
		
	
		/*driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
	    WebElement DropD = driver.findElement(By.xpath("//img[@alt='ListBox']"));
	    DropD.click();
	    
	    
	    			// SelectByValue()
	    			// SelectByIndex()
	    			// SelectByVisibleText()
	    
	    
	    WebElement scrolldown = driver.findElement(By.xpath("(//select)[6]"));
	    Select s = new Select(scrolldown);
	    s.selectByValue("1");
	    s.selectByIndex(4);
	    s.selectByVisibleText("Appium");
	    
	    Thread.sleep(3000);
	    
	    s.deselectByValue("1");
	    */
	
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
