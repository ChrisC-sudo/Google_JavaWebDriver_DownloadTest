package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumWebDriver {
	static WebElement element = null;
	
	public static WebElement sel(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		return element;
	}
	
	public static WebElement download_button(WebDriver driver) {
		element = driver.findElement(By.linkText("Downloads"));
		return element;
	
	}
	public static WebElement download_Java_Webdriver(WebDriver driver) {
		element = driver.findElement(By.linkText("4.1.0 (November 23, 2021)"));
		return element;
	}
	
}
