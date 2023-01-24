package com.TestNG;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	@Test(priority = 1)
	public void LoginCreditials()
	{
		BeforeTestMethod dtm=new BeforeTestMethod();
		dtm.driver.manage().timeouts().getImplicitWaitTimeout();
		dtm.driver.findElement(By.id("userName")).sendKeys("Bnarendra");
		dtm.driver.findElement(By.id("password")).sendKeys("Passw0rd!");
		dtm.driver.findElement(By.id("login")).click();
		System.out.println("Login Successfully");
	}
}
