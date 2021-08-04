package org.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGCase2 {
	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse Installed Folder\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\AutomationTest\\InterviewPreparations\\src\\test\\resources\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		
	}
	
	@Test
	public void openGoogle() throws InterruptedException {
		
		driver.navigate().to("https://www.google.co.in");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	
		
	}

	@Test
	public void openBing() throws InterruptedException {
		
		driver.navigate().to("https://www.bing.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
	
		
	}
	
	@Test
	public void openYahoo() throws InterruptedException {
		
		driver.navigate().to("https://www.yahoo.in");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
	}
	
	
	
}
