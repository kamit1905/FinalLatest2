package com.app.sunbeam.tests;
import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

import com.app.sunbeam.Driver.*;
import com.app.sunbeam.Reports.ExtentManagerLogger;
import com.app.sunbeam.Reports.ExtentReport;
import com.app.sunbeam.Utils.ScreenShotUtils;
import com.aventstack.extentreports.ExtentTest;

public class BaseTest {
	public static ExtentTest test;
	
	@BeforeSuite
	public void beforeSuite() {
		//Driver.initDriver();
		ExtentReport.initReport();
	}
	
	@BeforeClass
	public void setUp() {
		Driver.initDriver();
	}
	
	@AfterSuite
	public void afterSuite() {
		ExtentReport.flushReports();
	}
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		ExtentReport.createTest(method.getName());
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			ExtentManagerLogger.fail(result.getName(),result.getThrowable());
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			ExtentManagerLogger.pass(result.getName());
		}else {
			ExtentManagerLogger.skip(result.getName());
		}
	}
	
//	@AfterSuite
//	public void qui() {
//		DriverManager.getDriver().quit();
//	}
	

}
