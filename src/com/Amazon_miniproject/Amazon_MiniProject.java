
package com.Amazon_miniproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_MiniProject {
	
	
	public static WebDriver driver;
	
	public static void set_up() {
		
		
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\"
				+ "Chrome_Driver106\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");	
		driver.manage().window().maximize();
	}
	
	public static void Search_box() {
		
		driver.findElement(By.name("field-keywords")).sendKeys("Kids T-shirt");
        driver.findElement(By.id("nav-search-submit-button")).click();
	}
     
	public static void getall_products() throws InterruptedException {
		Thread.sleep(3000);
		List<WebElement> product = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));

		int total_size = product.size();
		System.out.println("Total no.of products" +total_size);
		
	     for (WebElement allproducts : product) {
	    	 
	    	 String ALLPRODUCTS = allproducts.getText().replaceAll("^[ |\t]*\n$","");
	    	 
	    	 System.out.println(ALLPRODUCTS);
	    	 
	    	// s.replaceAll ("^[ |\t]*\n$", "");
			   	 
		}	
		
	}
	
	
	public static void Discounted_price() {
	
		List<WebElement> Discounts = driver.findElements(By.xpath("//span[text()='(67% off)']//ancestor::div[@class='a-section a-spacing-micro puis-padding-left-micro puis-padding-right-micro']//span[@class='a-size-base-plus a-color-base']"));

		for (WebElement DIS : Discounts) {
			
			String names = DIS.getText();
			
			System.out.println(names);
		}
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		set_up();
		Search_box();
		//getall_products();	
		Discounted_price();
		
	}
}
