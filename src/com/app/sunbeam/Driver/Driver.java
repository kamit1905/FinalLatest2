package com.app.sunbeam.Driver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.app.sunbeam.Configurations.PropertyReader;
import com.app.sunbeam.Reports.ExtentManagerLogger;

public class Driver {
	
	public static WebDriver driver;
	
	public static void initDriver() {
		String browser= new PropertyReader().getBrowserName();
		System.out.println("browser=========="+browser);
		String url = new PropertyReader().getUrl();
		System.out.println("application url=========="+url);
		driver = DriverFactory.getDriver(browser);
		DriverManager.setDriver(driver);
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get(url);
	}

}
