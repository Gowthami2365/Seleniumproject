
package com.Sel_miniProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GOWTHAMI\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Gowthami001");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Gowthami9850@");
		
		WebElement Login = driver.findElement(By.xpath("//input[@name='login']"));
		Login.click();
		
		WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(Location);
		s.selectByVisibleText("London");
		
		WebElement Hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select f = new Select (Hotels);
		f.selectByIndex(4);
		
		WebElement Room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select g = new Select (Room);
		g.selectByValue("Super Deluxe");
		
		Thread.sleep(5000);
		
		WebElement nosRoom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select o = new Select (nosRoom);
		o.selectByValue("3");
		
		WebElement Datein = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		Datein.sendKeys("02/10/22");
		
		WebElement DateOut = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		DateOut.sendKeys("06/10/22");
		
		WebElement Adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select h = new Select (Adult);
		h.selectByIndex(2);
		
		WebElement Child = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select k = new Select (Child);
		k.selectByIndex(2);
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		
		WebElement Radiobutton = driver.findElement(By.id("radiobutton_0"));
		Radiobutton.click();
		
		WebElement Continue = driver.findElement(By.name("continue"));
		Continue.click();
		
		WebElement Firstname = driver.findElement(By.name("first_name"));
		Firstname.sendKeys("Gowthami");
		
		WebElement Lastname = driver.findElement(By.name("last_name"));
		Lastname.sendKeys("Sekar");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("18,Vadapalani,Chennai");
		
		WebElement Billing = driver.findElement(By.name("cc_num"));
		Billing.sendKeys("1234567891011121");
		
		WebElement Creditcard = driver.findElement(By.name("cc_type"));
		Select a = new Select (Creditcard);
		a.selectByIndex(3);
		
		WebElement expireddate = driver.findElement(By.name("cc_exp_month"));
		Select l = new Select (expireddate);
		l.selectByIndex(1);
		
		WebElement expireyear = driver.findElement(By.name("cc_exp_year"));
		Select b = new Select (expireyear);
		b.selectByIndex(6);
		
		WebElement ccv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		ccv.sendKeys("1234");
		
		WebElement booknow = driver.findElement(By.xpath("//input[@type=\'button\']"));
		booknow.click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\TakesScreenshot\\E1.png");
		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.xpath("//input[@name='logout']")).click();
	
		
		
		// JAVA SCRIPT EXECUTOR ==>
//		JavascriptExecutor r =(JavascriptExecutor)driver;
//		r.executeScript("window.scroll(0,400)");

	
		
	}
	

}
 