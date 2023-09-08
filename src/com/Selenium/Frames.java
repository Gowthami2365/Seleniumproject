package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement sg = driver.findElement(By.xpath("//a[@class='analystic'][1]"));
		sg.click();
		
		WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(singleframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//input[@type='text'][1]"));
		innerframe.sendKeys("Gowthami");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		WebElement multiframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multiframe.click();
		
		WebElement Parentframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(2);
		
		WebElement childframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		
		WebElement FN = driver.findElement(By.xpath("//input[@type='text']"));
		FN.click();
		FN.sendKeys("Harsha");
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																													
		
//									Single Frame
		
//		WebElement single_frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
//		driver.switchTo().frame(single_frame);
//		
//		WebElement data = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		data.sendKeys("Gowthami");
//		
//		Thread.sleep(3000);
//		
//		driver.switchTo().defaultContent();
//		
////					Multiple Frame
//		
//		WebElement Multiframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		Multiframe.click();
//		
//		WebElement Mparentframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
//	    driver.switchTo().frame(Mparentframe);
//	    
//	    WebElement Mchildframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
//	    driver.switchTo().frame(Mchildframe);
//	    
//	    WebElement inputdata = driver.findElement(By.xpath("(//input[@type='text'])"));
//	    inputdata.sendKeys("Gowthami");
//	    
//	    driver.switchTo().defaultContent();
	    
	    
	    
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
