package com.TestNG;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BeforeTestMethod {
	public static WebDriver driver;
	public static WebDriverWait driverwait;
	@BeforeSuite
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.ChromeDriver","C:\\chrome.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		System.out.println("Browser is Successfully Opened");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());	
		System.out.println(driver.getPageSource());
		System.out.println(driver.getPageSource().length());
	}
}
