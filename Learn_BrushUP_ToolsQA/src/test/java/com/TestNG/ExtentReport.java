package com.TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
  
	//Creating ExtentReport and ExtentTest  reference values
		@AfterSuite
		public void f1() {
			ExtentReports extent=new ExtentReports();
			ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
			extent.attachReporter(spark);
			extent.createTest("Tools QA Report").log(Status.PASS,"Tools QA ");
			extent.flush();
		}


  }
