package PageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.SearchGooglePage;
import PageObject.SeleniumWebDriver;

public class Main_Search{
	
	static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception{
	GoogleSearch();
	SeleniumP();
}
	@SuppressWarnings("deprecation")
	public static void GoogleSearch() throws InterruptedException{
		
		/*FileInputStream file =  new FileInputStream("C:/Users/User/Documents/MyFirstProject/My_SELProject/src/test/java/test/Config.properties");
		Properties prop =  new Properties();
		prop.load(file);
		String driverpath= prop.getProperty("driverpath");
		String url = prop.getProperty("url");*/
		
		System.setProperty("webdriver.chrome.driver", "/Users/User/Downloads/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//System.out.println(driverpath);
		//System.out.println(url);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		SearchGooglePage.textbox(driver).sendKeys("Selenium");
		SearchGooglePage.buttons(driver).click();
		Thread.sleep(5000);
		//driver.navigate().back();
		//driver.close();
	
	}
public static void SeleniumP() throws InterruptedException {
		
		SeleniumWebDriver.sel(driver).click();
		Thread.sleep(5000);
		Scrolldown_up();
		SeleniumWebDriver.download_button(driver).click();
		Thread.sleep(5000);
		Scrolldown();
		SeleniumWebDriver.download_Java_Webdriver(driver).click();	
		
	} 
	public static void Scrolldown_up() throws InterruptedException {
		
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(5000);
		jsx.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(5000);
		//jsx.executeScript("window.scrollBy(0,-1000);");
		//Thread.sleep(5000);
		
	}
	public static void Scrolldown() throws InterruptedException{
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(5000);
		
	}
	
}
