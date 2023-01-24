package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogOut {
  @Test()
  public void LogoutApplication() {
	  BeforeTestMethod dtm=new BeforeTestMethod();
	  dtm.driver.findElement(By.id("gotoStore")).click();
	  System.out.println("Go to the Book stores");

  }
}
 