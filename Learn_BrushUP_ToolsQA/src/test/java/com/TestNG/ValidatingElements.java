package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ValidatingElements {
  @Test(priority = 2)
  public void VerifyElements() {
	  BeforeTestMethod dtm=new BeforeTestMethod();
	  dtm.driver.manage().timeouts().getImplicitWaitTimeout();
	  System.out.println("Hii - First");
	  dtm.driver.findElement(By.xpath("//div[(text()='Elements')]")).click();
	  dtm.driver.findElement(By.xpath("//div[(text()='Elements')]")).click();
	  System.out.println("Hii - Second");
	  dtm.driver.findElement(By.xpath("//div[(text()='Forms')]")).click();
	  dtm.driver.findElement(By.xpath("//div[(text()='Forms')]")).click();
	  System.out.println("Hii - Third");
	  dtm.driver.findElement(By.xpath("//div[(text()='Alerts, Frame & Windows')]")).click();
	  dtm.driver.findElement(By.xpath("//div[(text()='Alerts, Frame & Windows')]")).click();
	  System.out.println("Hii - Fourth");
	  System.out.println("Successfully verified all the elements in the application");
  }
}
