package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestNGCase1 {
	
/*	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Installed Folder\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\AutomationTest\\InterviewPreparations\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		
	}*/
	
	@Test
	public void openGoogle() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Installed Folder\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\AutomationTest\\InterviewPreparations\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://en.wikipedia.org/wiki/Wikipedia");
		WebElement firstScrollElement = driver.findElement(By.id("Launch_and_early_growth"));
		WebElement secondScrollElement = driver.findElement(By.id("Methods_of_access"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", firstScrollElement);
		js.executeScript("arguments[0].scrollIntoView();", secondScrollElement);
		js.executeScript("arguments[0].scrollIntoView();", firstScrollElement);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		Actions ac = new Actions(driver);
		ac.
		
	
		
	}

	@Test(enabled=false)
	public void openBing() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Installed Folder\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\AutomationTest\\InterviewPreparations\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.bing.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	
		
	}
	
	@Test(enabled=false)
	public void openYahoo() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Installed Folder\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\AutomationTest\\InterviewPreparations\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.yahoo.in");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
	}
	
	public void closeBrowser() {
		
		
	}
	
	
	
}
