package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement Newrelease = driver.findElement(By.xpath("//a[@tabindex='0'][11]"));
		a.contextClick(Newrelease).build().perform();
	}

	// System.setProperty("webdriver.chrome.driver",
//	    "C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		Actions a = new Actions(driver);
//		
//		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01q8po7gjm6og21d93i9g34ztiz137080.node0");
//		driver.manage().window().maximize();

	// Drag_Drop

//		WebElement drag = driver.findElement(By.xpath("(//div[@class='ui-panel-titlebar ui-widget-header ui-helper-clearfix ui-corner-all'])[1]"));
//		
//		Thread.sleep(2000);
//		
//		WebElement drop = driver.findElement(By.xpath("(//div[@style='border:0px;'])[1]"));
//		
//		Thread.sleep(2000);
//		
//		a.dragAndDrop(drag, drop).build().perform();

	// Click, Move, Release

//		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
//		
//		WebElement drop = driver.findElement(By.xpath("(//span[@class='ui-panel-title'])[2]"));
//		
//		a.clickAndHold(drag);
//		a.moveToElement(drag);
//		a.release(drop).build().perform();
//		

	// Context_click (Right_click)
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		
//		WebElement T_D = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']"));
//		a.contextClick(T_D);
//		
//		WebElement best_s = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
//		a.contextClick(best_s).build().perform();	

}
