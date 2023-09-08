package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\driver\\chromedriver.exe");
     
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement Drop = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[5]"));
		Drop.click();
		
		WebElement box = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(box);
		s.selectByValue("1");
		s.selectByIndex(3);
		s.selectByVisibleText("Loadrunner");
	
		boolean multiple = s.isMultiple();
		System.out.println("To check isMultiple: "+multiple);
		
		System.out.println("========================================================");
		
		List<WebElement> options = s.getOptions();
		for (WebElement w1 : options) {
			System.out.println("To check get options :"+w1.getText());
		}
		
		System.out.println("========================================================");
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement w2 : allSelectedOptions) {
			System.out.println("To check allSelectedOptions :"+w2.getText());
		}
		
		System.out.println("========================================================");
		
		WebElement w3 = s.getFirstSelectedOption();
		System.out.println(w3.getText());
		
		s.deselectAll();
		
	}
	
}
