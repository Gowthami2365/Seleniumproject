package com.Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Dimension d = new Dimension(400, 800);
		driver.manage().window().setSize(d);
		
		Thread.sleep(4000);
		
		Point p = new Point(300, 600);
		driver.manage().window().setPosition(p);
		
//		//tagname[@attributename = 'attribute value'] 			==> Basic X-path		1
//		//tagname[contains(@attribute name,'attriutevalue)]		==> contains attribute	3
//		//tagname[text()='full text']							==> full text			5
//		//tagname[contains(text(),'half of the text')]			==> contain text		4
//		(//tagname[@attributename = 'attributevalue'])[index]	==> Index				2
		
		
		
	}

}
