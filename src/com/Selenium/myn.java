package com.Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myn {
	
	static WebDriver driver;
	public static String a ="webdriver.chrome.driver";
	public static String b="C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\Chrome_Driver106\\chromedriver.exe";
	
	private static void Launch() {
		
		System.setProperty(a, b);
	    driver = new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();
	}
	
	private static void AllProducts() {
		
	List<WebElement> Products = driver.findElements(By.xpath("//li[@class='product-base']"));
	for (WebElement Product: Products) {
		System.out.println(Product.getText());
		
	}
	
	System.out.println(Products.size());
	

	}
	
	
	private static void Minimumvalue() {
		
		List<Integer> totalValues = new ArrayList<Integer>();
		
		List<WebElement> values = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	for (WebElement minimumvalues : values) {
		System.out.println(minimumvalues.getText());
		Integer valueOf = Integer.valueOf(minimumvalues.getText().replace("Rs. ",""));
		totalValues.add(valueOf);
	}
	System.out.println("minimum "+Collections.min(totalValues));
			
		
		}
	public static void main(String[] args) {
		Launch();
		AllProducts();
		Minimumvalue(); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
