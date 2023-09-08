package com.Sel_miniProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.Selenium.myn;

public class Automation {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty(myn.a, myn.b);

		driver = new ChromeDriver();
		Actions a = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();

		WebElement Women = driver.findElement(By.xpath("//a[text()='Women']"));
		a.moveToElement(Women).perform();

		WebElement CasualDress = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
		CasualDress.click();

		WebElement Dress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		a.moveToElement(Dress).perform();

		WebElement AddCart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		AddCart.click();

		WebElement Checkout = driver.findElement(By.xpath("//span[contains(text(),'Proceed')]"));
		Checkout.click();

		Thread.sleep(3000);

		WebElement Qty = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		Qty.sendKeys("8");

		WebElement ProceedCK = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		ProceedCK.click();

//	    WebElement emailadd = driver.findElement(By.name("email_create"));
//	    emailadd.sendKeys("gowthami9850@gmail.com");
//	    
//	    
//	    WebElement CreateAccount = driver.findElement(By.xpath("//i[@class='icon-user left']"));
//	    CreateAccount.click();
//	    
//	    WebElement mrs = driver.findElement(By.id("id_gender2"));
//	    mrs.click();
//	    
//	    WebElement Name = driver.findElement(By.name("customer_firstname"));
//	    Name.sendKeys("Gowthami");
//	    
//	    WebElement Lname = driver.findElement(By.id("customer_lastname"));
//	    Lname.sendKeys("Sekar");
//	    
//	    WebElement Password = driver.findElement(By.id("passwd"));
//	    Password.sendKeys("@123Virat");
//	    
//	    WebElement Date = driver.findElement(By.id("days"));
//	    Select s = new Select(Date);
//	    s.selectByIndex(10);
//	    
//	    WebElement Months = driver.findElement(By.id("months"));
//	    Select m = new Select(Months);
//	    s.selectByIndex(9);
//	    
//	    WebElement years = driver.findElement(By.id("years"));
//	    Select y = new Select(years);
//	    y.selectByVisibleText("1999");
//	    
//	    WebElement company = driver.findElement(By.id("company"));
//	    company.sendKeys("Cpagem");
//	        
//	    WebElement Address = driver.findElement(By.id("address1"));
//	    Address.sendKeys("VADAPALANI");
//	    
//	    WebElement city = driver.findElement(By.id("city"));
//	    city.sendKeys("CHENNAI");
//	    
//	    WebElement state = driver.findElement(By.id("id_state"));
//	    Select t = new Select(state);
//	    t.selectByVisibleText("Arkansas");
//	    
//	    WebElement postcode = driver.findElement(By.id("postcode"));
//	    postcode.sendKeys("00000");
//	    
//	    WebElement country = driver.findElement(By.id("id_country"));
//	    Select c = new Select(country);
//	    c.selectByVisibleText("United States");
//	    
//	    WebElement MB = driver.findElement(By.id("phone_mobile"));
//	    MB.sendKeys("1234567890");	
//	    
//	    WebElement alais = driver.findElement(By.id("alias"));
//	    alais.sendKeys("Chennai");
//	    
//	    WebElement Register = driver.findElement(By.xpath("//span[text()='Register']"));
//	    Register.click();
//	    

		WebElement SEmail = driver.findElement(By.id("email"));
		SEmail.sendKeys("gowthami9850@gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("@123Virat");

		WebElement Signin = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		Signin.click();

		WebElement checkout = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		checkout.click();

		WebElement cgv = driver.findElement(By.id("cgv"));
		cgv.click();

		WebElement PC = driver.findElement(By.xpath("(//span[contains(text(),'Proceed')])[2]"));
		PC.click();

		WebElement PayCheque = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		PayCheque.click();

		WebElement OrderConfirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		OrderConfirm.click();

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,400)");

		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\TakesScreenshot\\E2.png");
		FileUtils.copyFile(source, desti);
    	
		
		driver.close();
	}
}
