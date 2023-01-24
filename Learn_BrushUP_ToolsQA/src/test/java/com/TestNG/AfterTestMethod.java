package com.TestNG;

import org.testng.annotations.AfterSuite;

public class AfterTestMethod {
  @AfterSuite(enabled=false)
  public void closeBrowser()
		{
	  		BeforeTestMethod dtm=new BeforeTestMethod();
			dtm.driver.close();
			dtm.driver.quit();
			System.out.println("Browser is successfully closed");
		}
}
