package com.ToolsQA.Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewRegistration {
	public static WebDriver driver;
  @Test
  /*****************************************************
   * It won't work because for the registration it is asking CAPTCHA Selenium won't support
   */
  public void OpenURL() {
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
  @Test
  public void RegistrationForm() {
	  driver.findElement(By.id("newUser")).click();
	  driver.findElement(By.id("firstname")).sendKeys("Narendra");
	  driver.findElement(By.id("lastname")).sendKeys("Balla");
	  driver.findElement(By.id("userName")).sendKeys("BNarendra");
	  driver.findElement(By.id("password")).sendKeys("Passw0rd@");
	  driver.manage().timeouts().getImplicitWaitTimeout();
	  driver.findElement(By.xpath("//span[@id='recaptcha-anchor']/div[1]")).click();
	  System.err.println("Hiiii");
	  driver.findElement(By.id("register")).click();

  }
}
