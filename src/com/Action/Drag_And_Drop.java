package com.Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
//
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
//
//		driver.switchTo().frame(frame1);
//		WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
//
//		WebElement drop = driver.findElement(By.id("trash"));

		Actions ac = new Actions(driver);

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));

		ac.moveToElement(email).build().perform();

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);

		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);

		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);

		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);

		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);

		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		System.out.println("DONE");

	}
}
