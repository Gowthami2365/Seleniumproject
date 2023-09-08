package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_webtable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver_win32 (1).zip"
				);
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	  
	 for (int i = 1; i <=5 ; i++) {
		 WebElement findElement = driver.findElement(By.xpath("/html/body/div/div[3]/div/div[2]/main/div/div/div/article/div/div/div[3]/div/div[4]/table/thead/tr/th["+i+"]"));
		System.out.println(findElement.getText());
	}
	  
	}

}
