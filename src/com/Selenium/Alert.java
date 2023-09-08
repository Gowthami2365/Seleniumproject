package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
								//simple_Alert
		
		WebElement simple = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		simple.click();
		WebElement red = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		red.click();
		driver.switchTo().alert().accept();
		
								//Confirm_Alert
		
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		WebElement c2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		c2.click();
		driver.switchTo().alert().accept();	
		Thread.sleep(4000);
		
								//Pormpt_Alert
		
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
		WebElement c3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		c3.click();
		driver.switchTo().alert().sendKeys("Gowthami Akka");
		driver.switchTo().alert().accept();

	}

}