import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamics {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GOWTHAMI\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		List<Integer> a = new ArrayList<Integer>();
	
		List<WebElement> allprices = driver.findElements(By.xpath("//span[@class='product-strike']/preceding-sibling::span"));
			for (WebElement prices :allprices) {
				String replace = prices.getText().replace("Rs. ","");
				int b = Integer.parseInt(replace);
				a.add(b);
				
				
			}
	}

}
